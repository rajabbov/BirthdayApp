package com.example.happybirthday

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import org.json.JSONArray
import org.json.JSONObject
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etDay: EditText
    private lateinit var etMonth: EditText
    private lateinit var etYear: EditText
    private lateinit var tvMessage: TextView
    private lateinit var btnAdd: Button

    private val sharedPreferences by lazy { getSharedPreferences("birthdays", MODE_PRIVATE) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etDay = findViewById(R.id.etDay)
        etMonth = findViewById(R.id.etMonth)
        etYear = findViewById(R.id.etYear)
        tvMessage = findViewById(R.id.tvMessage)
        btnAdd = findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {
            addBirthday()
        }

        checkBirthdays()
    }

    private fun addBirthday() {
        val name = etName.text.toString().trim()
        val day = etDay.text.toString().toIntOrNull() ?: return
        val month = etMonth.text.toString().toIntOrNull() ?: return
        val year = etYear.text.toString().toIntOrNull() ?: return

        if (name.isNotEmpty() && day in 1..31 && month in 1..12) {
            val newBirthday = JSONObject().apply {
                put("name", name)
                put("day", day)
                put("month", month)
                put("year", year)
            }

            val birthdays = getBirthdays()
            birthdays.put(newBirthday)
            saveBirthdays(birthdays)

            tvMessage.text = "Qo'shildi: $name - $day/$month/$year"
            clearInputs()
        } else {
            tvMessage.text = "Ma'lumotlarni to'g'ri kiriting."
        }
    }

    private fun checkBirthdays() {
        val calendar = Calendar.getInstance()
        val todayDay = calendar.get(Calendar.DAY_OF_MONTH)
        val todayMonth = calendar.get(Calendar.MONTH) + 1

        val birthdays = getBirthdays()
        for (i in 0 until birthdays.length()) {
            val birthday = birthdays.getJSONObject(i)
            val day = birthday.getInt("day")
            val month = birthday.getInt("month")
            val name = birthday.getString("name")

            if (day == todayDay && month == todayMonth) {
                sendNotification("Tug‘ilgan kun", "Tug‘ilgan kuningiz bilan, $name!")
            }
        }
    }

    private fun saveBirthdays(birthdays: JSONArray) {
        sharedPreferences.edit().putString("birthdays", birthdays.toString()).apply()
    }

    private fun getBirthdays(): JSONArray {
        val jsonString = sharedPreferences.getString("birthdays", null) ?: return JSONArray()
        return JSONArray(jsonString)
    }

    private fun sendNotification(title: String, message: String) {
        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val channelId = "birthday_channel"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                channelId,
                "Birthday Notifications",
                NotificationManager.IMPORTANCE_DEFAULT
            )
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(title)
            .setContentText(message)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(System.currentTimeMillis().toInt(), notification)
    }

    private fun clearInputs() {
        etName.text.clear()
        etDay.text.clear()
        etMonth.text.clear()
        etYear.text.clear()
    }
}