import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        Double celsius=sc.nextDouble();
         double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter distance in Kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in Miles: " + miles);

        sc.close();

    }

    
}