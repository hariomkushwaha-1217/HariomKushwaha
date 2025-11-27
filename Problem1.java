package screeningtest;
import java.util.Scanner;

class Calculator {
    private double a;
    private double b;

    public Calculator(double a,double b) {
        this.a=a;
        this.b=b;
    }
    public double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return a+b;
            case "subtraction":
                return a-b;
            case "multiplication":
                return a*b;
            case "modulus":
                return a%b;
            case "division":
                if (b==0) {
                    System.out.println("Division by zero");
                    return Double.NaN;
                }
                return a/b;
            default:
                System.out.println("Invalid operation type!");
                return Double.NaN;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a=sc.nextDouble();

        System.out.println("Enter second number: ");
        double b=sc.nextDouble();

        System.out.println("Enter operation type (Addition, Subtraction, Modulus,+ Multiplication, Division): ");
        String operation=sc.next();

        Calculator calc=new Calculator(a,b);
        double result=calc.calculate(operation);

        if (!Double.isNaN(result)) {
            System.out.println("Result: "+result);
        }
    }
}

