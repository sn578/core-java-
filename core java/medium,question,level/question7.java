// //Write a program to count the number of set bits in an integer using bitwise operators.
// Brian Kernighans method 
import java.util.*;
public class question7{
    public static void main(String args[]){
       Scanner sc = new Scanner(System .in);
       System.out.println("Enter a number: ");
       int n = sc.nextInt();
       int count = 0;
       while(n > 0){
        n = n & (n-1);//Remove right most set bit
        count++; 
       }
       System.out.println("the set of bit : " + count);
    }
}