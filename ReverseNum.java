package Day6PracticeProblems;

public class ReverseNum {

	public static void main(String[] args) {
		int num=3245;
		int rem=0 , reverse=0;
		
		while (num!=0) {
			rem=num%10;
			reverse=reverse *10 +rem;
			num=num/10;
		}
		System.out.println(reverse);
		

	}

}
