import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        System.out.println("please inout any number between 0 and 9");
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int a = s.nextInt();
        int b = random.nextInt(10);
        while(a!=b)
        {
            if (a<b)
            {
                    System.out.println("it's too small");
            }
            else
            {
                System.out.println("it's too big");
            }
            a = s.nextInt();
        }
        System.out.println("congratulations");
    }

}
