import com.android.build.gradle.LibraryExtension
import com.muammarahlnn.asco.buildlogic.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidLibraryComposeConventionPlugin, 26/05/2024 17.45
 */
class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.library")

            val extension = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }
}