import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main106 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = new String[3];
		arr = br.readLine().split(" ");

		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);

		if (a+b <= c) bw.write("»ï°¢Çü¾Æ´Ô");
		else if (a==b && b==c) bw.write("Á¤»ï°¢Çü");
		else if (a==b || b==c) bw.write("ÀÌµîº¯»ï°¢Çü");
		else if (a*a + b*b == c*c) bw.write("Á÷°¢»ï°¢Çü");
		else bw.write("»ï°¢Çü");
		
		bw.flush();
		bw.close();
		br.close();

	}

}
