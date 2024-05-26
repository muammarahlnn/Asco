import com.android.build.api.dsl.ApplicationExtension
import com.muammarahlnn.asco.buildlogic.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidComposeConventionPlugin, 26/05/2024 17.44
 */
class AndroidApplicationComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("com.android.application")

            val extension = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}