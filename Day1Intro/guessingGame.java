package Day1Intro;

import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Pick a number between 1 and 100.");

        int realAnswer = 20;

        int answer = userInput.nextInt();

        if (answer > 0 || answer < 101) {
            if (answer >= 50) {
                System.out.print("You're too high, pick a lower number.");
            } else if (answer > 30 && answer < 50) {
                System.out.print("A little bit lower!");
            } else if (answer < 15) {
                System.out.print("You're a bit too low, pick a higher number!");
            } else if (answer > 15 && answer < 25) {
                System.out.print("You're getting hot!!");
            } else if (answer == realAnswer) {
                System.out.print("You Got It WOOHOO!");
            } else if (answer > 100 && answer < 1) {
                System.out.print("I said a number BETWEEN 1-100!");
            } else {
                System.out.print("Did you even follow instructions?!");
            }
            userInput.close();
        }
    }
}