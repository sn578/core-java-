//Write a program to check if two numbers are equal using the == operator//
import java.util.*;
public class question12{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
    
        if(num1 == num2){
            System.out.println("both value are equal");
        }
        else{
            System.out.println("the value is not equal:");
        }

    }
}