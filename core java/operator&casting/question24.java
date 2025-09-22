//Write a program to check if a year is a leap year using logical operators
import java.util.*;
public class question24{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year for check : ");
        int year = sc.nextInt();
        
        // leap year condition 
        if((year%400 == 0) || (year % 4 == 0 && year %100 !=0)){
            System.out.println("is a leap year.: " + year);

        }
        //🔹 Explanation of Condition
       //(year % 400 == 0) → agar year 400 se divisible hai → Leap year ✅

       //(year % 4 == 0 && year % 100 != 0) → agar 4 se divisible hai lekin 100 se nahi → Leap year ✅

        //Otherwise → Not Leap year ❌
        else{
            System.out.println("it is not leap year" + year);
        }

    }
}