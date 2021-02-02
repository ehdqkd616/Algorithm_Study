import java.util.Scanner;

public class Main58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			char c = sc.next().charAt(0);
			
			if(c == 'q') {
				System.out.println(c);
				break;
			}
			System.out.println(c);
		}
		
	}
}