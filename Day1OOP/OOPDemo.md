import java.util.*;

// ENCAPSULATION EXAMPLE 
public class TechTalentStudent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class OOPDemo {

  public static void main(String[] args) {
  
  TechTalentStudent s = new TechTalentStudent(); s.setName("Michael Jordan");
  System.out.println(s.getName());
  
  public class OOPDemo {
 public static void main(String[] args) {
     Bear bear = new Bear(1, "Teddy", 900f);
     bear.display();
     bear.announce(); // getting this from Animal class
     Tiger tiger = new Tiger(2, "Tigger");
     tiger.announce(); // Overriding in our Tiger class
 }
}
class Animal {
 int id;
 String name;
 Animal(int id, String name) {
     this.id = id;
     this.name = name;
 }
 public void announce() {
     System.out.println("Hello, I'm an animal");
 }
}
class Bear extends Animal {
 float weight;
 Bear(int id, String name, float weight) {
     super(id, name);
     this.weight = weight;
 }
 void display() {
     System.out.println(id + ", " + "My name and weight: " + name + ", " + weight + " pounds");
 }
}
class Tiger extends Animal {
 Tiger(int id, String name) {
     super(id, name);
 }
 public void announce() {
     System.out.println("Rawr I'm a tiger");
 }
}
  
  // ANOTHER EXAMPLE OF POLYMORPHISM public class OOPDemo {
  
    public class OOPDemo {
        public static void main(String[] args) {
            Food myFeast[] = new Food[3];
            myFeast[0] = new Steak();
            myFeast[1] = new Bacon();
            myFeast[2] = new Food();
            for (int i = 0; i < 3; ++i) {
                myFeast[i].eat();
            }
        }
    }
    class Food {
        void eat() {
            System.out.println("I have some food");
        }
    }
    class Steak extends Food {
        void eat() {
            System.out.println("My steak is cooked medium rare");
        }
    }
    class Bacon extends Food {
        void eat() {
            System.out.println("My bacon is crispy");
        }
    }
  
 


 // ABSTRACT CLASS EXAMPLE
 public class OOPDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.example(10);
        obj.example(10, 20);
        obj.example(5.5);
    }
}
class Overload {
    void example(int x) {
        System.out.println("x: " + x);
    }
    void example(int x, int y) {
        System.out.println("x and y: " + x + ", " + y);
    }
    double example(double x) {
        System.out.println("double x: " + x);
        return x * x;
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        guitar.createSound();
        guitar.printInstrument();
        Instrument trumpet = new Trumpet();
        trumpet.createSound();
        trumpet.printInstrument();
    }
}
abstract class Instrument {
    public abstract void createSound(); // abstract method doesn't have a body defined
    public void printInstrument() {
        System.out.println("This is an instrument");
    }
}
class Guitar extends Instrument {
    public void createSound() {
        System.out.println("Strum");
    }
}
class Trumpet extends Instrument {
    public void createSound() {
        System.out.println("Bwaaaaa");
    }
    public void printInstrument() {
        System.out.println("This is a trumpet");
    }
}


// INTERFACE EXAMPLE
public class OOPDemo {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.changeGear(5);
        motorcycle.accelerate(15);
        motorcycle.displayStatus();
    }
}

    interface Vehicle {
        void changeGear(int a);

        void accelerate(int a);

        void brake(int a);
    }

    class Motorcycle implements Vehicle {
        int speed, gear;

        public void changeGear(int newGear) {
            gear = newGear;
        }

        public void accelerate(int increment) {
            speed = speed + increment;
        }

        public void brake(int decrement) {
            speed = speed - decrement;
        }

        public void displayStatus() {
            System.out.println("Speed: " + speed + " Gear: " + gear);
        }
    }

    // Example of Aggregation, "has-a" relationship
    public class OOPDemo {
        public static void main(String[] args) {
            Address address = new Address(100, "Charlotte", "NC");
            Programmer object = new Programmer("Zach", address);
            System.out.println(object.name);
            System.out.println(object.programmerAddr.streetNum);
            System.out.println(object.programmerAddr.city);
            System.out.println(object.programmerAddr.state);
        }
    }

    class Address {
        int streetNum;
        String city, state;

        Address(int street, String city, String state) {
            this.streetNum = street;
            this.city = city;
            this.state = state;
        }
    }

    class Programmer {
        String name;
        Address programmerAddr;

        Programmer(String name, Address addr) {
            this.name = name;
            this.programmerAddr = addr;
        }
    }

    // Example of Composition

    public class OOPDemo {
        public static void main(String[] args) {
            // Instatiating three new NetflixMovie objects
            NetflixMovie movieObject1 = new NetflixMovie("Titanic", "James Cameron");
            NetflixMovie movieObject2 = new NetflixMovie("Get Out", "Jordan Peele");
            NetflixMovie movieObject3 = new NetflixMovie("Star Trek", "J.J. Abrams");
            // Instatiating an ArrayList called allNetflixMovies
            List<NetflixMovie> allNetflixMovies = new ArrayList<NetflixMovie>();
            // Add our previously created NetflixMovie objects to our ArrayList
            allNetflixMovies.add(movieObject1);
            allNetflixMovies.add(movieObject2);
            allNetflixMovies.add(movieObject3);
            // Instatiating a new NetflixLibrary object and passing our ArrayList
            // as its parameter
            // This creates our "one-to-many" relationship by having one Library
            // have many Movies
            NetflixMovieLibrary netflix = new NetflixMovieLibrary(allNetflixMovies);
            // Storing our NetflixMovieLibrary object in a List called mvs
            List<NetflixMovie> mvs = netflix.getTotalNetflixMoviesInNetflixLibrary();
            // Printing each individual NetflixMovie obejct stored inside our of our
            // NetflixMovieLibrary object with a for loop
            for (NetflixMovie mv : mvs) {
                System.out.println("Title: " + mv.title + " and Producer: " + mv.producer);
            }
        }
    }

    class NetflixMovie {
        // Create title and producer variables
        public String title, producer;

        // Constructor for NetflixMovie object with title and producer as parameters
        NetflixMovie(String title, String producer) {
            this.title = title;
            this.producer = producer;
        }
    }

class NetflixMovieLibrary {
    // Create variable movies that cannot be changed once created (final)
    private final List<NetflixMovie> movies;
    // Constructor for NetflixMovieLibrary object passing movies variable as its
    // parameter
    NetflixMovieLibrary(List<NetflixMovie> movies) {
        this.movies = movies;
    }
    // public method to get movies (getter)
    public List<NetflixMovie> getTotalNetflixMoviesInNetflixLibrary() {
        return movies;
    }
}