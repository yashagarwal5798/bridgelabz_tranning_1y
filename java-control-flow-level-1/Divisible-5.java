import java.util.Scanner;
class divisible{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		if (a%5==0){
			System.out.println("divisible");
		}
		else {
			System.out.println("not divible");
		}
	}
}