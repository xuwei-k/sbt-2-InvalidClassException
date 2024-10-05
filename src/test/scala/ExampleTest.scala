package example

class ExampleTest extends org.scalatest.funsuite.AnyFunSuite {
  test("test") {
    assert((1 to 10).sum == 55)
  }
}
