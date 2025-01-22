package beginner;
import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform: ");
        String operation = scanner.nextLine();

// switch case ladder  (faster than if else ladder)
        switch (operation) {
            case "sum":
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%.2f, %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%.2f, %.2f = %.2f", num1, num2, num1 * num2);
                break;
            case "div":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%.2f, %.2f = %.2f", num1, num2, num1 / num2);
                }
                break;
            default:  // like else case
                System.out.printf("%s is not a supported operation.", operation);
                break;
        }
        scanner.close();

    }
}
