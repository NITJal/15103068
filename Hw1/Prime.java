import java.util.Scanner;

/*
A simple java program to find and print all prime numbers upto a given input
@15103068 


*/

class Prime
{
	public static void main(String[] args)
	{
		int n,p;

                // take input   
		Scanner s=new Scanner(System.in);
		System.out.println(“Enter the number upto which prime numbers are needed”);
		n=s.nextInt();
 		// print all prime numbers upto n
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}
}
