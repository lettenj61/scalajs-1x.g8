val repo = "$name;format="lower,hyphen"$"

lazy val commonSettings = Seq(
  organization        := "$organization$",
  crossScalaVersions  := Seq("$scalaVersion$", "2.12.12", "2.11.12"),
  scalaVersion        := crossScalaVersions.value.head,
  scalacOptions in (Compile, compile) := findScalacOptions(scalaVersion.value, scalacOptions.value)
)

def findScalacOptions(v: String, suggestions: Seq[String]): Seq[String] =
  CrossVersion.partialVersion(v) match {
    case Some((2, 13)) => Seq("-deprecation", "-encoding", "utf-8", "-feature", "-unchecked")
    case _             => suggestions
  }

def workspace(moduleName: String) =
  file("workspace/" + moduleName)

lazy val root = project
  .in(file("."))
  .settings(commonSettings)
  .settings(
    publish       := {},
    publishLocal  := {},
    name          := s"\$repo-root"
  )


