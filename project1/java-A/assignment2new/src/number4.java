import java.util.*;
public class number4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a1 = s.nextLine();
        String a2 = s.nextLine();
        int [] t1 = new int[8];
        int [] t2 = new int[8];
        StringBuffer start = new StringBuffer();
        StringBuffer end = new StringBuffer();
        for (int i=0;i<=7;i++)
        {
            t1[i] = a1.charAt(i) - '0';
            t2[i] = a2.charAt(i) - '0';
        }
        for (int i=0;i<=3;i++)
        {
            start.append(t1[i]);
            end.append(t2[i]);
        }
        int starttime = Integer.parseInt(start.toString());
        int endtime = Integer.parseInt(end.toString());
        int during = starttime - endtime;
        if(during >= 0)
        {
            int month = starttime/10%10*10+starttime%10;//月份
            int day = starttime/1000%10*1000+starttime/100%10*100;//日期
            month = month/10%10+month%10*10;
            day = day/10%10+month%10*10;
            System.out.printf("%d %d",month,day);
        }



    }
}
