import java.util.*;
public class Multiple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        if(n > 0 && n < 100){
            for(int i=100; i<=n; i--){
                if(i % n == 0){
                    System.out.println(i);
                }
            }
        }
    }
}