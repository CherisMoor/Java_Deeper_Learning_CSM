package Day5LinkedList;

import java.util.*;

public class LearningStacks {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack); // Returns [1,2,3]

        myStack.pop();
        System.out.println(myStack); // Returns [1,2]

        int element = myStack.peek();
        System.out.println(element); // 2 because peek looks for the last element in Stack

    }
}