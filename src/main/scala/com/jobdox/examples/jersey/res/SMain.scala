package com.jobdox.examples.jersey.res

import java.util.logging.{Level, Logger}

import com.jobdox.examples.jersey.main.Main
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{ServletContextHandler, ServletHolder}
import org.glassfish.jersey.servlet.ServletContainer

object SMain extends App{

  val server = new Server(8080)

  val ctx = new ServletContextHandler(ServletContextHandler.NO_SESSIONS)

  ctx.setContextPath("/")
  server.setHandler(ctx)

  val serHol = ctx.addServlet(classOf[ServletContainer], "/rest/*")
  serHol.setInitOrder(1)
  serHol.setInitParameter("jersey.config.server.provider.packages", "com.jobdox.examples.jersey.res")

  try {
    server.start()
    server.join()
  } catch {
    case ex: Exception =>
      Logger.getLogger(classOf[Main].getName).log(Level.SEVERE, null, ex)
  } finally server.destroy()

}
