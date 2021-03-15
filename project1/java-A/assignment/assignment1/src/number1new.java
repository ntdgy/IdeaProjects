import java.util.*;
import java.util.regex.*;
import java.math.*;
public class number1new {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String id = s.next();
        if (panduan(id)==true)
        {

            float n = Float.parseFloat(id);
            if (n>=1500000&&n<12100000) {
            System.out.println(name + ", welcome to Baoneng City!");
        }
        else    System.out.println(id);

        }
        else    System.out.println(id);

    }
    public static boolean panduan(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]+(\\.[0-9]+)?");
        String bigStr;
        try {
            bigStr = new BigDecimal(str).toString();
        } catch (Exception e) {
            return false;
        }
        Matcher isNum = pattern.matcher(bigStr);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

}
