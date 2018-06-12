name := "ScalaShop"

version := "0.1"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "junit" % "junit" % "4.12",
  "org.mockito" % "mockito-core" % "1.8.5",

  "org.assertj" % "assertj-core" % "3.0.0" % Test,
  "junit" % "junit" % "4.12" % Test,
  "org.specs2" %% "specs2-core" % "3.6.1" % Test
)


resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"