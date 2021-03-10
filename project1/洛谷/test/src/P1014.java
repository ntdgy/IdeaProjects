import java.util.Scanner;
public class P1014{
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        doSomeThing();
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

    }

    private static void doSomeThing() {
        Scanner s = new Scanner(System.in);
        int n,i=0,j=0;
        n = s.nextInt();
        while(n>j)
        {
            i++;
            j+=i;
        }
        if(i%2==1)
        {
            System.out.printf("%d/%d",j-n+1,i+n-j);
        }
        else
        {
            System.out.printf("%d/%d",i+n-j,j-n+1);
        }
    }
}