package Day1OOP.Assignments;

public class calculator {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(5, 5));
        System.out.println(calc.subtract(30, 20));
        System.out.println(calc.multiply(3, 2));
        System.out.println(calc.divide(20, 5));
        System.out.println(calc.square(6));
    }

    public int num1;
    public int num2;

    // An **add** method that takes in two integer numbers
    int add(int num1, int num2) {

        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = ");
        return sum;
    }

    // A **subtraction** method that takes in two integers
    int subtract(int num1, int num2) {

        int difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = ");
        return difference;
    }

    // A **multiplication** method that takes in two integer numbers
    int multiply(int num1, int num2) {

        int multiple = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = ");
        return multiple;
    }

    // A **division** method that takes in two integer numbers
    int divide(int num1, int num2) {

        int divend = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = ");
        return divend;
    }

    // A **square** method that takes in one integer and squares it
    double square(double num1) {

        double squared = num1 * num1;
        System.out.println(num1 + " squared = ");
        return squared;
    }

}