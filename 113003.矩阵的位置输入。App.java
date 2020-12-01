package pac;
import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr=new int[10][10];
		while (true) {
			System.out.println("输入一个行一个列和一个整数：");
			int row = scanner.nextInt();
			int column = scanner.nextInt();
			int use_num = scanner.nextInt();
			arr[row][column] = use_num;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
