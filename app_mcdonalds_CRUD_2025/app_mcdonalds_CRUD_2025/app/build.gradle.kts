

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services)

}

android {
    namespace = "com.example.firestorepam"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.firestorepam"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.auth)
    implementation(libs.androidx.credentials)
    implementation(libs.androidx.credentials.play.services.auth)
    implementation(libs.googleid)

    implementation(libs.androidx.core.ktx) // Extensões Kotlin para APIs Android
    implementation(libs.androidx.lifecycle.runtime.ktx) // Gerenciamento de ciclo de vida
    implementation(libs.androidx.activity.compose) // Integração entre Activity e Compose

    // Jetpack Compose
    implementation(platform(libs.androidx.compose.bom)) // Alinha as versões do Compose
    implementation(libs.androidx.ui) // Componentes básicos de UI
    implementation(libs.androidx.ui.graphics) // Utilidades gráficas do Compose
    implementation(libs.androidx.ui.tooling.preview) // Ferramentas de pré-visualização
    implementation(libs.androidx.material3) // Componentes Material Design 3
    implementation("androidx.compose.material:material-icons-extended") // Conjunto de ícones do Material


    //implementation(libs.firebase.database)


    // Navegação e Firebase
    implementation(libs.firebase.firestore) // Banco de dados NoSQL do Firebase
   // implementation(libs.androidx.navigation.compose.android) // Navegação entre telas no Compose
    implementation(libs.firebase.auth) // Autenticação com Firebase
    implementation(libs.androidx.credentials) // API unificada de credenciais
    implementation(libs.androidx.credentials.play.services.auth) // Login com serviços Google
    implementation(libs.googleid) // ID do Google para autenticação
    implementation(libs.firebase.database) // Firebase Realtime Database



    implementation(libs.firebase.firestore)
    implementation(libs.androidx.navigation.compose)
    //implementation(libs.animated.vector.drawable)


    testImplementation(libs.junit) // Testes unitários JUnit
    androidTestImplementation(libs.androidx.junit) // Testes de instrumentação
    androidTestImplementation(libs.androidx.espresso.core) // Framework Espresso
    androidTestImplementation(platform(libs.androidx.compose.bom)) // Alinha versões do Compose nos testes
    androidTestImplementation(libs.androidx.ui.test.junit4) // Utilitários de teste para Compose
    debugImplementation(libs.androidx.ui.tooling) // Ferramentas de debug do Compose
    debugImplementation(libs.androidx.ui.test.manifest) // Manifesto para testes




}