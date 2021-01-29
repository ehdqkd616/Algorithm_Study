package _23_ReverseString;

/*
 * 문제 소개
 * - 입력된 문자열을 뒤집어서 출력하시오
 * - 입력 : ADEFH
 * 정답: HFEDA
 * 
 * Tag >>> 반복문 (while, for), Array
 */

public class Main {
	
	public static void main(String[] args) {

		String n = "ADEFH123";  // -> HFEDA
		char str[] = n.toCharArray();
		char tmp;
		System.out.println(n);
		int len = str.length;
		
		for (int i = 0; i < len/2; i++) {
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;			
		}
		
		n = new String(str);
		System.out.println(n);
	}
}
