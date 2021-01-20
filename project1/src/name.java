import java.util.*;
//util.*;
public class name{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println ("please input your name:");
        String name = s.nextLine();
        System.out.println ("please input your student id:");
        int id = s.nextInt();
        System.out.println("your name:" + name + " your student id:" + id );
        s.close();
    }
}  