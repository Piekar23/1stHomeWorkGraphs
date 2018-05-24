import Dependencies._

lazy val root = (project in file(".")).
  settings(
      inThisBuild(List(
          organization := "s18133",
          scalaVersion := "2.12.6",
          version      := "0.1.0-SNAPSHOT"
  )),
  name := "pruffer-huffman",
  mainClass in Compile := Some("s18133.MainApp"),
  mainClass in assembly := Some("s18133.MainApp"),
  libraryDependencies += scalaTest % Test
  )
