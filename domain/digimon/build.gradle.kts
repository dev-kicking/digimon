plugins {
    id("digimon.feature")
}

android {
    namespace = "com.domain.digimon"
}

dependencies {
    implementation(projects.data)
}