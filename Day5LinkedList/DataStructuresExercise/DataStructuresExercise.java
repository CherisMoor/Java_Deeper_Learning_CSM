package Day5LinkedList.DataStructuresExercise;

import java.util.*;

public class DataStructuresExercise {

    public static void main(String[] args) {
        AnimalArray();
        HashMap();
        AskNumbers();
        Cars();

    }

    public static void AnimalArray() {
        // Create an ArrayList of animals...
        ArrayList<String> animalList = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);

        animalList.add("dog");
        animalList.add("cat");
        animalList.add("bird");
        animalList.add("lizard");
        animalList.add("snake");
        animalList.add("guinea pig");
        animalList.add("shark");
        animalList.add("elephant");
        animalList.add("zebra");

        // Use forEach iterator to iterate through and print out the contents of your
        // array list using iterator() method

        animalList.forEach(animals -> System.out.println("Animal list has: " + animals));
        // System.out.println("Animal from list: " + animals);

        // Set an animal as your "favorite",
        System.out.println("What is your favorite animal?");
        String faveAnimal = userInput.nextLine();

        // if your favorite animal is in the array list, print to the screen: "I love
        // [that animal]!"; if it's not in there, print to screen: "No, I don't care for
        // those."
        if (animalList.contains(faveAnimal)) {
            System.out.println("I love " + faveAnimal + "s!");
        } else {
            System.out.println("No, I don't care for those.");
        }

        /*
         * What would be a way of doing this without the forEach iterator?
         * Iterator<String> iterator = animalList.iterator(); while (iterator.hasNext())
         * { System.out.println(iterator.next() + " "); }
         */
        userInput.close();
    }

    public static void HashMap() {

        // Create a HashMap with keys "Name", "Age", "Hometown" and "Favorite Food"
        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();
        HashMap<String, String> homeFave = new HashMap<String, String>();

        Scanner userInput = new Scanner(System.in);

        // Ask the user for the values
        System.out.println("What is your name?");
        String name = userInput.next();
        System.out.println("How old are you?");
        Integer age = userInput.nextInt();

        nameAge.put(name, age);

        System.out.println("What is your Hometown?");
        String town = userInput.next();
        System.out.println("What is your favorite food?");
        String faveFood = userInput.next();

        homeFave.put(town, faveFood);

        // Iterate through the Hash and introduce this person
        for (String intro : nameAge.keySet()) {
            System.out.println("This is " + intro + " they are " + nameAge.get(intro) + "-years-old.");
        }
        for (String home : homeFave.keySet()) {
            System.out.println("They're from " + home + " and their favorite food is " + homeFave.get(home) + "!");
        }
        userInput.close();
    }

    public static void AskNumbers() {

        Scanner userInput = new Scanner(System.in);

        // Ask the user for 5 numbers store them in an array list
        List<Double> userNumbers = new ArrayList<Double>();

        System.out.println("Enter your first number");
        userNumbers.add(userInput.nextDouble());
        System.out.println("Enter your second number");
        userNumbers.add(userInput.nextDouble());
        System.out.println("Enter your third number");
        userNumbers.add(userInput.nextDouble());
        System.out.println("Enter your fourth number");
        userNumbers.add(userInput.nextDouble());
        System.out.println("Enter your last number");
        userNumbers.add(userInput.nextDouble());

        // then find the sum, product, largest, and smallest of those numbers.
        int sum = 0;
        int product = 1;
        for (double x : userNumbers) {
            sum += x;
            product *= x;
        }

        double largest = Collections.max(userNumbers);
        double smallest = Collections.min(userNumbers);

        System.out.println("Sum is: " + sum);
        System.out.println("Product is: " + product);
        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);

        userInput.close();
    }

    public static void Cars() {
        HashMap<String, String> cars = new HashMap<>();
        cars.put("civic", "Honda");
        cars.put("sorrento", "Kia");
        cars.put("mustang", "Ford");
        cars.put("model 3", "Tesla");
        cars.put("malibu", "Chevrolet");
        cars.put("fusion", "Ford");

        boolean foundCar = false;

        while (foundCar == false) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("What model of car are you looking for?");
            String userSearch = userInput.nextLine();

            if (cars.containsKey(userSearch.toLowerCase())) {
                System.out.println("Oh! A " + userSearch + "! Our " + cars.get(userSearch.toLowerCase())
                        + " collection is right this way.");
                foundCar = true;
            } else if (userSearch.equals("Exit")) {
                System.out.println("Goodbye!");
                foundCar = true;
            } else {
                System.out.println(
                        "I'm sorry, we don't seem to have that vehicle available. Let's try again!\nIf you wish to exit the program, type Exit.");
            }
            userInput.close();
        }
    }
}