# 🎂 BirthdayApp — Remembering the People Who Matter Most

> *"In the rush of everyday life, we rarely forget because we don't care — we forget because life gets loud. BirthdayApp is a quiet, gentle reminder to pause and celebrate the ones who make life beautiful."*

[![Kotlin](https://img.shields.io/badge/Made%20With-Kotlin%20%E2%99%A5-7F52FF?style=flat-square&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Privacy](https://img.shields.io/badge/Privacy-100%25%20Offline-success?style=flat-square)](https://github.com/ibrohim2005rajabboyev/BirthdayApp)
[![Android](https://img.shields.io/badge/Platform-Android%2015-3DDC84?style=flat-square&logo=android&logoColor=white)](https://developer.android.com/)

---

## 💖 The Story Behind BirthdayApp

Have you ever looked at a calendar only to realize you missed the birthday of your mother, a childhood friend, or a mentor who changed your life? That sinking feeling isn't about numbers on a calendar — it's about missing a chance to say: **"You matter to me."**

**BirthdayApp** was built with one simple, heartfelt intention: **to protect human connection**. 

It is not bloated with intrusive ads, paid subscriptions, or algorithms trying to sell you party supplies. It is your quiet, private sanctuary for remembering the people who shaped your story.

---

## ✨ What Makes It Special

### 💌 A Personal Vault for Loved Ones
Save the names and dates of the people closest to your heart. Whether it's your parents' anniversary, your sibling's milestone, or a best friend's special day — their dates are treated with respect and care.

### 🔔 The Gentle Tap on Your Shoulder
On their special day, the moment you open your phone, BirthdayApp sends a quiet notification:
> *"Today is someone special's day. Take a moment to wish them well."*  
Be the first one to call or text. Be the message that brings a warm smile to their face first thing in the morning.

### 🕊️ 100% Private, 100% Yours
Your loved ones' names and dates never leave your phone. No cloud sync, no data harvesting, and no trackers. What's precious to you stays strictly between you and your device.

---

## 🧭 The Gentle Flow of Care

```text
┌─────────────────────────┐
│  A Thought of Someone   │ ──► Type: Name, Date of Birth
└───────────┬─────────────┘
            │
            ▼
┌─────────────────────────┐
│   Safe in Your Pocket   │ ──► Stored locally & securely in private storage
└───────────┬─────────────┘
            │
            ▼
┌─────────────────────────┐
│   When Today Arrives    │ ──► Automatic date check without any fuss
└───────────┬─────────────┘
            │
            ▼
┌─────────────────────────┐
│  "Happy Birthday!" 🎈   │ ──► A timely notification to help you reach out
└─────────────────────────┘
```

---

## 🛠 Under The Hood (Crafted with Care)

Behind the emotional touch is clean, modern, and reliable Android engineering:

- **Built natively in Kotlin:** Ultra-fast, responsive, and battery-friendly.
- **Offline First (`SharedPreferences`):** Secure local JSON persistence so the app works anywhere, even in airplane mode.
- **Android Notification Channels:** Full compliance with Android 8.0+ through modern `NotificationChannel` APIs.
- **Zero Distractions UI:** Pure, clean Android interface focused entirely on simplicity and ease of use.

```kotlin
// Ensuring the message gets delivered on their special morning
val channel = NotificationChannel(
    "birthday_channel",
    "Birthday Notifications",
    NotificationManager.IMPORTANCE_DEFAULT
)
notificationManager.createNotificationChannel(channel)
```

---

## 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/ibrohim2005rajabboyev/BirthdayApp.git
```

Open in **Android Studio**, hit **Run**, and start saving the dates of the people who brighten your world.

---

## 💌 A Word From The Developer

> *"I created this not as just another coding assignment, but as a reminder that technology should bring us closer to the people we love, not distract us from them. If this app helps you make even one person feel remembered and valued, its purpose is fulfilled."*

**Ibrohimjon Rajabboyev**  
*Mobile App Developer • Android • Kotlin • Flutter*  
Connect on [GitHub](https://github.com/ibrohim2005rajabboyev)
