import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {
	
	static Scanner s;
	static PrintWriter pw;

	public static void main(String[] args) {
		try {
			s = new Scanner(new File("jquery-3.6.0.js"));
			pw =  new PrintWriter("Saida.txt");
			
			while (s.hasNextLine()) {
				String linha = s.nextLine().replace("\t", "");
				linha = linha.replace("\r\n", "");
				
				if (!comentario(linha)) {
					pw.write(linha.trim());
				}
			}
			
			s.close();
			pw.close();
			
			IsiScanner sc1 = new IsiScanner("Saida.txt");
			Token token = null;
			
			do {
				token = sc1.nextToken();
				if (token != null) {
					System.out.println(token);
				}
			} while (token != null);
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean comentario(String linha) {
		if (linha.startsWith("//")) {
			return true;
		}
		
		if (linha.startsWith("/*")) {
			while (!linha.endsWith("*/") && s.hasNextLine()) {
				linha = s.nextLine();
			}
			return true;
		}
		
		return false;
	}
}
