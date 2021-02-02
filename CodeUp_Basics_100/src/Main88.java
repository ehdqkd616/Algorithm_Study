import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main88 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int y = Integer.parseInt(br.readLine());
		
		String result = (y%4==0)&&(y%100!=0) || (y%400==0) ? "yes" : "no";
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
