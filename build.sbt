FMPublic

name := "fm-html"

description := "A Simple HTML5 DSL for Scala"

scalaVersion := "2.13.2"

crossScalaVersions := Seq("2.12.11", "2.13.2")

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
) else Nil) ++ fatalWarnings

// -Ywarn-unused-import/-Xfatal-warnings casues issues in the REPL and also during doc generation
scalacOptions in (Compile, console) --= fatalWarnings
scalacOptions in (Test, console) --= fatalWarnings
scalacOptions in (Compile, doc) --= fatalWarnings

libraryDependencies ++= Seq(
  "org.apache.commons" % "commons-text" % "1.6",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)
