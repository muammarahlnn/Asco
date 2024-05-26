import com.android.build.gradle.TestExtension
import com.muammarahlnn.asco.buildlogic.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidTestConventionPlugin, 26/05/2024 17.57
 */
class AndroidTestConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.test")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<TestExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 31
            }
        }
    }
}