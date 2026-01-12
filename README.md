# 🚪 @EntryPoint in Jetpack Compose: When Hilt Injection Is Not Enough

This repository accompanies the Medium article:

👉 **@EntryPoint in Jetpack Compose: When Hilt Injection Is Not Enough**  
🔗 https://medium.com/droidstack/entrypoint-in-jetpack-compose-when-hilt-injection-is-not-enough-bd959552237b

---

## 📌 Overview

Hilt simplifies dependency injection in Android apps built with Jetpack Compose.  
However, **not every class in an Android app can be created by Hilt**.

This project demonstrates:
- Why normal Hilt injection sometimes fails
- What `@EntryPoint` is and why it exists
- A real Jetpack Compose example using `@EntryPoint`
- When `@EntryPoint` should **and should NOT** be used
- Common architectural mistakes and interview traps

---

## ❓ Why `@EntryPoint` Exists

Hilt can inject dependencies **only into classes it creates**.

### Hilt-managed classes
- Activity
- Fragment
- ViewModel
- Service (annotated)
- Worker (with `@HiltWorker`)

### Non-Hilt classes (problem area)
- Manually created classes
- Legacy managers
- Third-party SDK callbacks
- Framework-owned components

➡️ In these cases, **constructor injection is not possible**.  
➡️ `@EntryPoint` provides **manual access** to the Hilt dependency graph.

---

## 🧩 What This Project Demonstrates

- A **Repository** provided via Hilt
- A **ViewModel** using standard Hilt injection
- A **non-Hilt legacy class** accessing the same dependency via `@EntryPoint`
- A **Jetpack Compose screen** showing both flows

⚠️ The duplication is **intentional for explanation purposes only**.

---

## 🚨 Important Architectural Rule

> **`@EntryPoint` is NOT an alternative to dependency injection.  
> It is an escape hatch when injection is impossible.**

If Hilt can inject a dependency, **you should never use `@EntryPoint`.**

---

## ❌ Common Mistakes

- Using `@EntryPoint` inside Compose UI
- Using `@EntryPoint` inside ViewModels
- Replacing proper DI with runtime lookups
- Using `@EntryPoint` instead of `@HiltWorker` for WorkManager

---

## ✅ Correct Use Cases for `@EntryPoint`

- Legacy singleton managers
- ContentProviders
- Framework-created classes without Hilt support
- Third-party callbacks

---

## 🧠 Interview Takeaway

> **"`@EntryPoint` is an escape hatch for Hilt, not a replacement for constructor injection."**

This is a **frequently asked senior Android interview topic**.

---

## 🛠 Tech Stack

- Kotlin
- Jetpack Compose
- Hilt (Dagger)
- AndroidX

---

## 📖 Related Article

- Medium:  
  https://medium.com/droidstack/entrypoint-in-jetpack-compose-when-hilt-injection-is-not-enough-bd959552237b

---

## ☕ Support My Work

If you find this article or code helpful and want to support my work:

👉 **Buy Coffee For Me ☕**
https://buymeacoffee.com/mca2012kamz
Your support helps me continue creating high-quality Android and Jetpack Compose content.

---

## ⭐ If You Find This Useful

- Give the repo a ⭐
- Share the article
- Use it for interview preparation

---

### Author

**Kamaldeep Kakkar**  
Senior Android Developer  
Medium: DroidStack
