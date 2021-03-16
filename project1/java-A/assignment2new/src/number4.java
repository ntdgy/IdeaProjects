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
        int month,day,day0;//day0为
        month = starttime/10%10*10+starttime%10;//月份
        day = starttime/1000%10*1000+starttime/100%10*100;//日期
        month = month/10%10+month%10*10;
        day = day/10%10+month%10*10;
        System.out.printf("%d %d",month,day);
        if(month==1)  day0 = 31;
        else if(month==2)  day0 = 28;
        else if(month==3)  day0 = 31;
        else if(month==4)  day0 = 30;
        else if(month==5)  day0 = 31;
        else if(month==6)  day0 = 30;
        else if(month==7)  day0 = 31;
        else if(month==8)  day0 = 31;
        else if(month==9)  day0 = 30;
        else if(month==10)  day0 = 31;
        else if(month==11)  day0 = 30;
        else if(month==12)  day0 = 31;




    }
}
