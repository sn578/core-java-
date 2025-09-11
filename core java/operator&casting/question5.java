//Write a program to check if a number is positive, negative, or zero using relational operators.//
import java.util.*;
public class question5{
    public static void main(String []args){
      Scanner sc = new Scanner (System.in);
       int num = sc.nextInt();
      if(num<0){
        System.out.println("the number is negative");
      }
        else if (num>0){
        System.out.println(num +"the number is positive");
      }
      else{
        System.out.println( num + "the number is zero");
      }

    }
}