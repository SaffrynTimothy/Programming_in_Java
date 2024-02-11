import java.util.Scanner;
public class Placement
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		while(int n>0)
		{
		    int c=n%10;
		    n=n/10;
		    sum=sum+c;
		}
		System.out.println(sum);
	}
}
