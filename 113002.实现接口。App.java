package scr;
public class App  extends R {
	public static void main(String[] args) {
    R r = new R();
    System.out.println(r.boy_filePathString);
    System.out.println(r.girl_filePathString);
    for (int i=0;i<r.array2d.length;i++){
        for (int j=0;j<r.array2d[i].length;j++){
            System.out.print(r.array2d[i][j]+" ");
        }
        System.out.println();
    }
}
}
