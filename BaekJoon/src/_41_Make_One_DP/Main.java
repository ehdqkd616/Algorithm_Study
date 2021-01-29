
package _41_Make_One_DP;

import java.util.Scanner;

/*
 * 문제 소개
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * 예제 입력:
 * 2
 * 출력
 * 1
 * 예제 입력:
 * 10
 * 출력
 * 3
 */

public class Main {

	static int[] ans = new int[1000001];

	// 1로 만들기 최솟값 구하기
	// 3 나누고 (나누어 떨어질
	// 2 나누고
	// 1 빼고
	// 10은 3
	public static void main(String[] args) {
		ans[2] = 1;
		ans[3] = 1;
		// ans[4]  = 2
		// ans[5] = 3
		// ans[6] = 2
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 4; i <= 1000000; i++) {
			int a = 99999, b = 99999, c = 99999;
			for (int w = 1; w <= 3; w++) {
				if (w == 1) {
					a = ans[i - 1];
				} else if (w == 2) {
					if (i % 2 == 0) {
						b = ans[i / 2];
					}
				} else if (w == 3) {
					if (i % 3 == 0) {
						c = ans[i / 3];
					}
				}
			}
			int min = min(a, b, c);
			ans[i] = 1 + min;
		}
		System.out.println(ans[input]);
	}

	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else
				return c;
		} else {
			if (b < c)
				return b;
			else
				return c;
		}
	}
}