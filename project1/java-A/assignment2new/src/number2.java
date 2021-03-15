import java.util.*;
public class number2 {
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int a = s.nextInt();
        int b = s.nextInt();
        panduan(a,b);
    }

    private static void panduan(int a, int b) {
        int[] a1 = new int[a];
        int[] b1 = new int[b];
        for(int i=0;i<a;i++)
        {
            a1[i]=s.nextInt();
        }
        for(int i=0;i<b;i++)
        {
            b1[i]=s.nextInt();
        }
        int k = 0;
        for(int i=0;i<a;i++)
        {
           while(a1[i]!=b1[k])
           {
              if(k<b-1) k++;
              else {
                  System.out.print("No");
                  System.exit(0);
              }
           }
           a1[i]=0;
        }
        int c=0;
        for(int i=0;i<a;i++)
        {
            if(a1[i]!=0) c++;
        }
        if (c==0) System.out.print("Yes");
        else System.out.print("No");
    }
}
