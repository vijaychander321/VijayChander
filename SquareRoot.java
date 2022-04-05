package squareRoot;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		System.out.println(sqrtroot);
	}

}
