//Write a program to check if a number is either divisible by 3 or 7 using the || operator//
import java.util.*;
public class question10{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 || a%7==0){
            System.out.println("the is divisible by 3 or 7 :"+a);

        }
        else{
            System.out.println("the number is not divisible by 3 or 7 :"+a);
        }

    }
}
