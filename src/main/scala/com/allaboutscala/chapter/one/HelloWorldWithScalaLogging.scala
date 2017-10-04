package com.allaboutscala.chapter.one

import com.typesafe.scalalogging.LazyLogging

/**
  * Tutorial: IntelliJ Import Dependencies – Getting Started With build.sbt
  *
  * [[http://allaboutscala.com/tutorials/chapter-1-getting-familiar-intellij-ide/getting-started-sbt-import-dependencies-build-sbt/ Tutorial]]
  */
object HelloWorldWithScalaLogging extends App with LazyLogging {

  logger.info("Hello World from Scala Logging")

}
