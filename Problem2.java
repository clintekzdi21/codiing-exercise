import java.util.*;
public class Problem2 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n= " );
		int n = sc.nextInt();
		String str ="";
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=(n-i); j++) {			
				System.out.print("-" );
			}	
				str += "*";
				System.out.print(str + '\n');
		}
		
	}
}