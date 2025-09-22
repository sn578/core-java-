//Write a program to check if a character is a vowel or consonant using the || operator
import java.util.*;
public class questionm1{
    public static void main (String args[]){
      Scanner sc = new Scanner ( System.in);
      System.out.println("Enter the char : ");
      char ch = sc.next().charAt(0);
      // Now check the condition 

      if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' ||ch == 'A' || ch == 'I' || ch == 'O' || ch == 'E' || ch == 'U' ){
        System.out.println("the char is vowel = " + ch);
      }
      else{
        System.out.println("the char is consonant  " + ch);
      }

    }
}