import java.util.InputMismatchException;
import java.util.Scanner;

public class Main61 {
	
	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /= 10;
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		try {
			int iNum = sc.nextInt();
			
			for (int i = 1; i <= iNum; i++) {
				int cnt = getNum(i);
				
				if (cnt == 0) {
					System.out.print(i+ " ");
				}
				else {
					for (int l = 0; l < cnt; l++) {
					 System.out.print("X");
					}
					System.out.print(" ");
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("정수만 입력 가능");
		}

	}
}