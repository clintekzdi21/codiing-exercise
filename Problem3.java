import java.util.*;
public class Problem3 
{
	public static void main(String args[])
	{
		try{
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter # row/s: " );
			int row = sc.nextInt();
			
			int arr[] = new int[row];
			
			for(int i=0; i<row; i++)
			{
				arr[i] = sc.nextInt();// accepts input	
			}
			
			for(int i=1; i<row; i++)
			{
				int key = arr[i];
				int j = i-1;
				while((j>-1) &&(arr[j]>key))
				{
					arr[j+1] = arr[j];
					j--;
				}
					arr[j+1] = key;
			}
			System.out.print("Sorted Array: ");
			for(int x=0; x<row; x++)
			{
				System.out.print(arr[x] + " ");
			}
		}
		catch(Exception e){
			System.out.print("Error " + e);
		}		
	}
}