import java.util.*;
public class CalculateDistance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km");
        double km, miles;
        km = sc.nextDouble();
        miles = km / 1.6;
        System.out.print("Enter distance in km ");
        System.out.println("The total miles is "  + miles + " mile for the given " + km + " km");
    }
}