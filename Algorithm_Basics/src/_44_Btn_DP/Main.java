
package _44_Btn_DP;
import java.util.*;

/*
 * 문제 소개
 * 수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk < Sk+1 < ... SN-1 > SN을 만족한다면,
 * 그 수열을 바이토닉 수열이라고 한다.
 * 예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10}은 바이토닉 수열이지만,
 * {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30}은 바이토닉 수열이 아니다.
 * 수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.
 * 
 * 입력:
 * 첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다.
 * (1 <= N <= 1,000, 1 <= Ai <= 1,000)
 * 출력
 * 첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.
 * 예제 입력
 * 10
 * 1 5 2 1 4 3 4 5 2 1
 * 예제 출력
 * 7
 */

public class Main {

	/*  
	 *	   1  2  3  4  5  6  7  8  9  10  
	 *	   1  5  2  1  4  3  4  5  2  1 
	 * dpH 1  2  2  1  3  3  4  5  1  1  
	 * dpL                      3
	 *      a  b  c  d 
	 */
	
	public static int getMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		int cnt;
		int input[] = new int[1001];
		Scanner scan = new Scanner(System.in);
		
		cnt = scan.nextInt();
		for (int i = 1; i <= cnt; i++) {
			input[i] = scan.nextInt();
		}
		
		int dpH[] = new int[1001];
		int dpL[] = new int[1001];
		for (int i = 1; i <= cnt; i++) {
			dpH[i] = 1;
			dpL[i] = 1;
		}
		
		for (int i = 2; i <= cnt; i++) {
			for (int j = i; j >= 1; j--) {
				if (input[j] < input[i]) {
					dpH[i] = getMax(dpH[i], dpH[j] + 1);
				} 	
			}
		}
		
		for (int i = cnt - 1; i >= 1; i--) {
			for (int j = i; j <= cnt; j++) {
				if (input[j] < input[i]) {
					dpL[i] = getMax(dpL[i], dpL[j] + 1);
				} 	
			}
		}

//		System.out.println();
//		for (int i = 1; i<=cnt; i++) {
//			System.out.print(dpH[i] + " ");
//		}
//		System.out.println();
//		for (int i = 1; i<=cnt; i++) {
//			System.out.print(dpL[i] + " ");
//		}
		int max = 0;
		for (int i = 1; i<=cnt; i++) {
			if (max < dpH[i] + dpL[i]) {
				max = dpH[i] + dpL[i];
			}
		}
		System.out.print(max - 1);
	}
}