package de.mrtnrdl.shodan.scala.lib

import scala.concurrent.Future
import scala.util.{ Failure, Success }
import akka.http.scaladsl.Http

object Search {
  val BASE_URL = "https://api.shodan.io"

  def ForHost(ip: String): String = {

    val responseFuture: Future[HttpResponse] = Http().singleRequest(HttpRequest(uri = "http://akka.io"))

    responseFuture
      .onComplete {
        case Success(res) => println(res)
        case Failure(_)   => sys.error("something wrong")
      }

    "test"
  }
}