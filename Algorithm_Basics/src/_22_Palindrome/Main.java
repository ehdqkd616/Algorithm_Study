package _22_Palindrome;

/*
 * ���� �Ұ�
 * - �Էµ� ���� �Ӹ������ġ �Ǻ��Ͻÿ�
 * - �Է� : 12321
 * ����: True
 * 
 * Tag >>> �ݺ���(while, for), if
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
