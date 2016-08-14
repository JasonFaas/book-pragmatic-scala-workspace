package chapters.three

import org.scalatest.FunSpec

/**
  * Created by jasonfaas on 8/11/16.
  */
class ImplicitParametersSpec extends FunSpec {

  describe("Implicit Parameters Example") {
    it("first implicit parameter example") {
      class Wifi(name: String) {
        override def toString = name
      }

      def connectToNetwork(user: String) (implicit wifi: Wifi) {
        println(s"User: $user connected to WIFI $wifi")
      }

      def atOffice() = {
        println("--- at the office ---")
        implicit def officeNeetwork = new Wifi("office-network")
        val cafeteriaNetwork = new Wifi("cafe-connect")

        connectToNetwork("guest")(cafeteriaNetwork)
        connectToNetwork("Jill Coder")
        connectToNetwork("Joe Hacker")(cafeteriaNetwork)
      }

      atOffice()
    }
  }

}
