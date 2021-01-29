package _40_Make_One_Recursive;
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
		
	public static int min = 99999999;

	public static void doFunc(int num, int way, int cnt) {
		
		if (way == 3 && num % 3 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		} else if (way == 2 && num % 2 == 0) {
			cnt++;
			num /= way;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		} else if (num >= 2){
			cnt++;
			num -= 1;
			for (int i = 1; i <= 3; i++)
				doFunc(num, way, cnt);
		}
		
		if (num == 1 && cnt < min) {
			min = cnt;
			return;
		}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <=3; i++)
			doFunc(n, i, 0);
		System.out.println(min);
	}
}