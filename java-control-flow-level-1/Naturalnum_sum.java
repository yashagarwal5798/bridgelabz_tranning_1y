import java.util.*;
class Naturalnum_sum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a,sumfor=0;
		System.out.print("enter a natural number: ");
		a = input.nextInt();
		for (int i=1;i<=a;i++)
		{
			  sumfor= i+sumfor;
			
		}
		 int sum= a*(a+1)/2;
		System.out.println("the sum of for is: "+sumfor);
		System.out.println("the sum of result is: "+sum);
		if (sumfor==sum){
			System.out.println("the result is correct");
		}
		else
		{
			System.out.println("the result is not correct");
		}
	}
}