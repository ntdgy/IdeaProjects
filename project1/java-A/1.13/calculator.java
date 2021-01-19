import java.util.*;
public class calculator{
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	
    System.out.println("please input a,b,c in order as ax^2+bx+c=0");
    int a = s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	if(b*b-4*a*c<0)
	{
		System.out.println("no real answer");
	}
	  else if (b*b-4*a*c==0)
	  {
		System.out.print("x1=x2=" + b*b/(2*a*c));
	  }
	    else {
		double d = Math.sqrt(b*b-4*a*c);
		System.out.println("x1=" + ((-b+d)/(2*a)) );
		System.out.println("x2=" + ((-b-d)/(2*a)) );//测试一下注释
		}
  //s.close();
  }
  
  
  }
