//Write a program to find the maximum of three numbers using nested ternary operators.//
import java.util.*;
public class question8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       int max = (a > b)?((a >c)? a : c) :((b > c) ? b : c); 
        System.out.println("the maximum unmber is:" + max);
    }
}