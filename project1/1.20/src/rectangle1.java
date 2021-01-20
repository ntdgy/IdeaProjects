import java.util.*;
public class rectangle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please enter the width of a rectangle");
        double a = s.nextDouble();
        System.out.println("please enter the height of a rectangle");
        double b = s.nextDouble();
        double area = 0.5*a*b;
        System.out.printf("the area og the rectangle is %f\n" , area);
    }
}
