package files;

import java.io.*;

public class Textos {
	public void leer(String miArchivo) {
		try {
			FileReader r = new FileReader(miArchivo);
			BufferedReader buffer = new BufferedReader(r);
			
			String tmp = "";
			while (tmp != null) {
				tmp = buffer.readLine();
				
				if(tmp == null) break;
				
				System.out.println(tmp);
			}			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void escribir(String miArchivo) {
		File f = new File(miArchivo);
		
//		Escritura
		try {
			FileWriter w = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter wr = new PrintWriter(bw);
			
			wr.write("esto es una linea de texto");
			wr.append(" - esto es una concatenacion de texto");
			
			wr.close();
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
