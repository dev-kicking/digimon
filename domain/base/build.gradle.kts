plugins {
    id("digimon.feature")
}

android {
    namespace = "com.digimon.base"
}

dependencies {
//    implementation(projects.resource)
//    implementation(projects.feature.navigation)
    implementation(projects.data)
}