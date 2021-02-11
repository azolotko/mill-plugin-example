import mill._
import mill.scalalib.publish.{Developer, License, PomSettings, VersionControl}
import scalalib._

object `mill-plugin-example` extends ScalaModule with PublishModule {
  override def scalaVersion = "2.13.4"

  override def artifactName = T("mill-plugin-example")

  override def pomSettings = PomSettings(
    description = "Just an example of a Mill plugin",
    organization = "nl.zolotko",
    url = "https://github.com/azolotko/mill-plugin-example",
    licenses = Seq(License.`Apache-2.0`),
    versionControl = VersionControl.github("azolotko", "mill-plugin-example"),
    developers = Seq(
      Developer("azolotko", "Alex Zolotko","https://github.com/azolotko")
    )
  )

  override def publishVersion = "0.0.1"

  override def compileIvyDeps = Agg(
    ivy"com.lihaoyi::mill-scalalib:0.9.5"
  )
}
