public class Fees{
    public static void main(String args[]){
        int fee = 125000;
        double discountPercent = 10.0/100;
        double discount = fee * discountPercent;
        double final_fee = fee - discount;
        System.out.println("The discount amount is INR " + discount
        + " and final discounted fee is INR " + final_fee);
    }
}