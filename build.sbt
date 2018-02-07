FMPublic

name := "fm-html"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "2.12.4"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-language:implicitConversions",
  "-feature",
  "-Xlint",
  "-Ywarn-unused-import"
) ++ (if (scalaVersion.value.startsWith("2.12")) Seq(
  // Scala 2.12 specific compiler flags
  "-opt:l:inline",
  "-opt-inline-from:<sources>"
) else Nil)

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.5",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
