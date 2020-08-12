package Day1OOP;

public class LabExercise1 {
    public static void main(String[] args) {
        Novel novel = new Novel(1, "Ender's Game", "sci-fi");
        novel.haveIRead(true);
        Textbook textbook = new Textbook(2, "Foundational Java", 2352349.532f);
        textbook.canIAfford(false);
    }
}

class Book {
    int numberOfPages;
    String title;

    Book(int numberOfPages, String title) {
        this.numberOfPages = numberOfPages;
        this.title = title;
    }
}

class Novel extends Book {
    String genre;

    Novel(int numberOfPages, String title, String genre) {
        super(numberOfPages, title);
        this.genre = genre;
    }

    void haveIRead(boolean haveIRead) {
        if (haveIRead) {
            System.out.println("I have read this!");
        } else {
            System.out.println("I haven't read this yet.");
        }
    }
}

class Textbook extends Book {
    float price;

    Textbook(int numberOfPages, String title, float price) {
        super(numberOfPages, title);
        this.price = price;
    }

    void canIAfford(boolean canIAfford) {
        if (canIAfford) {
            System.out.println("Wow, I can actually buy this. Crazy.");
        } else {
            System.out.println("No lunches for me, I guess.");
        }
    }
}