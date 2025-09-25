//Write a program to check if three sides form a valid triangle using relational and logical operators
import java.util.*;
public class question5{
    public static void main(String args[]){
    Scanner sc = new Scanner(System .in);
      System.out.println("Enter the three sides of trianngle: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();

       if ( a == b || b == c || a == c ) {
           System.out.println("The triangle is valid.");
       } else {
           System.out.println("The triangle is not valid.");
       }
    }
}