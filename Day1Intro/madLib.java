package Day1Intro;

import java.util.Scanner;

public class madLib {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your name?");
        String yourName = userInput.nextLine();

        System.out.print("Enter another name that is not yours");
        String name = userInput.nextLine();

        System.out.print("Pick an adverb");
        String adverb = userInput.nextLine();

        System.out.print("Pick a number");
        String number = userInput.nextLine();

        System.out.print("Pick an adjective");
        String adjective = userInput.nextLine();

        System.out.print("Pick a noun");
        String noun = userInput.nextLine();

        System.out.print("Pick another noun");
        String nounTwo = userInput.nextLine();

        System.out.printf(
                "Dear %s,\nYou are %s %s and I want to be your %s! \nI want to go to the %s with you in %s Days.\nSincerely,%s",
                name, adverb, adjective, noun, nounTwo, number, yourName);

        userInput.close();
    }
}