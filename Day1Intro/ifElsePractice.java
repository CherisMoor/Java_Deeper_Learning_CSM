package Day1Intro;

import java.util.Scanner;

public class ifElsePractice {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Choose Dog or Cat. *Case sensitive*");

        String answer = userInput.nextLine();

        if (answer.equals("Dog")) {
            System.out.print("Woof Woof!");
        } else if (answer.equals("Cat")) {
            System.out.print("Meowww!");
        } else {
            System.out.print("Invalid answer! Check case and spelling.");
        }
        userInput.close();
    }
}