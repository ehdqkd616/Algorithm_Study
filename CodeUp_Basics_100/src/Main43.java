import java.util.Scanner;

public class Main43 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		oddEven(a);
		oddEven(b);
		oddEven(c);
	}
	
	public static void oddEven(int num) {
		if (num%2 == 0) {
			System.out.println("even");			
		} else {
			System.out.println("odd");
		}
	}
	
}
