import java.util.*;
public class number4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int m = 0;
        int[] a = new int[t];
        for (int i=0;i<t;i++) {
            a[i] = s.nextInt();
            m+=a[i];
            if(a[i]>=5000){
                System.out.print("Diamond");
                System.exit(0);
            }
            else if (a[i]>=3000){
                System.out.print("Gold");
                System.exit(0);
            }
            else if (a[i]>=1500)
            {
                System.out.print("Silver");
                System.exit(0);
            }
        }
        if(t>=10&&m>=3000) System.out.print("Diamond");
        else if (t>=5&&m>=2000) System.out.print("Gold");
        else if (t>=3&&m>=1000) System.out.print("Silver");
        else System.out.print("Ordinary");
    }
}