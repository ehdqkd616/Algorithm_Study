import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main96 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int a = Integer.parseInt(br.readLine());
		String result = null;
		
		switch(a/10){
		    case 10 :
		    case 9 :
		    	result = "A";
		    	break;
		    case 8 :
		    	result = "B";
		    	break;
		    case 7 :
		    	result = "C";
		    	break;
		    case 6 :
		    	result = "D";
		    	break;
		    default :
		    	result = "F";
		    	break;
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
