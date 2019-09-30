// Project: {{cookiecutter.project}}
// Author: {{cookiecutter.author}}
// Date: {% now 'local', '%d/%m/%Y' %}

// build.sc
import mill._, scalalib._
object rtl extends ScalaModule {
    // Specify scala version
    def scalaVersion = "{{cookiecutter.scala_version}}"
    // Enumerate Ivy dependencies
    def ivyDeps = Agg(ivy"edu.berkeley.cs::chisel3_2.12::3.2.0-RC2")
    // Test suite
    object test extends Tests {
        // Test dependencies 
    }
}
