package Day5LinkedList;

import java.util.*;

public class LearningQueues {

    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            myQueue.add(i);
        }

        myQueue.remove(); // Removes 1 from the head of the list
        int queueHead = myQueue.peek(); // To view the head of the queue
        myQueue.size(); // Returns length of queue
        System.out.println(queueHead);

        System.out.println(myQueue);

    }
}