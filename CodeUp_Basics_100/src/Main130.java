import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main130 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		while(a>0) {
			a = a/10;
			cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
