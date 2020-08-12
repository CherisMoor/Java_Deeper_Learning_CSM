package Day5LinkedList;

import java.util.*;

public class LearningLinkedList {

    public static void main(String[] args) {
        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("dog");
        animalList.add("zebra");
        animalList.add("cat");
        animalList.add("giraffe");

        animalList.addFirst("shark"); // Get shark at begininning of list
        animalList.addLast("fish"); // Get fish at end of list
        animalList.add(3, "cuttlefish"); // Get cuttlefish in Index 3
        animalList.remove(4); // Removes from index 4
        animalList.remove("zebra"); // remves zebra
        animalList.removeFirst();
        animalList.removeLast();
        animalList.contains("giraffe"); // Returns boolean whether object is in list or not
        animalList.size(); // Returns length of List

        String element = animalList.get(1); // Uses .get() method to print obj. in index one of List

        System.out.println(element);

    }
}