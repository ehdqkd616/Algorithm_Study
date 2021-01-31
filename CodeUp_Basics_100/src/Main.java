import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		
		sc = new Scanner(sc.next()).useDelimiter(":");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d:%d", a, b);

	}

}
