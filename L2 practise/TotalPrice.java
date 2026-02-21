import java.util.*;
public class TotalPrice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int quantity;
        double price, total_price;

        System.out.println("Enter the price and the quantity:");
        price = sc.nextDouble();
        quantity = sc.nextInt();

        total_price = price * quantity;

        System.out.println("The total purchase price is INR " + total_price + " if the quantity "
         + quantity + " and unit price is INR " + price);

    }
}