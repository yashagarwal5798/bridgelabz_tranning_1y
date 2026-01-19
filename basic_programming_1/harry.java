import java.util.Scanner;
class harry{
	public static void main(String[] args){
		 Scanner input = new Scanner (System.in);
		System.out.println("enter the birthYear ");
		int birthYear=input.nextInt();
		System.out.println("enter the current ");
		int current= input.nextInt();
		int age = current - birthYear;
		 System.out.println("age "+age);
	}
}