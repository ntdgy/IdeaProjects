import java.util.Arrays;
import java.util.Scanner;
public class personinfo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println ("please input your name:");
        String name = s.nextLine();
        System.out.println("please input your student id");
        int id = s.nextInt();
        System.out.println ("please input your age:");
        double age = s.nextDouble();
        System.out.println("please inout your weight in kg" );
        double weight = s.nextDouble();
        System.out.println("please input your highest grade");
        String grade = s.next();
        System.out.println("your name:" + name );
        System.out.println("your student id:" + id );
        System.out.println("your age:" + age );
        System.out.println("your weight:" + weight );
        System.out.println("your highest grade:" + grade );
        s.close();
    }
}  