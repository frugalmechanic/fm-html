name := "fm-html"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "3.2.2"

crossScalaVersions := Seq("3.2.2", "2.13.10", "2.12.17", "2.11.12")

val fatalWarnings = Seq(
  // Enable -Xlint, but disable the default 'unused' so we can manually specify below
  "-Xlint:-unused",
  // Remove "params" since we often have method signatures that intentionally have the parameters, but may not be used in every implementation, also omit "patvars" since it isn't part of the default xlint:unused and isn't super helpful
  "-Ywarn-unused:imports,privates,locals",
  // Warnings become Errors
  "-Xfatal-warnings"
)

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-language:implicitConversions",
  "-feature",
  "-Xlint",
) ++ (if (scalaVersion.value.startsWith("2.12") || scalaVersion.value.startsWith("2.13")) Seq(
  // Scala 2.12/2.13 specific compiler flags
  "-opt:l:inline",
  "-opt-inline-from:<sources>"
) ++ fatalWarnings else Nil)

// -Ywarn-unused-import/-Xfatal-warnings casues issues in the REPL and also during doc generation
Compile / console / scalacOptions --= fatalWarnings
Test / console / scalacOptions --= fatalWarnings
Compile / doc / scalacOptions --= fatalWarnings

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-text" % "1.10.0",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test
)

publishTo := sonatypePublishToBundle.value