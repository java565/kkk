
public class Find {

		void R_left(int array2d[][]){
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d[i].length; j++) {
					if (array2d[i][j] == 0) {
						System.out.println("R_left("+i+","+(j-1)+")");
						break;
					}
				}
			}
		}
		void findZero(int array2d[][]){
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d[i].length; j++) {
					if (array2d[i][j] == 0) {
						System.out.println("R_Zero("+i+","+j+")");
						break;
					}
				}
			}
		}
		void R_down(int array2d[][]){
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d[i].length; j++) {
					if (array2d[i][j] == 0) {
						System.out.println("R_left("+j+","+(i+1)+")");
						break;
					}
				}
			}
		}
		void R_right(int array2d[][]){
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d[i].length; j++) {
					if (array2d[i][j] == 0) {
						System.out.println("R_right("+i+","+(j+1)+")");
						break;
					}
				}
			}
		}
		
		void R_up(int array2d[][]){
			for (int i = 0; i < array2d.length; i++) {
				for (int j = 0; j < array2d[i].length; j++) {
					if (array2d[i][j] == 0) {
						System.out.println("R_up("+j+","+(i-1)+")");
						break;
					}
				}
			}
		}
		
}
