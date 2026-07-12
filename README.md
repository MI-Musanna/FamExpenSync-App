<p align="center">
  <picture>
    <source media="(prefers-color-scheme: dark)" srcset="https://raw.githubusercontent.com/MI-Musanna/FamExpenSync-App/main/app/src/main/assets/icon.png">
    <source media="(prefers-color-scheme: light)" srcset="https://raw.githubusercontent.com/MI-Musanna/FamExpenSync-App/main/app/src/main/assets/icon.png">
    <img alt="FamExpenSync Logo" src="https://raw.githubusercontent.com/MI-Musanna/FamExpenSync-App/main/app/src/main/assets/icon.png" width="180" height="180" />
  </picture>
</p>
<p align="center">
  <!-- ২. অ্যান্ড্রয়েড প্ল্যাটফর্ম ব্যাজ (শুধুমাত্র ব্যাজ, কোনো লিংক নেই) -->
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white&labelColor=3DDC84&color=3DDC84" alt="Android Platform" />
&nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://github.com/MI-Musanna/FamExpenSync-App/releases">
    <img src="https://img.shields.io/badge/Latest-Release-000000?style=for-the-badge&labelColor=000000&color=FFFFFF" alt="Downloads" />
  </a>
</p>

# FamExpenSync - Android Core 📊🏠

A production-grade, 100% offline standalone family expense tracker engineered for high-density storage and localized data management. Built using a hybrid architecture with a Kotlin WebView wrapper and a premium responsive frontend.

## ⚡ Key Features
- **Multi-Profile System:** Secure multi-user tracking with a fully custom, non-blocking HTML/CSS PIN Pad verification layer.
- **Hardware Accelerated Core:** Integrated `View.LAYER_TYPE_HARDWARE` inside native Kotlin execution for lag-free 60Hz chart animations.
- **Dynamic Limit Monitoring:** Real-time 80% budget threshold alert system with a dynamic neon-rose visual warning glow.
- **Automated Recurring Ledger:** State-driven client-side cron engine that triggers and injects fixed bills automatically on specific calendar days.
- **Data Portability:** Zero internet dependency with complete local database execution and JSON import/export portability features.

## 🛠️ Tech Stack & Hardware Specs
- **Native Wrapper:** Kotlin (Android SDK 37)
- **Frontend Core:** Vanilla HTML5, CSS3 Grid/Flexbox, JavaScript (ES6+)
- **Data Visualization:** Chart.js Engine (Doughnut & Line Matrix telemetry)
- **Local Storage Architecture:** W3C LocalStorage API
- **Optimized Device Deployment Target:** Moto G64 (Custom ROM Environment)

## 📁 Repository Structure
- `app/src/main/assets/` - Holds the compiled offline core (`index.html`, UI engines, assets).
- `app/src/main/java/` - Native Kotlin backend shell (`MainActivity.kt` viewport configurations).
- `build.gradle.kts` - Gradle dependency mappings.

---
*Engineered with surgical precision by Mahdi Islam.*
