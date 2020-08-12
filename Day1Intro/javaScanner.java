package Day1Intro;

import java.util.Scanner;

public class javaScanner {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What's your FIRST name?");
        String firstName = userInput.nextLine();

        System.out.print("What's your LAST name?");
        String lastName = userInput.nextLine();

        System.out.printf("Oh hello there %s %s\nHow are you doing?", firstName, lastName);

        String goofy = userInput.nextLine();
        System.out.println("That is " + goofy);

        userInput.close();
    }

}