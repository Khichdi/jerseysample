package com.jobdox.examples

import org.apache.log4j.Logger

/**
 * @author ${user.name}
 */
object MyApp extends App{

  import org.apache.log4j.BasicConfigurator
  BasicConfigurator.configure()


  val logger = Logger.getLogger(MyApp.getClass)
  logger.info("This is my first log4j's statement")

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main1(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

  println(s"test")

}
