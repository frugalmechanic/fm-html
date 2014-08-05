FMProguardSettings

ProguardKeys.options in Proguard ++= Seq(
  "-dontoptimize",
  "-dontusemixedcaseclassnames", // Don't write out i.class and I.class (which won't unjar properly on case-insensitive file systems like on OSX)
  "-keep class fm.** { *; }",
  "-repackageclasses 'fm.html.libs'",
  "-keepattributes",
  "-keepparameternames",
  "-dontnote org.apache.commons.lang3.ObjectUtils"
)

ProguardKeys.defaultInputFilter in Proguard := Some("!META-INF/**,!javax/**")

// Some of the Apache libs need javax.crypto
//ProguardKeys.libraries in Proguard += new File(System.getProperty("java.home"), "lib/jce.jar")
