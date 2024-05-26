import com.muammarahlnn.asco.buildlogic.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @Author Muammar Ahlan Abimanyu
 * @File JvmLibraryConventionPlugin, 26/05/2024 17.57
 */
class JvmLibraryConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
            }
            configureKotlinJvm()
        }
    }
}