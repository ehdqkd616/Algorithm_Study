import java.util.Scanner;

public class Main55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		char ascii = sc.next().charAt(0);
		char a = 'a';
		
		while(a<=ascii) {
			System.out.println(a);
			a++;
		}
	}
}