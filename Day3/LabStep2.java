package Day3;

public class LabStep2 {

    public static void main(final String[] args) {

        final int[] myArray = new int[30];

        // int i = myArray[0];
        for (int i = 0; i <= myArray.length; i++) {
            System.out.println(i);
            ;
        }

        /*
         * for (int i : myArray) { System.out.println(i + " "); }
         * 
         */
        for (int i = 1; i <= myArray.length; i++) {
            System.out.println(i * 2);
        }
    }
}