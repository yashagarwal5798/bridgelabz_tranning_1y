import java.util.Scanner;
import java.util.Arrays;

class arr
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		
		int arr2 [][]= new int [row][col];
		
		for (int i=0;i<row;i++ ){
			for(int j=0;j<col;j++){
				
				arr2[row][col]=input.nextInt();
			}
		} 
		System.out.println();
		for (int i =0 ; i<row;i++){
			for (int j=0;j<col;j++)
			{
				
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
	}
}