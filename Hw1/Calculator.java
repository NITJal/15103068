import java.util.Scanner;

/**
 * A calculator program to perfor mathematical operation on two numbers
 * @15103068
 * 
 */
public class Calculator implements CalculatorInterface
{
	int a,b;
	double c;
	public void addition(int a,int b)
	{
		System.out.println(""+(a+b));
	}
	public void subtract(int a,int b)
	{
		System.out.println(""+(a-b));
	}
	
	public void minNum(int a,int b)
	{
		System.out.println(""+((a<b)?a:b));
	}
	public void maxNum(int a,int b)
	{
		System.out.println(""+((a>b)?a:b));
	}
	public void multi(int a,int b)
	{
		System.out.println(""+(a*b));
	}
	public void division(int a,int b)
	{
		try{
		System.out.println(""+(a/b));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public void sin(double a)
	{
		System.out.println(""+Math.sin(a));
	}
	public void cos(double a)
	{
		System.out.println(""+Math.cos(a));
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Calculator calc1=new Calculator();
		while(true)
		{
			System.out.println("\nEnter Your Choice: 1.Addition 2.Subtract 3.Multiply 4.Division 5.Find Maximum 6.Find Minimum 7.Sine 8.Cosine 9.Exit");
			int n=sc.nextInt();
			if(n<7)
			{
				System.out.println("Enter two numbers");
				calc1.a=sc.nextInt();
				calc1.b=sc.nextInt();
			}
			else if(n==7 || n==8)
			{
				System.out.println("Enter a number");
				calc1.c=sc.nextDouble();
			}
			switch(n)
			{
				case 1:
					calc1.addition(calc1.a,calc1.b);
					break;
				case 2:
					calc1.subtract(calc1.a,calc1.b);
					break;
				case 3:
					calc1.multi(calc1.a, calc1.b);
					break;
				case 4:
					calc1.division(calc1.a, calc1.b);
					break;
				case 5:
					calc1.maxNum(calc1.a, calc1.b);
					break;
				case 6:
					calc1.minNum(calc1.a, calc1.b);
					break;
				case 7:
					calc1.sin(calc1.c);
					break;
				case 8:
					calc1.cos(calc1.c);
					break;
				case 9:
					sc.close();
					System.exit(1);
			}
		}
	}
}