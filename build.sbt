FMPublic

name := "fm-html"

version := "0.3.0-SNAPSHOT"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "2.11.7"

// Note: Use "++ 2.11.7" to select a specific version when building
crossScalaVersions := Seq("2.10.6", "2.11.7")

scalacOptions := Seq("-unchecked", "-deprecation", "-language:implicitConversions", "-feature", "-Xlint", "-optimise", "-Yinline-warnings")

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.4" % "embedded"
)
