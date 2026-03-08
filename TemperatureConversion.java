import java.util.*;

public class TemperatureConversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float celsius, fahrenheit;
        System.out.println("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}