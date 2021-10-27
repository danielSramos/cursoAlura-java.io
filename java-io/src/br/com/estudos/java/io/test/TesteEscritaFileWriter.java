package br.com.estudos.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer outp = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(outp);
		
		//FileWriter fw = new FileWriter("lorem3.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
				
		bw.write("Escrevendo uma nova linha abaixo do da ultima linha existente");
		bw.newLine();
		bw.newLine();
		bw.write("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		
		bw.close();
	}

}
