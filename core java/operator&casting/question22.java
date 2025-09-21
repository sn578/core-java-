//Write a program to check if a character is uppercase 
//or lowercase using relational operators
import java.util.*;
public class question22{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the cha = ");
        char ch = sc.next().charAt(0);
        // use relation operator 
        if(ch >= 'A' && ch <= 'Z' ){
            //ASCll 
            System.out.println("the character is uppercase : " +ch);
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("the character is lowercase : " +ch);
        }
        else{
            System.out.println("it is not alph..." +ch);
        }
    }
}