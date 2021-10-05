package circlecalculator;
import java.util.Scanner;


public class CircleCalculator {
    private static final Scanner scanner = new Scanner( System.in );
    //static final double pi = Math.PI;

    public double getRadius(){
        //get radius from user as a double
        System.out.println("Please enter a radius: ");
        double radius = scanner.nextDouble();
        return radius;
    }
    public void displayCircumference(double radius) {
        //takes radius as parameter, calculates circumference, displays to two decimal places
        double circumference = 2 * Math.PI * radius;
        System.out.format("The circumference is: %.2f%n", circumference);
    }
    public void displayArea(double radius) {
        //takes radius as parameter, calculates area, displays to two decimal places
        double area = Math.PI * radius * radius;
        System.out.format("The area is: %.2f%n", area);
    }
    public static void main(String[] args) {
        //create instance of CircleCalculator(), call getRadius, displayCircumference, displayArea
        CircleCalculator circle = new CircleCalculator();

        //create the radius variable here for displayCircumference and displayArea
        double radius = circle.getRadius();
        circle.displayCircumference(radius);
        circle.displayArea(radius);

    }
}
