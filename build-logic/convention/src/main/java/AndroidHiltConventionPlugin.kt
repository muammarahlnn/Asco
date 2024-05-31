import com.muammarahlnn.asco.buildlogic.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * @Author Muammar Ahlan Abimanyu
 * @File AndroidHiltConventionPlugin, 31/05/2024 18.46
 */
class AndroidHiltConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("org.jetbrains.kotlin.kapt")
            }

            dependencies {
                "implementation"(libs.findLibrary("hilt.android").get())
                "kapt"(libs.findLibrary("hilt.compiler").get())
                "kaptAndroidTest"(libs.findLibrary("hilt.compiler").get())
            }
        }
    }
}