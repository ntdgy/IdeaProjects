import java.util.*;
public class number1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        int id = s.nextInt();
        if (id>=1500000&&id<12100000) {
            System.out.println(name + ", welcome to Baoneng City!");
         }
        else    System.out.println(id);
    }
}
