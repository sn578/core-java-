//Write a program to check if a number lies between 10 and 50 using relational operators//
import java.util.*;
public class question17{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number = ");
         int num = sc.nextInt();
         if(num >= 10 && num <= 50){
            System.out.println("the number is lies between 10 and 50  " + num);
        }
        else{
            System.out.println("the number is not lies between 10 and 50 " +num);
        }

    }
}