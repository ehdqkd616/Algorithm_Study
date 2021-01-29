package _20_369;

/*
 * ¹®Á¦ ¼Ò°³
 * - 100±îÁö 369 °ÔÀÓÀ» ¾Æ·¡¿Í °°ÀÌ ÁøÇàÇÏ½Ã¿À.
 * Á¤´ä: 1 2 Â¦ 4 5 Â¦ 7 8 Â¦ 10 11 12 Â¦ 14 15 Â¦ 17 18 Â¦ 20 21 22 Â¦ 24 25 Â¦ 27
 * 28 Â¦ Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 40 41 42 Â¦ 44 45 Â¦ 47 48 Â¦ 50 51 52
 * Â¦ 54 55 Â¦ 57 58 Â¦ Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 70 71 72 Â¦ 74 75 Â¦ 77
 * 78 Â¦ 80 81 82 Â¦ 84 85 Â¦ 87 88 Â¦ Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ Â¦ Â¦ Â¦Â¦ 100
 * 
 * Tag >>> ¹Ýº¹¹®(while, for), if, Method
 */

public class Main {
	
	public static int getNum (int i) {
		int j = 0;
		
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				j++;
			i /= 10;
		}
	
		
		return j;
	}
	public static void main(String[] args) {
		int n = 100;
		
		for (int i = 1; i <= n; i++) {
			int cnt = getNum(i);
			
			if (cnt == 0) {
				System.out.print(i+ " ");
			}
			else {
				for (int l = 0; l < cnt; l++) {
				 System.out.print("Â¦");
				}
				System.out.print(" ");
			}
		}
		
		
	}
}
