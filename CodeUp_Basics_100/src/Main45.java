import java.util.Scanner;

public class Main45 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("plus");
		}else if(a<0){
			System.out.println("minus");
		}
		oddEven(a);
		
	}
	
	public static void oddEven(int num) {
		if (num%2 == 0) {
			System.out.println("even");			
		} else {
			System.out.println("odd");
		}
	}
	
}
