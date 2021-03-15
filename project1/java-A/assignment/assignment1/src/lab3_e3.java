import java.util.*;
public class lab3_e3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input your score:");
        int score = s.nextInt();
        float a;
        a = score;
        float gpa;
        if(score>=60) System.out.println("you have passed the exam");
          else System.out.println("you have failed the exam");
        switch (score/10){
            case 10 : gpa=4.0f;break;
            case 9 : gpa=4.0f;break;
            case 8 : gpa=3.0f;break;
            case 7 : gpa=2.0f;break;
            case 6 : gpa=1.0f;break;
            default: gpa=0.0f;break;
        }
        System.out.printf("Your score is %.1f, your gpa is %.1f",a,gpa);


    }
}
