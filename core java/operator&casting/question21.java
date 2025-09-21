//Write a program to calculate compound interest using arithmetic operators.
// simple code by using only arithmetic operators using while and for loop 
public class question21 {
    public static void main(String[] args) {
        double P = 10000;   // Principal amount
        double R = 10;     // Rate of interest
        int T = 2;         // Time in years

        // Final Amount = P * (1 + R/100)^T
       // double amount = P;
      //  for (int i = 1; i <= T; i++) {
          //  amount = amount * (1 + R / 100);
      //  }

       // double CI = amount - P;

       // System.out.println("Compound Interest = " + CI);
       // System.out.println("Total Amount = " + amount);
        double amount = P;
        int i = 1;         // loop counter

        while (i <= T) {
            amount = amount * (1 + R / 100);
            i++;           // increment counter
        }

        double CI = amount - P;

        System.out.println("Compound Interest = " + CI);
        System.out.println("Total Amount = " + amount);
    }
}

    

