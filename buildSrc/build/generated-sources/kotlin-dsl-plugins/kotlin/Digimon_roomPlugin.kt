/**
 * Precompiled [digimon.room.gradle.kts][Digimon_room_gradle] script plugin.
 *
 * @see Digimon_room_gradle
 */
public
class Digimon_roomPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Digimon_room_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
