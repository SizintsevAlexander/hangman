import io.StdIn.readChar
import scala.util.Random

object Main extends App {
  val wordSet       = Vector("hello", "scala", "cannon", "hangman", "hangwoman", "oop")
  val hiddenWord    = wordSet(Random.between(0, wordSet.length))
  val hangman       = Hangman(hiddenWord)
  val attemptAmount = 5
  var isFinished    = false

  while (!isFinished) {
    println("Guess a letter:")
    val letter            = readChar()
    val isGuessd: Boolean = hangman.guessLetter(letter)

    if (isGuessd)
      println("Hit!")
    else
      println(s"Missed, mistake ${hangman.mistakeAmount} out of $attemptAmount.")

    println(s"\nThe word: ${hangman.wordState}\n")

    if (hangman.wordState == hangman.hiddenWord) {
      print("You won!")
      isFinished = true
    }
    if (hangman.mistakeAmount == attemptAmount) {
      print("You lost!")
      isFinished = true
    }
  }
}
