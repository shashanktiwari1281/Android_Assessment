# Rick & Morty Character Explorer

A modern Android application built for Android Developer Technical Assessment.

The app displays a list of Rick and Morty characters with dynamic search, live filtering, and offline-first caching using modern Android architecture components.

---

## Features
- **Character Directory:** Displays character avatars, names, species, and color-coded status badges (Alive / Dead / Unknown).
- **Dynamic Search:** Real-time search with `400ms` debouncing and `flatMapLatest` cancellation to prevent unnecessary API overhead.
- **Offline-First Caching:** Powered by Room Database for seamless offline viewing (Single Source of Truth pattern).
- **Lifecycle-Aware State Handling:** Explicit `Loading`, `Success`, and `Error` UI states with an interactive retry mechanism.

---

## Tech Stack & Libraries
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose (Material3)
- **Architecture:** MVVM + Clean Architecture
- **Dependency Injection:** Hilt
- **Asynchronous / State:** Kotlin Coroutines & Flow (`StateFlow`, `debounce`, `flatMapLatest`)
- **Networking:** Retrofit + Gson Converter
- **Local Persistence:** Room Database
- **Image Loading:** Coil for Compose

---
