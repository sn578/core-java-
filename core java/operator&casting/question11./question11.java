//Write a program to invert a boolean value using the ! operator//
import java.util.*;
public class question11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:-");
        boolean value = sc.nextBoolean();
        // Invert using ! operator
        boolean invert = !value;
        System.out.println("the value is orignial:"+value);
        System.out.println("the invert value is :" +invert);
    }
}
