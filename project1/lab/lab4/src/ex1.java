import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        int a,b,c;
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i!=j)   System.out.print(j + "*" +i + "=" +i*j +" ");
                else System.out.println(j + "*" +i + "=" +i*j);
            }
        }
    }
}
