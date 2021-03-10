import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please input n");
        int n = s.nextInt();
        double k=0;
        for(int i=1;i<=n;i++)
        {
            double b = 4 /(float) (2*i-1);
            if(i%2!=0) k +=b;
             else k -=b;
        }
        System.out.printf("%f",k);
    }
}
