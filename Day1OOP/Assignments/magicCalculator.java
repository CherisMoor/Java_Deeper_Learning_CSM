package Day1OOP.Assignments;

public class magicCalculator extends calculator {

    public static void main(String[] args) {
        magicCalculator magic = new magicCalculator();
        System.out.println(magic.squareRoot(9));
        System.out.println(magic.sin(20));
        System.out.println(magic.cosine(20));
        System.out.println(magic.tangent(20));
        System.out.println(magic.factorial(5));
    }

    // Finds the square root of a number
    double squareRoot(double num1) {

        double sqrt = Math.sqrt(num1);
        System.out.println("The square root of " + num1 + " is: ");
        return sqrt;
    }

    // Finds the sin (trigonometry) of a number
    double sin(double num1) {

        double sine = Math.sin(num1);
        System.out.println("The sin of " + num1 + " is: ");
        return sine;
    }

    // Finds the cosine (trigonometry) of a number
    double cosine(double num1) {

        double cos = Math.cos(num1);
        System.out.println("The cosine of " + num1 + " is: ");
        return cos;
    }

    // Finds the tangent (trigonometry) of a number
    double tangent(double num1) {

        double tan = Math.tan(num1);
        System.out.println("The tangent of " + num1 + " is: ");
        return tan;
    }

    // Finds the factorial (!) of the number
    double factorial(double num1) {

        double n = num1;
        double fact = 1;

        for (double i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + num1 + " is: ");
        return fact;
    }
}