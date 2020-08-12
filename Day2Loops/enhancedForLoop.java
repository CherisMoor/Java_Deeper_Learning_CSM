package Day2Loops;

public class enhancedForLoop {

    public static void main(String[] args) {

        int[] simpleArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // using the standard for loop and the length property of an array
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.println("Normal for value: " + simpleArray[i]);
        }

        // using the enhanced for loop
        for (int item : simpleArray) {
            System.out.println("Enhanced for: " + item);
        }

        // both loops will print the their respective strings 1 - 10.

    }
}