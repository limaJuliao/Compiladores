import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Program {

	public static void main(String[] args) throws Exception{
		
		File f = new File("jquery-3.6.0.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;		
		
		//ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		
		
	}

}
