package nl.zolotko.mill.example

import mill.T
import mill.define.{Command, TaskModule}

trait SomeUsefulModule extends TaskModule {
  override def defaultCommandName() = "hello"

  def hello(args: String*): Command[String] = T.command {
    println(s"Hello, world! Args: $args")

    "just an example of command output"
  }
}