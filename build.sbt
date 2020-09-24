import _root_.sbt.Keys._

name := "hangman"

version := "0.1"

scalaVersion := "2.13.3"

scalacOptions := List(
  "-encoding",
  "utf8",
  "-feature",
  "-unchecked",
  "-deprecation",
  "-target:jvm-1.8",
  "-language:_",
  "-Ymacro-annotations"
)

coverageEnabled in (Test, compile) := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test
