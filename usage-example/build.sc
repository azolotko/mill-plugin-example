import $ivy.`nl.zolotko::mill-plugin-example:0.0.1`

import mill._
import scalalib._
import nl.zolotko.mill.example.SomeUsefulModule

object UsageExample extends ScalaModule with SomeUsefulModule {
  override def scalaVersion = "2.13.4"
}
