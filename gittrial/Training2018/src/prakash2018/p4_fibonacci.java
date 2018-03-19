package prakash2018;

import java.util.Scanner;

public class p4_fibonacci {

	static int count;
	static void fibo(int c)
	{
		int n1=0, n2=1, n3;
		System.out.print(n1 +" " +n2);
		for(int a=0; a<c; a++)
		{
			n3= n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}

	static void justprintcount()
	{ System.out.println(count);
	
	}
	
	public static void main(String[] args) { 
		//int count;
		System.out.print("Enter a number:");
		Scanner n= new Scanner(System.in);
		count= n.nextInt();
		System.out.print("fibonacci series for " +count+ " is: ");
		
		fibo(count-2);
		n.close();
	}

}
