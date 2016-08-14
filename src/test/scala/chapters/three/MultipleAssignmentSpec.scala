package chapters.three

import org.scalatest.FunSpec

/**
  * Created by jasonfaas on 8/11/16.
  */
class MultipleAssignmentSpec extends FunSpec {
  describe("tuple examples") {
    it("First Tuple") {

      val (firstName, lastName, emailAddress) = getPersonInfo(1)

      println(s"Last Name: $lastName")
    }

    it("Second Tuple") {
//      compile failure below
//      val (firstName, lastName) = getPersonInfo(1)

      val (info) = getPersonInfo(1)
      println(s"Last Name: $info._2")
      println(s"Last Name: ${info._2}")
      val lastName = info._2
      println(s"Last Name: $lastName")
    }

    def getPersonInfo(primaryKey : Int) = {
      //assuming db call
      //response hardcoded
      ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
    }
  }



}
