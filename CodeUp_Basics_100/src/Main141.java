import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main141 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		
		for(int i = a; i>0; i--) {
			if(i == a || i == 1) {
				for(int j = a; j>0; j--) {
					bw.write("*");
				}
			}else {
				bw.write("*");
				for(int k = a-2; k>0; k--) {
					bw.write(" ");
				}
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
