# 🛍️ Iconic Apparel Store

A modern Android e-commerce application for an apparel store built with Kotlin and Android Jetpack. This app provides a seamless shopping experience with features like product browsing, shopping cart, wishlist, and checkout.

Y1S2 UNIVERSITY PROJECT
PROTOTYPE DESIGN

## 📱 Features

- **Onboarding Flow**: Interactive onboarding screens to introduce users to the app
- **User Authentication**: Login and signup functionality
- **Product Browsing**: Browse through various apparel categories (Jackets, Jeans, Shoes)
- **Product Details**: View detailed product information with size and quantity selection
- **Shopping Cart**: Add products to cart and manage items
- **Wishlist**: Save favorite products for later
- **Profile Management**: User profile screen
- **Payment Processing**: Secure payment checkout flow
- **Order Confirmation**: Order placed confirmation screen
- **Bottom Navigation**: Easy navigation between Home, Wishlist, Cart, and Profile
- **Modern UI**: Material Design with edge-to-edge UI support
- **Responsive Design**: Support for different screen sizes and orientations

## 🛠️ Technologies Used

- **Language**: Kotlin
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 36
- **Build System**: Gradle (Kotlin DSL)
- **Architecture**: Standard Android App Architecture

### Libraries & Dependencies

- **AndroidX Core KTX**: 1.17.0
- **AndroidX AppCompat**: 1.7.1
- **Material Design**: 1.12.0
- **AndroidX Navigation**: 2.9.3
- **AndroidX Lifecycle**: 2.9.2
- **AndroidX ConstraintLayout**: 2.2.1
- **AndroidX Activity**: 1.10.1

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **Android Studio**: Latest version (Hedgehog or newer recommended)
- **JDK**: Java 11 or higher
- **Android SDK**: API level 24 or higher
- **Gradle**: Included via Gradle Wrapper

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Akila-Liyanage/ICONIC-APPAREL-STORE.git
   cd ICONIC-APPAREL-STORE
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an Existing Project"
   - Navigate to the cloned repository folder
   - Click "OK"

3. **Sync Gradle**
   - Android Studio will automatically sync Gradle dependencies
   - Wait for the sync to complete

4. **Configure SDK**
   - The app requires Android SDK 24 or higher
   - Ensure your SDK is properly configured in Android Studio

5. **Run the App**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`
   - Select your target device
   - The app will build and launch on your device

## 📁 Project Structure

```
Iconic4/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/iconic3/
│   │   │   │   ├── MainActivity.kt          # Main entry point
│   │   │   │   ├── onboard1.kt              # Onboarding screen 1
│   │   │   │   ├── onboard2.kt              # Onboarding screen 2
│   │   │   │   ├── onboard3.kt              # Onboarding screen 3
│   │   │   │   ├── login.kt                 # Login screen
│   │   │   │   ├── singup.kt                # Signup screen
│   │   │   │   ├── home.kt                  # Home screen with products
│   │   │   │   ├── product1.kt              # Product details screen
│   │   │   │   ├── cart.kt                  # Shopping cart screen
│   │   │   │   ├── wishlist.kt              # Wishlist screen
│   │   │   │   ├── payment.kt               # Payment screen
│   │   │   │   ├── placed.kt                # Order confirmation screen
│   │   │   │   └── profile.kt               # Profile screen
│   │   │   ├── res/
│   │   │   │   ├── layout/                  # XML layout files
│   │   │   │   ├── drawable/                # Images and drawables
│   │   │   │   ├── values/                  # Strings, colors, themes
│   │   │   │   └── navigation/              # Navigation graphs
│   │   │   └── AndroidManifest.xml
│   │   └── test/                            # Unit tests
│   ├── build.gradle.kts                     # App-level build configuration
│   └── proguard-rules.pro                   # ProGuard rules
├── gradle/
│   └── libs.versions.toml                   # Version catalog
├── build.gradle.kts                         # Project-level build configuration
└── settings.gradle.kts                      # Project settings
```

## 🎨 App Screens

1. **Splash/Main Screen** - Entry point of the app
2. **Onboarding Screens** - Three-screen onboarding flow
3. **Login Screen** - User authentication
4. **Signup Screen** - New user registration
5. **Home Screen** - Product listing with categories
6. **Product Details** - Detailed product view with size/quantity selection
7. **Shopping Cart** - Cart management
8. **Wishlist** - Saved favorite products
9. **Profile** - User profile screen
10. **Payment** - Checkout and payment screen
11. **Order Placed** - Order confirmation screen

## 🔧 Build Variants

- **Debug**: Development build with debugging enabled
- **Release**: Production build (ProGuard minification disabled by default)

## 📝 Configuration

### Changing App Package Name

1. Update `namespace` in `app/build.gradle.kts`
2. Update `applicationId` in `app/build.gradle.kts`
3. Rename package directories to match the new package name
4. Update package declarations in all Kotlin files
5. Update `AndroidManifest.xml` if needed

### Adding Dependencies

Dependencies are managed via version catalog in `gradle/libs.versions.toml`. To add a new dependency:

1. Add version to `[versions]` section
2. Add library to `[libraries]` section
3. Reference in `app/build.gradle.kts` using `libs.library.name`

## 🧪 Testing

The project includes test directories for unit and instrumented tests:

- **Unit Tests**: `app/src/test/java/com/example/iconic3/`
- **Instrumented Tests**: `app/src/androidTest/java/com/example/iconic3/`

Run tests using:
```bash
./gradlew test          # Run unit tests
./gradlew connectedAndroidTest  # Run instrumented tests
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**Akila Liyanage**

- GitHub: [@Akila-Liyanage](https://github.com/Akila-Liyanage)
- Repository: [ICONIC-APPAREL-STORE](https://github.com/Akila-Liyanage/ICONIC-APPAREL-STORE)

## 🙏 Acknowledgments

- Material Design components
- Android Jetpack libraries
- Android development community

## 📞 Support

For support, please open an issue in the [GitHub repository](https://github.com/Akila-Liyanage/ICONIC-APPAREL-STORE/issues).

---

**Note**: This is a demo/e-commerce application. For production use, additional features like backend integration, user authentication, payment gateway integration, and data persistence should be implemented.

