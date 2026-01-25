import java.util.Scanner;
class count{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a,b,count=0;
		a=input.nextInt();//212
		
		while(a>0)
		{
			b=a-1;//211
			if (b%10==0)
			{
				count++;
			}
			a=a/10;
			
		}
		
		System.out.println("the counter is "+count );
	}
}