//Write a program to increment and decrement a variable using ++ and --.//
import java.util.*;
public class question15{
    public static void main(String args[]){
        int num = 10;

        System.out.println("Original value: " + num);

        // Increment (++)
        num++;  // same as num = num + 1
        System.out.println("After increment: " + num);

        // Decrement (--)
        num--;  // same as num = num - 1
        System.out.println("After decrement: " + num);

        int a = 5;
        System.out.println("orginal value: = " + a);
        // pre increment
        ++a;
        System.out.println("after pre increment = " + a);
        --a;
        System.out.println("after pre decrement = " + a);
        // post //
        int b = 5;
        System.out.println("\nPost-increment (b++): " + (b++)); // first use then increase
        System.out.println("After post-increment, b: " + b);
        System.out.println("Post-decrement (b--): " + (b--)); // first use then decrease
        System.out.println("After post-decrement, b: " + b);
    }

    

    
    
}