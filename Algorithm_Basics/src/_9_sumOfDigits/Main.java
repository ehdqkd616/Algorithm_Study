package _9_sumOfDigits;

/*
 * 문제 소개
 * - 입력된 수의 각 자릿수 합을 구하시오
 * - 1242
 * - 정답: 9
 * 
 * Tag >>> 반복문(for, while)
 */

public class Main {

	public static void main(String[] args) {
		
		int inputNum = 4280;
		int accSum = 0;
		
		// 1232 => 123   =>  12   =>  1       =>  0 
		// 2         3        2       1 => 8
		
		
		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);

		
	}

}
