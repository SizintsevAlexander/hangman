import _root_.sbt.Keys._
import wartremover.Wart
import wartremover.Wart._

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

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"

wartremoverErrors ++= Seq[Wart](Any, AsInstanceOf, Null, Return, Throw, While, MutableDataStructures)