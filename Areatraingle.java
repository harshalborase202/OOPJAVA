import java.util.Scanner;

public class Areatraingle{
    
    public static double Area(double base,double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height, area;

        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();

        area = Area(base, height);

        System.out.println("Area of the triangle is: " + area);
    }
}
