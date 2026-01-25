import java.util.Scanner;
class smallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		if (num1<num2){
			if(num1<num3){
				System.out.println("first number is smallest");
				
			}
			else{
				System.out.println("first number is not smallest");
			}
		}
		
	
	else{
	System.out.println("first number is not samlest");
}}}