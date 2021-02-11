import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main142 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<a*2-1; i++) {
			if(i < a) {
				for(int j = 0; j<=i; j++) {
					bw.write("*");
				}		
			} else if(i >= a) {
				for(int j = a*2-i-1; j>0; j--) {
					bw.write("*");
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
