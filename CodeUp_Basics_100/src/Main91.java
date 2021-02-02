import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main91 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		int y=0, d=0; 
		
		int result = 0;
		
		if(a>13) {
			y = 113-a;
			d = 1;
		}else if(a<=13) {
			y = 13-a;
			d = 3;
		}
		
		bw.write(String.valueOf(y)+" "+String.valueOf(d));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
