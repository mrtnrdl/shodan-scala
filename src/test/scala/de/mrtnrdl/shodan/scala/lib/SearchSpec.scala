package de.mrtnrdl.shodan.scala.lib

import org.scalatest.{Matchers, WordSpec}

class SearchSpec extends WordSpec with Matchers {

  "The Search" should {

    val search = Search

    "find information to an existing IP" in {
      val result = search.ForHost("127.0.0.1")

      result shouldBe "test"
    }

  }

}
