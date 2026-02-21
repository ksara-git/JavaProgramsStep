import java.util.*;

public class TriangleArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float base, height;
        float areaCM, areaIN;

        System.out.println("Enter base of triangle in cm: ");
        base = sc.nextFloat();

        System.out.println("Enter height of triangle in cm: ");
        height = sc.nextFloat();

        areaCM = 0.5f * base * height; 
        areaIN = areaCM / (2.54f * 2.54f); 
        System.out.println("The area of triangle in sq cm is: " + areaCM);
        System.out.println("The area of triangle in sq in is: " + areaIN);
    }
}