import java.util.*;
public class number4right {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T;
        int a,a_max;
        T = input.nextInt();
        if(T==0)
        {
            System.out.println("Ordinary");
        }
        else {
            int consumption = 1;
            a = input.nextInt();
            a_max = a;
            int total = a;
            while (consumption < T) {

                a = input.nextInt();
                total = a + total;
                if (a_max < a) {
                    a_max = a;
                }

                consumption++;
            }

            if (a_max >= 5000)
                System.out.println("Diamond");
            else if (a_max >= 3000 && T < 10)
                System.out.println("Gold");
            else if (a_max >= 1500 && T < 5)
                System.out.println("Silver");
            else if (T >= 10 && total >= 3000)
                System.out.println("Diamond");
            else if (T >= 5 && total >= 2000)
                System.out.println("Gold");
            else if (T >= 3 && total >= 1000)
                System.out.println("Silver");
            else
                System.out.println("Ordinary");
        }
    }
}
