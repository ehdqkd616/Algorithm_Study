import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main125 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				bw.write(String.valueOf(i)+" ");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
