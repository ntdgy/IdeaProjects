import java.util.*;
    public class number3 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int a1 = s.nextInt();
            int b1 = s.nextInt();
            int c1 = s.nextInt();
            int a2 = s.nextInt();
            int b2 = s.nextInt();
            int c2 = s.nextInt();
            int a3 = a2 - a1;
            int b3 = b2 - b1;
            int c3 = c2 - c1;
            if (a3!=0) System.out.print(a3 +"h");
            if (b3!=0) System.out.print(b3 +"m");
            if (a3==0&b3==0&&c3==0) System.out.print("0s");

        }
}
