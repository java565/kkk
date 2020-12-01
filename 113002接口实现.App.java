package pac;
public class App implements R {
	public static void main(String[] args) {
		System.out.println(boy_filePath);
		System.out.println(girl_filePath);
		for (int row = 0; row < array2d.length; row++) {
			for (int col = 0; col < array2d[0].length; col++) {
				System.out.print(array2d[row][col]+" ");
			}
			System.out.println();
		}
	}
}
