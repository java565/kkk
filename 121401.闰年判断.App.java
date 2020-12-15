package pac;

import java.util.Scanner;

public class APP1 {
		    public static void main(String[] args) {
		        @SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);

		        for (int i = 0; i <i+1; i++) {
		            int year = scanner.nextInt();
		            if (year>-3200&&year<3200&&year!=0){
		                if (year>0&&year<3200){
		                    if (year%4==0&&year%100!=0||year%400==0){
		                        System.out.println(year+"是闰年");
		                    }else{
		                        System.out.println("不是闰年");
		                    }
		                }
		                if (year >-3200 && year<0) {
		                    if (year%4==-1&&year%400==-1){
		                        System.out.println("公元"+year+"是闰年");
		                    }else{
		                        System.out.println("不是闰年");
		                    }
		                }
		            }
		        }

		    }
		}
