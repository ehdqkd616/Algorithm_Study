package _6_Greatest_Common_Divisor;

/*
 * 문제 소개
 * - 입력된 두 수의 최대공약수를 구하시오
 * - 12 18
 * - 정답: 6
 * 
 * Tag >>> 반복문(for, while), if
 */

public class Main {

	public static void main(String[] args) {
		
		int num1, num2;
		num1 = 30;
		num2 = 20;
		
		int small;
		int big;
		
		if (num1 > num2){
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; //
		
		for (int i = 1 ; i <= small  ; i++) {
			if (big % i == 0 && small % i == 0) 
				gcd = i;
		}
		System.out.println(gcd);
	}

}
