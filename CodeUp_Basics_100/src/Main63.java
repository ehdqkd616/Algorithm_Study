import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main63 {

	public static void main(String[] args) throws IOException { // BufferdReader, BufferedWriter
		
		// 우선 우리는 일반적으로 자바에서 입력을 받으려면 java.util 패키지에 있는 Scanner 클래스를 import해온다. 
		// 이렇게 단순히 import를 하고 Scanner sc = new Scanner(System.in); 처럼 써주는것 만으로도 간단히 스캐너를 사용할 수 있다.
		// 그러나 스캐너의 경우 사용하기 편리하지만 속도가 느리다는 치명적인 단점이 있다.
		// 속도가 느린 Scanner보다 BufferedReader를 이용하는게 훨씬 빠르다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String rgb[] = br.readLine().split(" ");
		int r = Integer.parseInt(rgb[0]);
		int g = Integer.parseInt(rgb[1]);
		int b = Integer.parseInt(rgb[2]);
		int i, j, k;
		int count = r*g*b;
		
		for(i=0; i<r; i++) {
			for(j=0; j<g; j++) {
				for(k=0; k<b; k++){				
					bw.write(i+" "+j+" "+k+"\n");
				}
			}
		}
		bw.write(String.valueOf(count));
		
		bw.flush();
		bw.close();
		br.close();
	}
}