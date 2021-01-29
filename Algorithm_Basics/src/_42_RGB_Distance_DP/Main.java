
package _42_RGB_Distance_DP;

import java.util.Scanner;

/*
 * 문제 소개
 * RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로
 * 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이고, 첫 집과 마지막 집은 이웃이 아니다.
 * 각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을
 * 칠하는 비용의 최솟값을 구하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 
 * 빨강으로, 초록으로, 파랑으로 칠하는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.
 * 예제 입력:
 * 3
 * 26 40 83
 * 49 60 57
 * 13 89 99
 * 출력
 * 96
 */

public class Main {

	static int[][] ans = new int[1002][4];
	static int[][] rgb = new int[1002][4];
	static int R = 1;
	static int G = 2;
	static int B = 3;
	// 10은 3
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = R; j <= B; j++) {
				rgb[i][j] = scan.nextInt();
			}
		}

		//초기화
		for (int i = 1; i <= input; i++) {
			for (int j = R; j <= 3; j++) {
				ans[i][j] = 999999999;
			}
		}
		ans[1][R] = rgb[1][R];  // rgb[2][R]  rgb[3][R] // ans[2][R] ans[3][R]=>  
		ans[1][G] = rgb[1][G];  // rgb[2][G]  rgb[3][G] // ans[2][G] ans[3][G]=>
		ans[1][B] = rgb[1][B];  // rgb[2][B]  rgb[3][B] // ans[2][B] ans[3][B]=>
		for (int i = 2; i <= input; i++) {
			for (int j = R; j <= B; j++) {
				for (int k = R; k <= B; k++) {
					if (j != k) {
						ans[i][j] = min(ans[i][j], rgb[i][j] + ans[i-1][k]);
					}
				}
			}
		}
		System.out.println(min(ans[input][R], ans[input][G], ans[input][B]));
	}

	public static int min(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}
	public static int min(int a, int b, int c) {
		if (a < b) {
			if (a < c)
				return a;
			else 
				return c;
		}
		else {
			if (b < c)
				return b;
			else
				return c;
		}
	}
}