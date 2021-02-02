import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main71 { // 최소 공배수

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = (br.readLine().split(" "));
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int lcm = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		
		while(true) {
			if(lcm%a==0 && lcm%b==0 && lcm%c==0) {
				break;
			}
			lcm++;
		}

		bw.write(String.valueOf(lcm));

		bw.flush();
		bw.close();
		br.close();
	}
}