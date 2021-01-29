package _25_AddCycle;

/*
 * 문제 소개
 * - N이 주어졌을 때 N의 사이클의 길이를 구하시오 (1 <= N <= 100)
 * - 입력 : 26
 * 정답: 4 (26시작 2+6 = 8 -> 68, 6+8 = 14 -> 84, 8+4=12 -> 42, 4+2 = 6 => 26)
 * Tag >>> 반복문 (while, for)
 */

public class Main {
	
	public static void main(String[] args) {

		int n = 42;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		// 26 2+6=8 =>68 6+8=14 => 84 8+4=12 =>42 4+2=6 26 4회
		// 05 0+5=5 =>55 5+5=10 => 50 5+0=5 =>05 3회
		// 42 4+2=6 =>26 2+6=8 => 68 6+8=14 => 84 8+4 =12 =>42 4회
		
		do {
			tmp = res / 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			cnt++;
		} while(n != res);
		
		System.out.println(cnt);
	}
}
