package chapters.three

import org.scalatest.FunSpec

/**
  * Created by jasonfaas on 8/12/16.
  */
class Equality extends FunSpec {

  describe("equality checking") {
    it("string comparison") {
      val str1 = "hello"
      val str2 = "hello"
      val str3 = new String("hello")

      println(str1 == str2)
      println(str1 eq str2)
      println(str1 == str3)
      println(str1.eq(str3))
      println(str1.equals(str3))
    }
  }

}
