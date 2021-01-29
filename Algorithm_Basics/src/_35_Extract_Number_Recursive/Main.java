package _35_Extract_Number_Recursive;

/*
 * 문제 소개
 * - 입력된 수를 높은 자릿수 부터 출력하시오
 * - 2312
 * - 정답:
 * 2
 * 3
 * 1
 * 2
 * 
 * Tag >>> 재귀, Recursive function
 */

import java.util.Scanner;

public class Main {

	public static void extract(int N) {
		
		if (N/10 == 0) {
			System.out.println(N);
			return;
		}

		extract(N/10); // extract(123) extract(12) extract(1)
		System.out.println(N%10);
		//1
		//2
		//3
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		//123 -> 12 -> 1
		//1
		//2
		//3
		extract(input);
	}
	
	
	
}
