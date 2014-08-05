FMPublic

name := "fm-html"

version := "0.1.0-SNAPSHOT"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "2.11.2"

// Note: Use "++ 2.11.0" to select a specific version when building
crossScalaVersions := Seq("2.10.4", "2.11.2")

scalacOptions := Seq("-unchecked", "-deprecation", "-language:implicitConversions", "-feature", "-Xlint", "-optimise", "-Yinline-warnings")

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.3.2" % "embedded"
)
