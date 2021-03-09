import java.util.*;
public class P1047 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int m = s.nextInt();
        int[] a = new int [2*m+1];
        int[] b = new int [m+1];
        int[] c = new int [l+1];
        int count=0;
        for (int i=1;i<=l+1;i++)
        {
            c[i]=1;
        }
        for (int i=1;i<=2*m+1;i++)
        {
            a[i] = s.nextInt();
        }
        for (int i=1;i<=m+1;i++)
        {
            for (int j=a[2*i-1];j<=a[2*i];j++)
            {
                c[j]=0;
            }
        }
        for (int i=1;i<=l+1;i++)
        {
            if(c[i]==1) count++;
        }
        System.out.println(count);


    }
}
