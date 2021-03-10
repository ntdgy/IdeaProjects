import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        doSomeThing();
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }

    private static void doSomeThing() {
        System.out.println("please input ");
    }
}
