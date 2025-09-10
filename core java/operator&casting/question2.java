//Write a program to check if a number is even or odd using the % operator//
import java.util.*;
public class question2{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number :");
    int num = sc.nextInt();
    if(num%2==0){
        System.out.println("the number is even");
    }else{
        System.out.println("the number is odd");
    }
    }

}
