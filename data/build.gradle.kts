plugins {
    id("digimon.feature")
    id("digimon.room")
}

android {
    namespace = "com.digimon.data"
}

dependencies {
    implementation(libs.bundles.retrofit)
}