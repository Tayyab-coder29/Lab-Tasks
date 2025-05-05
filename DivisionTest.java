import java.util.Scanner;

class Division {
    private int num1;
    private int num2;

    public Division() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double divide() throws ArithmeticException {
        return (double) num1 / num2;
    }
}

public class DivisionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division division = new Division();

        int num1 = 10;
        int num2 = 9;

        while (num2 >= 0) {
            division.setNum1(num1);
            division.setNum2(num2);
            System.out.println("\nTrying division: " + num1 + " / " + num2);

            try {
                double result = division.divide();
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception: Cannot divide by zero!");
            }

            num2--;
        }

        scanner.close();
    }
}
