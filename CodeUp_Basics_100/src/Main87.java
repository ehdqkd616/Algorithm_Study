import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main87 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		float a = Float.parseFloat(br.readLine());
		
		String result = 50 <= a && a <= 60 ? "win" : "lose";
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
