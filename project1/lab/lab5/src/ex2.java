import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Please input the size of the array");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c=0;
        int a1[] = new int [a];
        int a2[] = new int [a];
        System.out.println("Please input  array 1");
        for(int i=0;i<a;i++) a1[i]=s.nextInt();
        System.out.println("Please input  array 2");
        for(int i=0;i<a;i++) a2[i]=s.nextInt();
        for(int i=0;i<a;i++)
        {
            if(a1[i]!=a2[i]) c++;
        }
        if(c!=0) System.out.println("NO");
        else System.out.println("YES");

    }
}
