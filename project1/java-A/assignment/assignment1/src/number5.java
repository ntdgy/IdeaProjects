import java.util.*;
public class number5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        double[] a = new double[t];
        double[] b = new double[t];
        double money = 0;
        String vip = s.next();
        for (int i=0;i<t;i++) {
            a[i]= s.nextDouble();
            b[i]= s.nextDouble();
            money+=a[i]*b[i];
        }
        if (vip.equals("Diamond")) money = money * 0.7;
        else if (vip.equals("Gold")) money = money * 0.8;
        else if (vip.equals("Silver")) money = money * 0.9;
        System.out.printf("%.1f",money);
    }
}
