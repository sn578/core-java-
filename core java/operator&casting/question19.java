//write a code of conversions fahrenheit to celsius 
import java.util.*;
public class question19{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        // Input in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }
}
