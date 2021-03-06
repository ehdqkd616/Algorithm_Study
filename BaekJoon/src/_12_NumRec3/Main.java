package _12_NumRec3;

/*
 * 문제 소개
 * - 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는
 * 숫자 사각형을 출력하시오
 * - 4
 * - 정답:  1   5   9   13
 * 		   2   6  10   14
 * 		   3   7  11   15
 * 		   4   8  12   16
 * 
 * Tag >>> 중첩 반복문 (for 혹은 while), 배열
 */

public class Main {
	
	public static void main(String[] args) {

		int n = 4;
		int arr[][] = new int[n][n];
		
		/* n = 3
		 * 
		 *  1 4 7
		 *  2 5 8 
		 *  3 6 9
		 *  
		 */
		int num = 1;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				arr[j][i] = num;
				num++;
				//arr[j][i] = i*n + j+1;
			}
		}

		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
}
