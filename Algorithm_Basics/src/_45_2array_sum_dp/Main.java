package _45_2array_sum_dp;

import java.util.*;

/*
 * 문제 소개
 * 2차원 배열의 합
 * 
 * 문제
 * 2차원 배열이 주어졌을 때 (i,j)위치부터 (x,y)위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오.
 * 배열의 (i,j) 위치는 i행 j열을 나타낸다.
 * 입력
 * 첫째 줄에 배열의 크기 N, M(1<=N,M<=300)이 주어진다. 다음 N개의 줄에는 M개의 정수로 배열이 주어진다.
 * 배열에 포함되어 있는 수는 절댓값이 10,000보다 작거나 같은 정수이다.
 * 그 다음 줄에는 합을 구할 부분의 개수 K(1 <= K <= 10,000)가 주어진다.
 * 다음 K개의 줄에는 네 개의 정수로 i, j, x, y가 주어진다(i <= x, j <= y)
 * 출력
 * K개의 줄에 순서대로 배열의 합을 출력한다. 배열의 합은 32bit-int 범위를 초과하지 않는다.
 * 
 * 예제 입력
 * 2   3
 * 1   2   4
 * 8  16  32
 * 3
 * 1   1   2   3
 * 1   2   1   2
 * 1   3   2   3
 * 
 * 예제 출력
 * 63
 * 2
 * 36
 */

/*
 *     1 2 3 4
 *  1  1 1 1 1 
 *  2  2 2 2 2
 *  3  3 3 3 3 
 *  4  4 4 4 4
 *  
 *  dp[1][1] = 1
 *  dp[1][2] = dp[1][1] + num
 *  dp[1][3] = dp[1][2] + num
 *  dp[1][4] = dp[1][3] + num
 *  dp[2][1] = dp[1][1] + num 
 *  dp[2][2] = dp[1][2] + dp[2][1] + num - dp[1][1]
 *  dp[2][3] = dp[1][3] + dp[2][2] + num - dp[1][2]
 *  -> dp[i][j] = dp[i-1][j] + dp[i][j-1] + num - dp[i-1][j-1];
 *  
 *     [i,j]~[x,y]
 *  ex)[3,3]~[4,4]
 *   -> dp[4][4] - dp[4][2] - dp[2][4] + dp[2][2]
 *   -> dp[x][y]- dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1]
 */ 

public class Main {
	
	
	public static void main(String[] args) {
		int dp[][] = new int[301][301];
		int a, b, num;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		for (int i = 1; i <= a ; i++) {
			for (int j = 1; j <= b; j++) {
				num = scan.nextInt();
				dp[i][j] = dp[i-1][j] + dp[i][j-1] + num - dp[i-1][j-1];
			}
		}
		
		int cnt, i, j, x, y;
		cnt = scan.nextInt();
		for (int k = 1; k <= cnt; k++) {
			i = scan.nextInt();
			j = scan.nextInt();
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(dp[x][y]- dp[i-1][y] - dp[x][j-1] + dp[i-1][j-1]);
		}
	}
	
}
