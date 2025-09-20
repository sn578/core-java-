//Write a program to convert temperature from Celsius to Fahrenheit.//
import java.util.*;
public class question18{
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the temperature in celsius= ");
    double celsius = sc.nextDouble();
    // convert to fahrenheit 

    double fahrenheit = (celsius * 9 / 5) + 32;

    //output
    System.out.println( celsius + "°C = " + fahrenheit + "°F" );
   }

}