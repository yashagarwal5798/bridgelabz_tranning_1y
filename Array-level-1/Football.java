import java.util.*;
class Football
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double hg[] = new double[11];
		System.out.print("enter a height player:  ");
		for (int i =9;i<11;i++)
		{
			hg[i] = input.nextDouble();
		}
		double sum = 0;
		for (int i =9;i<11;i++)
		{
			sum +=hg[i];
		}
		double mean = sum/11;
		System.out.println("the mean is: "+mean);
	}
}