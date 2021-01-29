package _22_Palindrome;

/*
 * 문제 소개
 * - 입력된 수가 팰린드롬인치 판별하시오
 * - 입력 : 12321
 * 정답: True
 * 
 * Tag >>> 반복문(while, for), if
 */

public class Main {
	
	public static void main(String[] args) {
	
		String n = "212575212";
		
		int len = n.length();
		boolean flag = true;
		
		for (int i = 0; i < len/2; i++) {
			if (n.charAt(i) != n.charAt(len-i-1)) {
				flag = false;
			}
		}
		
		System.out.println(flag);		
	}
}
