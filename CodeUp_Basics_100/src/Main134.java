import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main134 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int n = Integer.parseInt(br.readLine());
		int k = 1;
		int squareI;
		double squareD;
		
		while(true) {
			squareI = (int)Math.sqrt(n-k);
			squareD = Math.sqrt(n-k);
			if(squareI == squareD) {
				break;
			}
			k++;
		}
		
		bw.write(String.valueOf(k)+" "+String.valueOf(squareI));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
