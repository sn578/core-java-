//Write a program to check if a number is prime using logical operators.
import java.util.*;

public class questionm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;  //  let consider num is a prime 

        if (num <= 1) {
            isPrime = false; // 0 aur 1 prime nahi hote
        } else {
            for (int i = 2; i < num; i++) {  // 2 se num-1 tak check karo
                if (num % i == 0) {          // agar divide ho gaya
                    isPrime = false;         // toh prime nahi hai
                    break;
                }
            }
        }

        // Result print
        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is NOT a Prime Number.");
    }
}
