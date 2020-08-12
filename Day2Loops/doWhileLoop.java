package Day2Loops;

public class doWhileLoop {

    public static void main(String[] args) {
        // DO-WHILE LOOP
        int i = 0;
        do {
            System.out.println("Hello everyone");
            i++;
            // RUNS 5 TIMES
        } while (i < 5);

        // WHILE LOOP
        // CAUTION!! INFINITE LOOP
        while (true) {
            System.out.println("Uh oh");
        }
    }
}