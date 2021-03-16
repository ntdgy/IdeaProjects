import java.util.*;
public class number3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
       add(a,b);
    }
    public static void add(String a, String b) {
        int length = Math.max(a.length(),b.length());//得到数组长度
        while(a.length()<length)
        {
            a = '0' + a;
        }
        while(b.length()<length)
        {
            b = '0' + b;
        }//对于不同的长度的二进制数，将长度补齐
        int m = 0;
        int [] t = new int [length];
        for (int i = length-1;i>=0;i--)
        {
            int sum = a.charAt(i) -'0'+ b.charAt(i)-'0';//从后向前读取，对于每一位数字进行读取并且赋值进sum
            if(m>0)                                     //且后面的-‘0’表示读取对应的数字，即从字符串转为整型变量。
            {
                sum += m;
                m=0;
            }
            if(sum>=2)                                 //进行进位
            {
                m=1;
            }
            t[i] = sum%2;
        }
        StringBuffer result = new StringBuffer();
        for (int i=0;i<length;i++)
        {
            result.append(t[i]);                      //append表示在字符的后面进行增加数值
        }
        if(m>0)
        {
            result.insert(0,'1');            //insert表示在第0位插入1
        }
        System.out.print(result);
    }
}
