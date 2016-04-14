FMPublic

name := "fm-html"

version := "0.3.0-SNAPSHOT"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-language:implicitConversions", "-feature", "-Xlint", "-optimise", "-Yinline-warnings")

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-lang3" % "3.4" % "embedded"
)
