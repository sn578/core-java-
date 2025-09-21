//Write a program to calculate compound interest using arithmetic operators.
import java.util.*;
public class question20{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        // input principla , rate ,time 
        System.out.println("Enter principal amount: ");
        double P = sc.nextDouble();
        // input Rate of interset 
        System.out.println("Enter Rate of interset: ");
        double R = sc.nextDouble();
        // input the time in years 
        System.out.println("Enter the time : ");
        double T = sc.nextDouble();

        // final amount 
        double A = P * Math.pow(( 1 + R / 100),T);

        // calculate compound interset 
        double CI = A - P;

        //output 
        System.out.println("compound Interset =" + CI);
        System.out.println("Total amount =" + A);
    }
}