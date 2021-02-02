import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main95 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		String[] arr = new String[2];
		arr = br.readLine().split("");
		int a=0, b=0, c=0;
		
		a = Integer.parseInt(arr[0]);
		b = Integer.parseInt(arr[1]);
		
		c = Integer.parseInt((String.valueOf(b)+String.valueOf(a)));
		int result = c*2;

		String resultStr = null;

		if(result>=100) {
			result = result - 100;
		}
		
		if(result>50) {
			resultStr = "OH MY GOD";
		}else {
			resultStr = "GOOD";
		}
		
		bw.write(String.valueOf(result)+"\n");
		bw.write(resultStr);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
