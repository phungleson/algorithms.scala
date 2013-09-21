package algorithms.sorts

import org.specs2.mutable.Specification

object BubbleSortSpec extends Specification {
  BubbleSort should {
    "contain 11 characters" in {
      "Hello world" must have size (11)
    }
    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }
    "end with 'world'" in {
      "Hello world" must endWith("world")
    }
  }
}