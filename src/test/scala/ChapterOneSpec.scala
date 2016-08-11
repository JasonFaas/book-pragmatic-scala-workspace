import org.scalatest.FunSpec

/**
  * Created by jasonfaas on 8/10/16.
  */
class ChapterOneSpec extends FunSpec{
  describe("Is Chapter 1 Real?") {
    it("should equals 2"){
      assert(1+1 == 2)
    }

    it("Should call another method") {
//      printf(ChapterOne.getHelloWorld())
      assert(ChapterOne.getHelloWorld() equals "Hello Chapter 1");
    }
  }
}
