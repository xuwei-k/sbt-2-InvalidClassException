scalaVersion := "3.7.2"

Test / fork := true

libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % Test

enablePlugins(SbtPlugin)

pluginCrossBuild / sbtVersion := {
  scalaBinaryVersion.value match {
    case "2.12" => sbtVersion.value
    case _ => "2.0.0-RC2"
  }
}
