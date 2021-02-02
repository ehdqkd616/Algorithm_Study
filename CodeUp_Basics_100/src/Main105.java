import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main105 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = new String[3];
		arr = br.readLine().split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);

		int max = 0;

		String result = null;

		max = ((a >= b ? a : b) >= c) ? (a >= b ? a : b) : c;

		if (max == a) {
			if (a < b + c) {
				result = "»ï°¢Çü";

				if (a == b || a == c || b == c) {
					result = "ÀÌµîº¯»ï°¢Çü";
					if (a == b && a == c) {
						result = "Á¤»ï°¢Çü";
					}
				} else if (a * a == (b * b + c * c)) {
					result = "Á÷°¢»ï°¢Çü";
				}
			} else if (a >= b + c) {
				result = "»ï°¢Çü¾Æ´Ô";
			}

		} else if (max == b) {

			if (b < a + c) {
				result = "»ï°¢Çü";

				if (a == b || a == c || b == c) {
					result = "ÀÌµîº¯»ï°¢Çü";
					if (b == c && b == a) {
						result = "Á¤»ï°¢Çü";
					}
				} else if (a == c) {
					result = "ÀÌµîº¯»ï°¢Çü";
				} else if (b * b == (a * a + c * c)) {
					result = "Á÷°¢»ï°¢Çü";
				}
			} else if (b >= a + c) {
				result = "»ï°¢Çü¾Æ´Ô";
			}

		} else if (max == c) {

			if (c < b + a) {
				result = "»ï°¢Çü";

				if (a == b || a == c || b == c) {
					result = "ÀÌµîº¯»ï°¢Çü";
					if (c == a && c == b) {
						result = "Á¤»ï°¢Çü";
					}
				} else if (b == a) {
					result = "ÀÌµîº¯»ï°¢Çü";
				} else if (c * c == (b * b + a * a)) {
					result = "Á÷°¢»ï°¢Çü";
				}
			} else if (c >= b + a) {
				result = "»ï°¢Çü¾Æ´Ô";
			}
		}

		bw.write(result);

		bw.flush();
		bw.close();
		br.close();

	}

}
