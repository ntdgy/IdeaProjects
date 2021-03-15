import java.util.*;
public class number1new {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int a1=a;
        int b1=b;
        int c=1;
        while(c!=0)
        {
            c=a%b;
            a=b;
            b=c;
        }
        System.out.print(a1/a + " "+b1/a);
    }
}
