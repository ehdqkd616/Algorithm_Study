
package _43_Coin_DP;

/*
 * 문제 소개
 * n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 이 동전을 적당히 사용해서, 그 가치의 합이 k원이
 * 되도록 하고 싶다. 그 경우의 수를 구하시오. 각각의 동전은 몇 개라도 사용할 수 있다.
 * 사용한 동전의 구성이 같은데, 순서만 다른 것은 같은 경우이다.
 * 
 * 입력:
 * 첫째 줄에 n, k가 주어진다. (1 <= n <= 100, 1 <= k <= 10,000) 다음 n개의 줄에는 각각의 동전의
 * 가치가 주어진다. 동전의 가치는 100,000보다 작거나 같은 자연수이다.
 * 
 * 예제 입력:
 * 3 10
 * 1
 * 2
 * 5
 * 출력
 * 10
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *      1  2  3  4  5  6  7  8  9  10
		 *  1   1  1  1  1  1  1  1  1  1   1
		 *  2   0  1  1  2  2  3  3  4  4   5
		 *  5   0  0  0  0  1  1  2  2  3   4
		 *  	   2  2  3  4  5  5  7  8  10
		 */ 
		
		int coin[] = new int[101];
		int dp[] = new int[10001];
		
		Scanner scan = new Scanner(System.in);
		int numCoin = scan.nextInt();
		int money = scan.nextInt();
		
		for (int i = 1; i <= numCoin ; i++) {
			coin[i] = scan.nextInt();	
		}
		dp[0] = 1;
		for (int i = 1; i <= numCoin ; i++) {
			for (int j = coin[i]; j <= money; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}
		System.out.println(dp[money]);
	}

}