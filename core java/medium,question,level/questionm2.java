//Write a program to calculate the grade of a student based on marks using nested ternary operators
import java.util.*;
public class questionm2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();

        // Nested ternary operator for grading
        String grade = (marks >= 90) ? "A": (marks >= 75) ? "B": (marks >= 50) ? "C": "F";

        System.out.println("Grade = " + grade);

    }


    
}
