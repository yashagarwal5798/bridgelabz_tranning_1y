import java.util.Scanner;
class profitloss  {
	public static void main(String[] args){
		Scanner input  =new Scanner (System.in);
		System.out .println("cost ");
		double  cost=input.nextDouble ();
		System.out.println("sell");
		double sell= input.nextDouble();
		double profit = sell - cost;
		double profit_percentage  = (profit+cost)*100;
		System.out.println(+profit);
		System.out.println(+profit_percentage);
		
	}
}