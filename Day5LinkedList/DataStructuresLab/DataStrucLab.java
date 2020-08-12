package Day5LinkedList.DataStructuresLab;

import java.util.*;

public class DataStrucLab {

    public static void main(String[] args) {
        // Print simple "Hello World" to test run
        System.out.println("Hello World");
        ;

        // primitive int array
        int[] myList = { 1, 3, 4, 6, 0, 11 };

        // Regular for loop to print array
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        // enhanced for loop to print array
        for (int myList2 : myList) {
            System.out.println(myList2 + " ");
        }

        // create ArrayList of Strings
        ArrayList<String> word = new ArrayList<String>();

        Scanner userInput = new Scanner(System.in);

        // A loop to prompt the user to enter a simple word

        System.out.println("Simply enter a word or 'Quit' to exit. ");
        String input = userInput.next();
        String quit = "Quit";

        do {
            System.out.println("Simply enter a word: ");
            if (input != quit) {
                word.add(input);

            } else {
                continue;
            }
        } while (input.equalsIgnoreCase(quit));
        {

            System.out.println("You have quit. The words entered are: " + word);
        }
        userInput.close();
    }
}