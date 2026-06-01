ThisBuild / version := "0.1.0-SNAPSHOT"
lazy val root = (project in file("."))
  .settings(
    name := "asmd24-01-atdd",
    libraryDependencies ++= Seq(
        "io.cucumber" % "cucumber-junit" % "7.34.3" % Test,
        "junit" % "junit" % "4.13.2" % Test,
        "com.github.sbt" % "junit-interface" % "0.13.3" % Test,
        "net.aichler" % "jupiter-interface" % JupiterKeys.jupiterVersion.value % Test,
        "io.cucumber" % "cucumber-java" % "7.34.3" % Test)
)
