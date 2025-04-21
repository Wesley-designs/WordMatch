public class WordMatch
{
/** The secret string. */
private String secret;
/** Constructs a WordMatch object with the given secret string of lowercase letters. */
public WordMatch(String word)
{
    secret = word;
}
/** Returns a score for guess, as described in part (a).
* Precondition: 0 < guess.length() <= secret.length()
*/
public int scoreGuess(String guess)
{
    String temp = secret;
    int count = 0;
    while (temp.indexOf(guess) != 0) {
        int amt = temp.indexOf(guess);
        temp = temp.substring(0,amt) + temp.substring(amt+guess.length(),temp.length());
        count++;
    }
    return (count*guess.length()*guess.length());
}
/** Returns the better of two guesses, as determined by scoreGuess and the rules for a
* tie-breaker that are described in part (b).
* Precondition: guess1 and guess2 contain all lowercase letters.
* guess1 is not the same as guess2.
*/
public String findBetterGuess(String guess1, String guess2)
{
    if (scoreGuess(guess1)>scoreGuess(guess2)) {
        return guess1;
    } else if (scoreGuess(guess2)>scoreGuess(guess1)) {
        return guess2;
    } else {
        
    }
}
}