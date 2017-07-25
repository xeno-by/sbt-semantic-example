lazy val ScalaVersion = "2.11.11"
lazy val MetaVersion = "2.0.0-M1"

lazy val library = project.settings(
  scalaVersion := ScalaVersion,
  addCompilerPlugin("org.scalameta" % "scalahost" % MetaVersion cross CrossVersion.full),
  scalacOptions += "-Yrangepos"
)

lazy val app = project.settings(
  scalaVersion := ScalaVersion,
  libraryDependencies += "org.scalameta" %% "scalameta" % MetaVersion
).dependsOn(library)