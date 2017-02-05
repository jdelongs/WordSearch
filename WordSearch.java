import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class WordSearch {
    int num;
    private byte[][] randomCharacter;
    private String[] names;
    Scanner input = new Scanner(System.in);

    public int WordSearch() {

        while (true) {
            System.out.println("How Many Words Will Go Into The Puzzle?");

            try {
                num = validateNum(input.nextInt());
                return num;
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Sorry Valid Inputs are 5-20");


            }
            catch (IllegalArgumentException valid)
            {
               System.out.println("Soryy ur wrong");
            }
        }
    }


    public int validateNum(int validNum) {
        if (validNum < 5 || validNum > 20) {
            throw new IllegalArgumentException("Sorry Valid Inputs Are Only 5-20");
        }
        return validNum;
    }


    public void displayBoard(){
            randomCharacter = new byte[num][num];
            Random random = new Random();

            for (int row = 0; row < randomCharacter.length; row++) {

                for (int col = 0; col < randomCharacter.length; col++) {

                    randomCharacter[col][row] = (byte) (random.nextInt(26) + 65);
                    System.out.print((char) randomCharacter[col][row] + " ");
                }
                System.out.println();
            }

    }
    public String[] wordList(){
        names = new String[num];
        for (int i = 0; i < num; i++){
            System.out.println("Please Enter A new Word: " + (i + 1));
            names[i] = input.next().toUpperCase();


        }


        return names;
    }
    public void printWordList()
    {
        System.out.println("Here are the Words to find");
        for (int count = 0; count < num; count++)
        {

            System.out.println(names[count]);
        }
    }
}
    /**It will ask the user how many words they would like to add int integers.  Valid integers are 5-20.
     If  a number outside of that range or does not enter a number,
     the program should inform the user and request another number be entered(error handle)**/

    /**whatever number was entered above should display the grid of numbers.For example, if the user entered 10,
     then it should create a 10x10 puzzle.  Hint: use a 2D array for this.**/

    /** The size entered by the used should create an array that can hold that many words.
     For example, if the user entered 10, the array should be able to store 10 words**/

    /**Continuously prompt the user to enter  enough words to fill the word
     list(i.e. if the word list can contain 10 words, it should continue asking for valid words
     until 10 words have been entered)
     After a user enters a word, it should validated and converted to upper case.
     If your program sees any of these situations it should throw an IllegalArgumentException:**/

    /**o	The word should fit vertically within the puzzle.  If it is too long,
     *  the user should be told why the word is rejected and asked for another word.
     If the word is only 1 character (like “I” or “A”), it should be rejected
     If the “word” contains a space such as “Flint stone”, it should be rejected
     If the word is already in the word list, it should be rejected
     Display the word list – there should be a method that will return all the words in the word list
     as String with 1 word on each line.
     **/
       /** A main method is present, creates a new instance of the WordSearch class
    and calls methods to get words from the user and prints the words to the screen.

    }
    /**
     * Create a method called getWords. This method should only allow the user to enter whatever number
     * that was entered in the constructor. If the word entered is only 1 character long it should inform the user and
     * then tell them to try again. Also if the input is bigger than the puzzle then tell them to try again.
     * also should check to see if the word has a space in. Also should check and see if the word has already been
     * entered
     * also should convert all the words to uppercase before storing
     * in in the array.
     */

    /**
     * Create a method that will convert the word list to a string print out "Here are the words to Find" and print
     * out the words vertically
     */


