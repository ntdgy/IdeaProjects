import java.util.*;
public class number2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char m='c';
        while(m!='E'){
            m = s.next().charAt(0);
            if(m == 'a') a -=1;
            else if (m == 'w') b+=1;
            else if (m == 's') b-=1;
            else if (m == 'd') a+=1;
        }
        System.out.println(a + " " + b);

    }
}
