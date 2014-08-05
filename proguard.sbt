FMProguardSettings

ProguardKeys.options in Proguard ++= Seq(
  "-dontoptimize",
  "-dontusemixedcaseclassnames", // Don't write out i.class and I.class (which won't unjar properly on case-insensitive file systems like on OSX)
  "-keep class fm.** { *; }",
  """-keepclassmembers enum * {
      public static **[] values();
      public static ** valueOf(java.lang.String);
  }""",
  "-repackageclasses 'fm.html.libs'",
  "-keepattributes",
  "-keepparameternames",
  "-dontnote org.apache.commons.lang3.ObjectUtils"
)

ProguardKeys.defaultInputFilter in Proguard := Some("!META-INF/**,!javax/**")

