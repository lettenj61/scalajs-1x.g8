resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases"

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.10")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.3")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.7.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
