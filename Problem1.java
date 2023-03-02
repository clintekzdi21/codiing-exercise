import java.util.*;
public class Problem1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n= " );
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			if(i%5 == 0)
				System.out.println("Knose" );
			else if(i%7 == 0) 
				System.out.println("Pet Care Made Easy" );
			else
				System.out.println(i);
		}
		
	}
}