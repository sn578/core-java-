//Write a program to calculate the area of a circle using the formula area = π * r * r.
import java.util.*;
public class question23{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the  radius of circle : ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;// Math.PI is used for the take value of pai π

        System.out.println("the circle area is : " + area);

    }
}