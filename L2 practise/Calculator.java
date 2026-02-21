import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        float add, sub, mult, div;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        add = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);

    }
}