// Project: {{cookiecutter.project}}
// Author: {{cookiecutter.author}}
// Date: {% now 'local', '%m/%d/%Y' %}

// build.sc
import mill._, scalalib._
import coursier.maven.MavenRepository
object {{cookiecutter.package}} extends ScalaModule {
    // Specify scala version
    def scalaVersion = "{{cookiecutter.scala_version}}"
    
    // Specify scala compiler options
    def scalacOptions = Seq("-deprecation")
  
    //// JVM args
    //def forkArgs = Seq("")

    // Enumerate Ivy dependencies
    def ivyDeps = Agg(
      ivy"edu.berkeley.cs::chisel3:3.2-SNAPSHOT",
      ivy"edu.berkeley.cs::chisel-iotesters:1.3-SNAPSHOT"
    )
    
    // Add releases and snapshots repos
    def repositories = super.repositories ++ Seq(
        MavenRepository("https://oss.sonatype.org/content/repositories/releases"),
        MavenRepository("https://oss.sonatype.org/content/repositories/snapshots")
    )
    
    // Test suite
    object test extends Tests {
      def ivyDeps = Agg(
        ivy"edu.berkeley.cs::chisel3:3.2-SNAPSHOT",
        ivy"edu.berkeley.cs::chisel-iotesters:1.3-SNAPSHOT"
      )
      def testFrameworks = Seq("org.scalatest.tools.Framework")
    }
}
