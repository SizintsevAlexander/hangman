case class Hangman(hiddenWord: String) {
  var wordState = "*" * hiddenWord.length
  var mistakeAmount = 0

  def guessLetter(letter: Char): Boolean = {
    var isGuessed: Boolean = false
    for (i <- hiddenWord.indices) {
      if (wordState(i) == '*' && hiddenWord(i) == letter) {
        wordState = wordState.updated(i, letter)
        isGuessed = true
      }
    }
    if (!isGuessed)
      mistakeAmount += 1
    isGuessed
  }
}
