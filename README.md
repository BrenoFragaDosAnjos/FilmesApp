# Filmes App

Native Android application built with Kotlin that consumes the TMDB REST API and presents movie information using an MVVM architecture.

<p align="center">
  <img alt="Movies list" width="30%" src="screenshots/Screenshot_20230406_191838.png"/>
  <img alt="Movie screen" width="30%" src="screenshots/Screenshot_20230406_191904.png"/>
  <img alt="Movie details" width="30%" src="screenshots/Screenshot_20230406_191915.png"/>
</p>

## Overview

The project was created to demonstrate native Android development, REST API consumption, asynchronous data loading, and separation of responsibilities using MVVM and Repository patterns.

## Main features

- dynamic movie listing from TMDB;
- remote image loading and caching;
- movie details screen;
- RecyclerView-based list rendering;
- ViewModel state management;
- LiveData communication between ViewModel and UI;
- API communication through Retrofit and OkHttp.

## Architecture

```text
View
 |
 v
ViewModel
 |
 v
Repository
 |
 v
TMDB REST API
```

The application uses **MVVM** with a Repository layer to isolate data-access responsibilities from the Android UI.

## Tech stack

- Kotlin
- Android SDK
- Jetpack
- ViewModel
- LiveData
- ViewBinding
- RecyclerView
- Retrofit
- OkHttp
- Glide
- TMDB API

## Minimum Android version

Minimum SDK: **API 31+**

## Demo

<p align="center">
  <img src="screenshots/gif1.gif" width="25%" alt="Application demo"/>
</p>

## APK

A debug APK is available in the `apk/` directory for demonstration purposes.

## Repository structure

The project follows a standard Android/Gradle layout with application code under `app/`, project build configuration at the root, and visual assets under `screenshots/`.

## What this project demonstrates

- Android application architecture;
- API integration;
- separation of UI and data logic;
- list rendering;
- image caching;
- navigation between screens;
- Gradle-based project organization.

## License

Apache License 2.0.

Copyright 2023 Breno Fraga dos Anjos.
