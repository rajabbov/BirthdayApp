# 🎂 BirthdayApp — Birthday Reminder & Notification Manager

> A lightweight, privacy-conscious Android utility designed to store important anniversaries and automatically trigger system push notifications when a birthday arrives.

![Kotlin](https://img.shields.io/badge/Kotlin-2.0-blue?logo=kotlin&logoColor=white)
![Android SDK](https://img.shields.io/badge/Android-SDK_35-green?logo=android&logoColor=white)
![Storage](https://img.shields.io/badge/Storage-Offline_First-purple)
![Notifications](https://img.shields.io/badge/Android_O-NotificationChannel-red)

---

## 💡 What Makes BirthdayApp Useful?

Forgetting birthdays of family members or friends is easy. **BirthdayApp** solves this problem locally on your Android device without requiring external cloud accounts, telemetry, or internet access.

### 🌟 Feature Matrix

| 📅 Smart Calendar Matching | 🔔 System Push Notifications |
| :--- | :--- |
| Uses `java.util.Calendar` to compare current date (`day` & `month`) against stored contacts every time the app launches. | Dispatches native Android notifications via `NotificationChannel` with personal greetings. |
| **💾 Zero-Cloud / Offline-First** | **⚡ Fast & Ultra-Lightweight** |
| Birthdays are serialized into `JSON` and stored securely inside private `SharedPreferences`. No personal data leaves the device. | Native Kotlin architecture ensures near-zero battery usage and instant app startup time. |

---

## ⚙️ How It Works (Data Pipeline)

```
[ User Input ]
   (Name, Day, Month, Year)
            │
            ▼
[ JSON Serialization ]
   {"name": "...", "day": ..., "month": ..., "year": ...}
            │
            ▼
[ SharedPreferences Storage ]  <─── Local & Encrypted app sandbox
            │
            ▼
[ Date Evaluator (Calendar API) ]
   Matches (todayDay == storedDay && todayMonth == storedMonth)
            │
            ▼
[ NotificationManager Dispatch ] ──► Status Bar Alert: "Happy Birthday, [Name]!"
```

---

## 🔍 Under The Hood: Notification Implementation

The app complies with Android 8.0+ (Oreo) notification standards by creating dedicated notification channels:

```kotlin
val channel = NotificationChannel(
    "birthday_channel",
    "Birthday Notifications",
    NotificationManager.IMPORTANCE_DEFAULT
)
notificationManager.createNotificationChannel(channel)

val notification = NotificationCompat.Builder(this, "birthday_channel")
    .setSmallIcon(R.drawable.ic_launcher_foreground)
    .setContentTitle(title)
    .setContentText(message)
    .setAutoCancel(true)
    .build()
```

---

## 📋 Technical Specifications

- **Language:** Kotlin 2.0 (Target JVM: 11)
- **Minimum SDK:** Android 7.0 (API level 24)
- **Target SDK:** Android 15 (API level 35)
- **Storage Layer:** Android `SharedPreferences` with `org.json.JSONArray`
- **Notification Services:** `NotificationManager` & `NotificationCompat.Builder`
- **UI Architecture:** Clean Android XML layout with input validation

---

## 🛠 Getting Started

### Clone & Build
```bash
# 1. Clone the project
git clone https://github.com/ibrohim2005rajabboyev/BirthdayApp.git

# 2. Open in Android Studio
# Open Android Studio -> Select "Open..." -> Choose the cloned BirthdayApp directory

# 3. Build & Run
# Select your device or emulator and press 'Run' (Shift + F10)
```

---

## 👨‍💻 Developer

**Ibrohimjon Rajabboyev**  
Mobile Application Developer • Android • Kotlin • Flutter  
GitHub: [@ibrohim2005rajabboyev](https://github.com/ibrohim2005rajabboyev)
