package Day3;

import java.util.Scanner;

public class LabStep1 {

    public static void main(String args[]) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter employment status ('E'=employed, 'U'=unemployed, 'S'=student): ");
        // String employ = scanner.next();
        char em = scanner.next().charAt(0);

        String test = scanner.nextLine();

        System.out.print("Enter vehicle type ('C'=car, 'T'=truck, 'V'= SUV, 'N'=none): ");
        // String vehicle = scanner.next();
        char vh = scanner.next().charAt(0);

        System.out.println(String.format("Hello %s, your age is %d.", username, age, test));

        // Switch statement for employment & vehicle
        String msg = " ";
        switch (vh) {
            case 'C':
            case 'c':
                msg = "You drive a car";
                break;
            case 'T':
            case 't':
                msg = "You drive a truck";
                break;
            case 'V':
            case 'v':
                msg = "You drive a SUV";
                break;
            case 'N':
            case 'n':
                msg = "You don't have a vehicle";
                break;
        }
        System.out.println(msg);

        switch (em) {
            case 'E':
            case 'e':
                msg = "You are employed";
                break;
            case 'U':
            case 'u':
                msg = "You are unemployed";
                break;
            case 'S':
            case 's':
                msg = "You are a student";
                break;
        }
        System.out.println(msg);
        // System.out.println(String.format("%s, and drive a %s.", em, vh));

        // If statements for age
        if (age >= 16) {
            System.out.println("You are old enough to drive");
        } else {
            System.out.println("You're not old enough to drive");
        }
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You're not old enough to vote");
        }
        if (age >= 21) {
            System.out.println("You are old enough to drink");
        } else {
            System.out.println("You're not old enough to drink");
        }
        if (age >= 35) {
            System.out.println("You are old enough to be President");
        } else {
            System.out.println("You're not old enough to be President");
        }
        if (age >= 55) {
            System.out.println("You can join AARP");
        } else {
            System.out.println("You're not old enough to join AARP");
        }
        if (age >= 67) {
            System.out.println("You can start drawing Social Security");
        } else {
            System.out.println("You're not old enough to draw Social Security");
        }
        scanner.close();
    }
}