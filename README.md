<div align="center">

# 🎂 🎉 BirthdayApp
### *Never Miss a Smile. Never Forget a Loved One.* ✨ 🎈

<br/>

<p align="center">
  <img src="art/birthday_banner.jpg" alt="BirthdayApp Festive 3D Banner" width="100%" style="border-radius: 16px; box-shadow: 0 8px 30px rgba(0,0,0,0.15);" />
</p>

<p align="center">
  <a href="https://kotlinlang.org/"><img src="https://img.shields.io/badge/Crafted%20With-Kotlin%20%E2%9D%A4%EF%B8%8F-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin" /></a>
  <a href="https://developer.android.com/"><img src="https://img.shields.io/badge/Platform-Android%2015-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android" /></a>
  <a href="#-privacy-first"><img src="https://img.shields.io/badge/Privacy-100%25%20Offline%20%F0%9F%94%92-success?style=for-the-badge" alt="Privacy" /></a>
  <a href="#-notifications"><img src="https://img.shields.io/badge/Alerts-Native%20Push%20%F0%9F%94%94-orange?style=for-the-badge" alt="Notifications" /></a>
</p>

> 💖 *"In the rush of everyday life, we rarely forget because we don't care — we forget because life gets loud. BirthdayApp is a quiet, gentle whisper to pause, reach out, and celebrate the people who brighten your world."* 💌 ✨

</div>

---

## 🌟 Why People Fall in Love with BirthdayApp

Have you ever experienced that sudden sinking feeling when you realize you missed the birthday of your mother, a dear friend, or someone who changed your life? 🥺 

Numbers on a calendar don't matter — what matters is the chance to say: **"You are in my heart, and you matter to me."** 💐

**BirthdayApp** isn't another generic utility bloated with subscriptions, ads, or endless menus. It is an intimate, beautiful pocket companion dedicated entirely to **cherishing human connection**.

---

## 🎁 Festive & Heartfelt Highlights

| 🥳 Feature | 💖 The Experience |
| :--- | :--- |
| **🎂 A Personal Vault of Love** | Store the birthdays and anniversaries of the people who shaped your story. Mom, Dad, best friends, mentors — each treated with warmth and priority. |
| **🔔 The Morning Tap on the Shoulder** | When the clock strikes their special day, your phone greets you with a warm alert: *"Today is someone special's day! Take a moment to make them smile."* 🎈 |
| **🔒 100% Offline & Sacred Privacy** | No cloud sync, no tracking, and zero telemetry. The names and dates of the people you care about remain strictly inside your private pocket. 🛡️ |
| **⚡ Feather-Light & Distraction-Free** | Instant startup, zero battery drain, and no confusing clutter. Pure joy in a minimal, focused native package. 🚀 |

---

## 🧭 The Journey of a Birthday Wish

```text
       💌 A Loving Thought of Someone
                     │
                     ▼
       📝 Enter Name & Birthday (Day / Month / Year)
                     │
                     ▼
       🛡️ Encrypted & Saved Securely Offline
                     │
                     ▼
       📅 Sunrise on Their Special Morning
                     │
                     ▼
       🔔 Ding! "Happy Birthday to [Name]! 🎉"
                     │
                     ▼
       📞 A Call. A Message. A Huge Smile. ❤️
```

---

## 🛠 Under The Hood: Native Engineering Excellence

Behind the warm emotion lies modern, bulletproof Android engineering:

- **100% Modern Kotlin:** Built with clean, type-safe, and expressive code.
- **Android O+ Notification Standards:** Utilizes system `NotificationChannel` with high-priority status bar heads-up alerts.
- **Offline-First Architecture:** Leverages private `SharedPreferences` with custom `JSON` serialization — no internet connection required.
- **Smart Date Matching:** Real-time synchronization with `java.util.Calendar` API.

```kotlin
// 🔔 Delivering joy right on time on their special morning
val channel = NotificationChannel(
    "birthday_channel",
    "Birthday Celebrations & Reminders",
    NotificationManager.IMPORTANCE_DEFAULT
)
notificationManager.createNotificationChannel(channel)

val notification = NotificationCompat.Builder(this, "birthday_channel")
    .setSmallIcon(R.drawable.ic_launcher_foreground)
    .setContentTitle("🎉 Birthday Reminder!")
    .setContentText("Today is someone special's day. Send them some love! 🎂")
    .setAutoCancel(true)
    .build()
```

---

## 🚀 Quick Start (Be the First to Say Happy Birthday!)

```bash
# 1. Clone this repository
git clone https://github.com/ibrohim2005rajabboyev/BirthdayApp.git

# 2. Open in Android Studio
# Open Android Studio -> Open -> Choose "BirthdayApp"

# 3. Hit Run (Shift + F10)
# Start adding the birthdays of the people you love! 🎈
```

---

## 💌 A Note From The Creator

> *"I crafted this app not just as a piece of code, but as a reminder that technology should bring us closer to the people who matter most. If BirthdayApp helps you send just one timely message that brightens someone's day, then its mission is accomplished."* ✨

<p align="left">
  <strong>Ibrohimjon Rajabboyev</strong><br/>
  <em>Mobile App Developer • Android • Kotlin • Flutter • UI/UX</em><br/>
  🔗 <a href="https://github.com/ibrohim2005rajabboyev">GitHub Profile</a> • 💬 Let's build meaningful apps together!
</p>
