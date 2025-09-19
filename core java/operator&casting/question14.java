//Write a program to find the absolute difference between two numbers.//
//without Math.abs( ); funtion //
import java.util.*;
public class question14{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:-");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        // conditional statement //
        int diff = (num1 > num2)?(num1 - num2):(num2 - num1);
        System.out.println( " the difference is " + num1 + " and " + num2 + " difference is " + diff); 

    }
}