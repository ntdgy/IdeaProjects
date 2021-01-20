import java.util.*;
public class timecal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please input the number of seconds");
        int t = s.nextInt();
        int h,min,sec,c;
        sec = t%60;
        c = t/60;
        min = c%60;
        h = c/60;
        System.out.printf("the equivalent time is %d hours %d minutes %d seconds",h,min,sec ) ;



    }
}
