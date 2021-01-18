import java.util.Scanner;

public class Calculator {
        void calc(){
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter two numbers: ");

            // nextDouble() reads the next double from the keyboard
            int first = reader.nextInt();
            int second = reader.nextInt();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = reader.next().charAt(0);

            int result;
            // operator doesn't match any case constant (+, -, *, /)
            switch (operator) {
                case '+' -> result = first + second;
                case '-' -> result = first - second;
                case '*' -> result = first * second;
                case '/' -> result = first / second;
                default -> {
                    System.out.println("Error! operator is not correct");
                    return;
                }
            }

            System.out.println(first + " " + operator + " " + second + " = " + result);
        }
}

