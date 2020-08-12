package Day6LinkedListNodes;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("five");
        list1.add("four");

        // 1. - tests whether a list is empty; returns boolean
        System.out.println("#1. " + isItEmpty(list1));

        // 2.
        addNode(list1, "new Item");

        // 3.
        makeEmpty(list1);

        // 4.
        addNode(list1, "new Item1");
        addNode(list1, "new Item2");
        addNode(list1, "new Item3");

        printList(list1);

        // 5.
        remove(list1, 1);

        // 6.
        addNode(list1, "new Item3");
        removeOccurrance(list1, "new Item3");

        // 7.
        addHead(list1, "new Item0");

        // 8.
        addNode(list1, "new Item1");
        addNode(list1, "new Item2");
        addNext(list1, 0, "Item8");

        // 9.
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Cherish");
        list2.add("Moore");
        list2.add("Twenty");
        appendLists(list1, list2);

        // 10.
        reverseOrder(list1);
    }

    // 1.
    public static boolean isItEmpty(LinkedList<String> list) {
        /*
         * boolean empty = true; if (empty != true) {
         * System.out.println("List is not empty. List contains: " + list); } else {
         * System.out.println("List is empty"); }
         */
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    // 2.
    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
        System.out.println("#2.New list: " + list);
    }

    // 3.
    public static void makeEmpty(LinkedList<String> list) {
        if (isItEmpty(list)) {
            System.out.println("#3.List was already empty");
        } else {
            list.clear();
            System.out.println("#3.The list is empty");
        }
    }

    // 4.
    public static void printList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++)
            if (list.size() != 0) {
                System.out.println("#4. " + list.get(i));
            }
    }

    // 5.
    public static void remove(LinkedList<String> list, int index) {
        list.remove(index);
        System.out.println("#5.List after removal of index " + index + ": " + list);

    }

    // 6.
    public static void removeOccurrance(LinkedList<String> list, String element) {
        while (list.contains(element)) {
            list.remove(element);
        }
        System.out.println("#6.List after removal of '" + element + "': " + list);
    }

    // 7.
    public static void addHead(LinkedList<String> list, String Head) {
        // Head = list.peek();
        list.addFirst(Head);
        System.out.println("#7.List with added Head: " + list);
    }

    // 8.
    public static void addNext(LinkedList<String> list, int index, String newNode) {

        list.add(index + 1, newNode);
        // while (index <= list.size())
        ;
        System.out.println("#8. " + list);
    }

    // 9.
    public static void appendLists(LinkedList<String> list1, LinkedList<String> list2) {
        list1.addAll(list2);
        System.out.println("#9. List2 + List1 = ");
        System.out.println(list1);

    }

    // 10.
    public static void reverseOrder(LinkedList<String> list) {
        System.out.println("#10.Reversed list:");
        Collections.reverse(list);
        System.out.println(list);
    }
}
