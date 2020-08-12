package Day6LinkedListNodes;

import java.util.*;

public class SortingAssignment {

    public static void main(String[] args) {
        CreateArray();
    }

    public static void CreateArray() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(100);

        Random rand = new Random();

        for (int i = 0; i <= 100; i++) {
            int randNum = rand.nextInt(100);
            numbers.add(randNum);

        }
        // System.out.println(numbers);

        int size = numbers.size();// Declaring an integer to store the size of my arrayList

        do {
            // Do a for loop to iterate through my list and check which index is smaller
            // than the next each iteration
            for (int i = 0; i < size - 1; ++i) {

                if (numbers.get(i) > numbers.get(i + 1))// Check if the numbers from my arrayList that are pulled are
                                                        // less than the next number(i+1)
                {

                    Integer temp1 = numbers.get(i + 1); // Getting integer from the next index
                    Integer temp2 = numbers.get(i); // Getting integer from current index
                    numbers.set(i, temp1); // Setting the current index to my next index
                    numbers.set(i + 1, temp2); // Setting the next index to my current index

                    // The above method is comparing the current index with the next index to see
                    // which is smaller than the other

                }
            }
            size = size - 1; // Now setting my ArrayList size to size-1 which is placing the index that is
                             // smaller in front of the larger one after comparison

        } while (size != 1); // This is a check that'll make sure that the loop will run as long as there are
                             // indexes to iterate through in my arrayList

        System.out.println(numbers); // When finished with the loop, ths will print my arrayList in order from
                                     // smallest num to largest num
    }
}
