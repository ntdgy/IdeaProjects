import java.util.Arrays;
import java.util.Scanner;
public class P1059 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int [n];
        int[] b = new int [n];
        int count=0;
        for(int i=0;i<=n-1;i++) a[i]=s.nextInt();
        Arrays.sort(a);
        for(int i=0;i<=n-2;i++)
        {
            if(a[i]!=a[i+1])
            {
                b[count]=a[i];
                count++;
            }
        }
        if(a[n-2]!=a[n-1])
        {
            count++;
            b[count-1]=a[n-1];
        }
        System.out.println(count);
        for(int i=0;i<=count-1;i++) System.out.print(b[i] +" ");
        //       for(int i=0;i<=n-1;i++) System.out.print(a[i]);

    }
}
