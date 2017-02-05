

public class Word {

    static int numLetters;
    public static void main(String[] args){
        WordSearch word = new WordSearch();
        word.WordSearch();
        word.wordList();
        word.displayBoard();
        word.printWordList();


    }
   /** public static int userInput(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("How Many Words Will Be In the Puzzle? ");
            try {
                numLetters = input.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Sorry Valid Inputs Are 5-20");
                input.nextLine();
            }
        }while (numLetters < 5 || numLetters > 20);
        return numLetters;
    }
    public static String[] wordInput()
    {
     Scanner input = new Scanner(System.in);
    String[] words = new String[userInput()];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Please Enter A New Word: ");
            words[i] = input.nextLine();
        }


        return words;
    }**/

}
