package _19_Power;

/*
 * 문제 소개
 * - 다음 입력 n의 m승의 결과를 출력하시오
 * - 입력: 5 3
 * 
 * 정답: 125
 * 
 * Tag >>> 반복문 (while, for)
 */

public class Main {
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		int j = 1;
		
		for (int i = 0 ; i < m ; i++) {
			j *= n;
		}
		System.out.println(j);
	}
}
