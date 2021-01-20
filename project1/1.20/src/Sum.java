import java.util.*;
public class Sum{
    public static void main(String[] args) {
        System.out.println("Welcome to CS102A!");
        Scanner input = new Scanner(System.in);
        int number1, number2,sum;
        System.out.println("enter your first integer");
        number1 = input.nextInt();
        System.out.println("enter your second integer");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("Sum is %d\n", sum);
    }
}