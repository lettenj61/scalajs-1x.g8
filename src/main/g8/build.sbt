val repo = "$name;format="lower,hyphen"$"

lazy val commonSettings = Seq(
  organization        := "$organization$",
  crossScalaVersions  := Seq("$scalaVersion$", "2.12.12", "2.11.12"),
  scalaVersion        := "$scalaVersion$"
)

def workspace(moduleName: String) =
  file("workspace/" + moduleName)

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSExample)
  .settings(commonSettings)
  .settings(
    publish       := {},
    publishLocal  := {},
    name          := s"\$repo-root"
  )


