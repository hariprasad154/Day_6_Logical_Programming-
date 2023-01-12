package Day6PracticeProblems;
import java.util.Scanner;
public class FibonacciSeries {
	static Scanner src=new Scanner(System.in);
	public static void main(String[] args) { 
		 int n1=0,n2=1,n3,i;
		 int number=src.nextInt();    
		 System.out.print(n1+" "+n2); 
		    
		 for(i=2;i<number;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
		

	}

}
