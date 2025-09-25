// Write a program to calculate the grade of a student based on marks using nested ternary operators.
import java.util.*;
public class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        
        // using ternary operataor 
        String grade = (marks >= 90) ? "A" :
                       (marks >= 75) ? "B" :
                       (marks >= 50) ? "C" :
                       (marks >= 35) ? "D" : "F";

         System.out.println("the grade is " +grade);              

    }
}