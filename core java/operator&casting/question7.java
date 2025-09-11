//write a program to check if a person is eligible to vote usig the >= operator.
import java.util.*;
public class question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >=18){
            System.out.println( "the person is eligible to vote.");
        }
        else{
            System.out.println("the person is not eligible to vote.");
        }
    }
}