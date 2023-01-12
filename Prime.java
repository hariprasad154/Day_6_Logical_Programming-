package Day6PracticeProblems;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner (System.in);
		int num=src.nextInt();
		int flag=0;
		for (int i=2 ;i<num;i++) {
			if (num==2) {
				System.out.println(num +"  is PRIME");
			}
			else if (num % i==0) {
				flag++;
				
			}
			else {
				flag=flag;
				
			}
		}
		if (flag >0) {
			System.out.println("not prime");
			
		}
		else {
			System.out.println("prime");
		}
		
		

	}

}
