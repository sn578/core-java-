//Write a program to find the largest of two numbers using the ternary operator//
import java.util.*;
public class question1{
    public static void main(String[]args){ 
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int largest = (a > b) ? a : b ;
                System.out.println("\nThe largest number is: " + largest);
    }
}