package pac;

public class App3 {
	    public static void main(String[] args) {
	        long sum = 0;
	        for (long i = 0;i<=2147483647;i++){
	            if (i%2==1){
	                sum = sum + i;
	            }
	        }
	        System.out.println(sum);
	    }
	}

