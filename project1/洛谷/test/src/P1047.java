import java.util.Scanner;
public class P1047 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int m = s.nextInt();
        int[] a = new int [2*m+6];
        int[] c = new int [l+3];
        int count=0;
        for (int i=0;i<=l;i++)            c[i]=1;
        for (int i=0;i<=2*m-1;i++)            a[i] = s.nextInt();
        for (int i=0;i<=m-1;i++)
        {
            for (int j=a[2*i];j<=a[2*i+1];j++)
            {
                c[j]=0;
            }
        }
        for (int i=0;i<=l;i++)
        {
            if(c[i]==1) count++;
        }
        System.out.println(count);
   }
}
