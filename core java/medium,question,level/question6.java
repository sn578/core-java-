//Write a program to count the number of set bits in an integer using bitwise operators.
import java.util.*;
public class question6{
    public static void main(String args[]){
       Scanner sc = new Scanner(System .in);
       System.out.println("Enter a number:- ");
       int n = sc.nextInt();
       int count = 0;
       while( n > 0 ){
          if((n & 1)  == 1){
              count++ ; 
            }
          n = n >> 1;
        }
       System.out.println("set bits : Naive methood : - " + count);

    }
}