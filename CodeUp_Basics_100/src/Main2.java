import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String [] arr = str.split("\\.");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		System.out.printf("%d.%02d.%02d", year, month, day);

	}

}
