import java.util.*;

public class SwapNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, temp;

        System.out.println("Enter first number: ");
        number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        number2 = sc.nextInt();

        // Swapping
        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}