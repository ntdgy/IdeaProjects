import java.util.*;
public class rectangle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the width of a rectangle");
        double a = s.nextDouble();
        System.out.println("please enter the height of a rectangle");
        double b = s.nextDouble();
        double area = a*b;
        System.out.printf("the area of the rectangle is %.4f\n" , area);
        System.out.printf("the perimeter of the rectangle is %.4f\n" , 2*a*b);
    }
}
