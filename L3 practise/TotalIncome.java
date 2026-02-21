import java.util.*;

public class TotalIncome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int salary, bonus, totalIncome;

        System.out.println("Enter your salary: ");
        salary = sc.nextInt();

        System.out.println("Enter your bonus: ");
        bonus = sc.nextInt();

        totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}