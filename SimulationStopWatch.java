package Day6PracticeProblems;
import java.util.*;

public class SimulationStopWatch {
	static Scanner src=new Scanner(System.in);
	static Integer start;
	static Integer stop;
	static long startTimer=0;
	static long stopTimer=0;
	static long elapsed;
	
	static void start()
	{
		if (start>=1) {
			
			startTimer=System.currentTimeMillis();
			System.out.println(startTimer/1000);
			
			}else {
				System.out.println("Enter the correcct number only");
			}
	}
//	
//	// to stop timer
	static void stop()
	{

		if (stop==0) {

			stopTimer=System.currentTimeMillis();
			System.out.println("stopTimer");
			

		}else {
			System.out.println("Enter the 0 only");
		}
	}
//	
	static void getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		System.out.println(elapsed/1000);
	}
	public static void main(String[] args) {
		System.out.println("enter any number to start the timer");
		start=src.nextInt();
		start();
		
		System.out.println("enter 0 to stop the timer");
		
		stop=src.nextInt();
		stop();
		
		getElapsedTime();
		
		
		
		
	}

}
