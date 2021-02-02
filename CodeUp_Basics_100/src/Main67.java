import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main67 {

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++) {
			if(i%3!=0) {
				bw.write(String.valueOf(i+" "));				
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}