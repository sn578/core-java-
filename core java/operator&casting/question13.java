//Write a program to find the absolute difference between two numbers.//
import java.util.*;
public class question13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value:-");
        int a= sc.nextInt();
        System.out.println("enter the sec value:-");
        int b = sc.nextInt();
        //find Absolute value difference//
        // absolute always give the postive value |a-b| kese bhi value ho //
        int diff = Math.abs(a - b);
        System.out.println("absolute differnce between " +  a  +  " and "  +  b  + " difference  is " +  diff);
    }
}