package pac;

import java.util.Scanner;

public class App2 {

	    public static void main(String[] args) {
	        int a=1,b=1,c=0;
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in );
	        System.out.println("输入一个数字：");

	        int user = scanner.nextInt();
	        for (int i = 3; i < user; i++) {
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        if (user>0&&user<=3){
	            if (user==1)System.out.println(0);
	            if (user!=1)System.out.println(1);
	        }else{
	            System.out.println(c);
	        }

	    }
	}
