package Day2Loops;

public class ifStatements {
    public static void main(String[] args) {
        int count = 44;
        if (count > 20) {
            String msg = "Count is large!";
            if (count > 50) {
                msg = msg + "\nCount is VERY large";
            }
            System.out.println(msg);
        }
        System.out.println("Finished checking count.");
    }

    void CheckId(boolean validId, int age, boolean buyingAlc) {
        if (validId) {
            System.out.println("Valid ID presented");
            if ((age >= 21) && (buyingAlc)) {
                System.out.println("Customer legal to purchase alcohol");
            } else if ((age < 21) && (buyingAlc)) {
                System.out.println("Try again buddy");
            } else {
                System.out.println("Sorry your id is invalid!");
            }
        }
    }
}