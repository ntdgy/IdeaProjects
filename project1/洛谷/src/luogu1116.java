import java.util.*;
public class luogu1116 {
    int count = 0;
    public static void paixu(int,int) {

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int [] b = new int [a];
        for (int i=0; i<=a; i++) //读取车厢的顺序
        {
            b[i] = input.nextInt();
        }
        for (int i=0; i<=a; i++)
        {
            paixu(b[i],b[i+1]);
        }

    }



}
