import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        double [] a = { 88.3, 99, 45, 78,67.5,98.4,23.5,65.5,82,85.4 };
        Arrays.sort(a);
        double b = 0;
        for(int i = 1;i <= 8;i++)
        {
            
            b+=a[i];
        }
        System.out.println(b/8);
    }
}
