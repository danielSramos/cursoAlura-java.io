package br.com.estudos.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer outp = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(outp);
		
		bw.newLine();
		bw.write("Escrevendo uma nova linha abaixo do da ultima linha existente");
		bw.newLine();
		bw.write("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		bw.newLine();
		
		bw.close();
	}

}
