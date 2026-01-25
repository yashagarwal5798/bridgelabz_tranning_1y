import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int num3=input.nextInt();
		if (num1>num2){
			if (num1>num3){
				System.out.println("first number is largest number");
				
			}
			else{
				System.out.println("first number is not largest number ");
			}
		}
		else{
			System.out.println("first number is not largest number ");
		}
	}
	
}