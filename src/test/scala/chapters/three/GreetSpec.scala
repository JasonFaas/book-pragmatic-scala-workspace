package chapters.three.GreetSpec

import org.scalatest.FunSpec

/**
  * Created by jasonfaas on 8/11/16.
  */
class GreetSpec extends FunSpec {
  describe("Chapter 3 code") {
    it("Should print out whats in book") {
      for (i <- 1 to 3) {
        print(s"$i,")
      }
      println("Scala Rocks!!!")
    }
1
    it("Val vs var") {
      val bufferVal = new StringBuffer("a")
      var bufferVar = new StringBuffer("b")
      val stringVal = "hello"
      var stringVar = "hello"

      bufferVal.append("b")
      bufferVar.append("c")

//      stringVal = stringVal.replaceAll("ell", "ope")
      stringVar = stringVar.replaceAll("ell", "ope")

//    INVALID
//    bufferVal = new StringBuffer("d")
      bufferVar = new StringBuffer("d")

      println(bufferVal)
      println(bufferVar)
      println(stringVal)
      println(stringVar)
    }
  }
}
