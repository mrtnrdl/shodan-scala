name := "shodan-scala"

version := "0.1"

scalaVersion := "2.12.4"

val circeVersion          = "0.9.1"
val akkaHttpVersion       = "10.0.9"
val akkaVersion           = "2.4.20"
val akkaHttpCirceVersion  = "1.17.0"
val scalaTestVersion      = "3.0.4"

lazy val circe = Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

lazy val akkaHttp =           "com.typesafe.akka"         %% "akka-http"             % akkaHttpVersion
lazy val akkaHttpTestkit =    "com.typesafe.akka"         %% "akka-http-testkit"     % akkaHttpVersion
lazy val akkaHttpCirce =      "de.heikoseeberger"         %% "akka-http-circe"       % akkaHttpCirceVersion
lazy val akkaActor =          "com.typesafe.akka" %% "akka-actor" % akkaVersion

lazy val scalaTest =          "org.scalatest"             %% "scalatest"             % scalaTestVersion

libraryDependencies ++= circe
libraryDependencies ++= Seq(
  akkaActor,
  akkaHttp,
  akkaHttpCirce,
  akkaHttpTestkit % "test",
  scalaTest       % "test")
