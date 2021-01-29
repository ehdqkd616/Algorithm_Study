package _5_CapToLow;

/*
 * 문제 소개
 * - 대문자는 소문자로, 소문자는 대문자로 변환하시오
 * - helloWorlD
 * - 정답: HELLOwORLd
 * 
 * Tag >>> 배열, for, if
 */

public class Main {
	public static void main(String[] args) {
		
		String input = "helloWorlD";
		char []arr;
		arr = input.toCharArray();
		System.out.print(arr);
		System.out.println();
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char)(arr[i] + 'A'-'a'); // 'a' 'b' ~ 'z' 'A' 'B' 'C'
			}
			else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}		
		}
		
		System.out.print(arr);
	}
}
