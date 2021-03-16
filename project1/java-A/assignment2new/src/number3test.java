import java.math.BigInteger;
import java.util.*;
public class number3test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        BigInteger a = new BigInteger(s.next(),2);
//        BigInteger b = new BigInteger(s.next(),2);
//        BigInteger r = a.add(b);
//        System.out.println(r.toString(2));
          System.out.print(s.nextBigInteger(2).add(s.nextBigInteger(2)));//两行OJ不是梦
    }
}