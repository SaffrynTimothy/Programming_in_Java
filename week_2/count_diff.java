import java.util.Scanner;
public class Placement
{
	public static void main(String[] args) 
	{
	    Scanner s= new Scanner(System.in);
	    System.out.print("Enter Array Size: :");
	    int n=s.nextInt();
	    System.out.print("Enter Elements: ");
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    System.out.print("Enter Diffrence:");
	    int d=s.nextInt();
	    int c=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n;j++)
	        {
	            if(Math.abs(arr[i]-arr[j])==d)
	            c++;
	        }
	    }
	
	    System.out.println("Pairs with diffrence: "+d+" is "+c);
	    
	}
}
