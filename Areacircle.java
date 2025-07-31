import java.util.Scanner;

public class Areacircle{
    
    public static double Area(double rad) {
        return 3.14* rad*rad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad, area;

        System.out.print("Enter the radius of the Circle: ");
        rad = sc.nextDouble();

        area = Area(rad);

        System.out.println("Area of the Circle is: " + area);
    }
}
