//Write a program to find the average of three numbers.//
import java.util.*;
public class question16{
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("The average of three numbers is : " + average);
    }
}