//swaping the value without using thrid variable //
import java.util.*;
public class question3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("before swapping: " +a);
        int b = sc.nextInt();
        System.out.println("befor swapping: " +b);
        a = a + b;
        a = a - b;
        b = a - b; 
           System.out.println("\nAfter swapping:");
           System.out.println("a = " + a + ", b = " + b);
    }

}
