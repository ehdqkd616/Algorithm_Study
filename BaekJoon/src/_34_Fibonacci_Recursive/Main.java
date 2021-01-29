package _34_Fibonacci_Recursive;

/*
 * 문제 소개
 * - 입력된 항의 피보나치 수를 구하시오
 * - 6
 * - 정답: 8(1->1->2->3->5->8)
 * 
 * Tag >>> 재귀, Recursive function
 */

import java.util.Scanner;

public class Main {

	public static int pibo(int N) {
		
		if (N == 1)
			return 1;
		if (N == 2)
			return 1;
		
		System.out.println("pibo(N-1) : " + pibo(N-1) + "," + "pibo(N-2) : " + pibo(N-2));
		
		return pibo(N-1) + pibo(N-2);
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int ans = pibo(N);
		
		System.out.println(ans);
		
	}
	
	
	
}
