import java.util.*;
public class number1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = xc(a,b);
        System.out.print(a/c +" "+ b/c);
    }
    public static int xc(int a, int b) {
        int c;
        c=a%b;
        if(c!=0) {
            a=b;
            b=c;
            xc(a, b);
        }
        else {
           return b;
        }

        return c;
    }

}
