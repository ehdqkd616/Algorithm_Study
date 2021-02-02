import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main74 { 

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int min = 10000;
		int n = Integer.parseInt(br.readLine());
		String [] arr = new String[n];
		arr = br.readLine().split(" ");
		
		for(int i = 0; i<arr.length; i++) {
			if(min > Integer.parseInt(arr[i])) {
				min = Integer.parseInt(arr[i]);
			}
		}
		
		bw.write(String.valueOf(min));

		bw.flush();
		bw.close();
		br.close();
	}
}