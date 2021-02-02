import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main76 { // »ìÂ¦ ¾î·Á¿ò

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int h, w, n, l, d;
		int x, y;
		String [] hw = new String[2];
		hw = br.readLine().split(" ");
		h = Integer.parseInt(hw[0]);
		w = Integer.parseInt(hw[1]);
		
		int arr[][] = new int[h+1][w+1];
		
		n = Integer.parseInt(br.readLine());
		
		String [] ldxy = new String[4];
		
		for(int i = 0; i<n; i++) {
			ldxy = br.readLine().split(" ");
			l = Integer.parseInt(ldxy[0]);
			d = Integer.parseInt(ldxy[1]);
			x = Integer.parseInt(ldxy[2]);
			y = Integer.parseInt(ldxy[3]);
			
			for(int j = 0; j<l; j++) {
				if(d==0) {
					arr[x][y+j] = 1;
				}else if(d==1) {
					arr[x+j][y] = 1;
				}
			}
		}
		
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				bw.write(String.valueOf(arr[i][j]+" "));
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}