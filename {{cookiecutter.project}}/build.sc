// Project: {{cookiecutter.project}}
// Author: {{cookiecutter.author}}
// Date: {% now 'local', '%m/%d/%Y' %}

// build.sc
import mill._, scalalib._
import coursier.maven.MavenRepository
object {{cookiecutter.package}} extends ScalaModule {
    // Specify scala version
    def scalaVersion = "{{cookiecutter.scala_version}}"
    // Enumerate Ivy dependencies
    def ivyDeps = Agg(ivy"edu.berkeley.cs::chisel3:3.2-SNAPSHOT")
    // Add releases repo
    def repositories = super.repositories ++ Seq(
        MavenRepository("https://oss.sonatype.org/content/repositories/releases"),
        MavenRepository("https://oss.sonatype.org/content/repositories/snapshots")
    )
    //// Test suite
    //object test extends Tests {
    //    // Test dependencies 
    //}
}
