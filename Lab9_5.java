import java.util.Scanner;

class Division {
    private int num1;
    private int num2;

    Division() {
        num1 = 0;
        num2 = 0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}

public class Lab9_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Division div = new Division();

        int num1 = 10; 
        int num2 = 9;  

        while (true) {
            div.setNum1(num1);
            div.setNum2(num2);

            try {
                if (div.getNum2() == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                int result = div.getNum1() / div.getNum2();
                System.out.println(div.getNum1() + " / " + div.getNum2() + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception occurred: " + e.getMessage());
                System.out.println("Program stopped because division by zero is not allowed.");
                break;
            }

            System.out.print("Enter next Num1: ");
            num1 = input.nextInt();
            System.out.print("Enter next Num2: ");
            num2 = input.nextInt();
        }

        input.close();
    }
}
