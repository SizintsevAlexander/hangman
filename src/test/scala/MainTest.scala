import org.scalatest.funsuite.AnyFunSuite

class MainTest extends AnyFunSuite {

  test("win game") {
    val hangman = Hangman("hello")

    hangman.guessLetter('a')
    assert(hangman.wordState == "*****")
    assert(hangman.mistakeAmount == 1)

    hangman.guessLetter('b')
    assert(hangman.wordState == "*****")
    assert(hangman.mistakeAmount == 2)

    hangman.guessLetter('e')
    assert(hangman.wordState == "*e***")
    assert(hangman.mistakeAmount == 2)

    hangman.guessLetter('o')
    assert(hangman.wordState == "*e**o")
    assert(hangman.mistakeAmount == 2)

    hangman.guessLetter('l')
    assert(hangman.wordState == "*ello")
    assert(hangman.mistakeAmount == 2)

    hangman.guessLetter('h')
    assert(hangman.wordState == "hello")
    assert(hangman.mistakeAmount == 2)
  }

  test("lose game") {
    val hangman = Hangman("hangwomen")

    hangman.guessLetter('x')
    assert(hangman.wordState == "*********")
    assert(hangman.mistakeAmount == 1)

    hangman.guessLetter('y')
    assert(hangman.wordState == "*********")
    assert(hangman.mistakeAmount == 2)

    hangman.guessLetter('z')
    assert(hangman.wordState == "*********")
    assert(hangman.mistakeAmount == 3)

    hangman.guessLetter('n')
    assert(hangman.wordState == "**n*****n")
    assert(hangman.mistakeAmount == 3)

    hangman.guessLetter('t')
    assert(hangman.wordState == "**n*****n")
    assert(hangman.mistakeAmount == 4)

    hangman.guessLetter('l')
    assert(hangman.wordState == "**n*****n")
    assert(hangman.mistakeAmount == 5)
  }
}
