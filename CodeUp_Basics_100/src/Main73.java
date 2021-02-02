import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main73 { // Reverse

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		String [] arr = new String[n];
		arr = br.readLine().split(" ");
		int [] reverseArr = new int[n];
		
		for(int i = 0; i<arr.length; i++) {
			reverseArr[arr.length-1-i] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 0; i<arr.length;i++) {
			bw.write(String.valueOf(reverseArr[i])+" ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}