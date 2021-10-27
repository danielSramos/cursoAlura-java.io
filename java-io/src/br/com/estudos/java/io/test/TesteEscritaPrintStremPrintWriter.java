package br.com.estudos.java.io.test;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStremPrintWriter {

	public static void main(String[] args) throws IOException {
		//Classe usada para medir o tempo de execução de um código
		long ini = System.currentTimeMillis();
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer outp = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(outp);
		
		//FileWriter fw = new FileWriter("lorem3.txt");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
		//PrintStream ps = new PrintStream("lorem3.txt");
		
		PrintWriter ps = new PrintWriter("lorem3.txt", "UTF-8");
		
		ps.println("Escrevendo uma nova linha abaixo do da ultima linha existente");
		ps.println();
		ps.println("AAAAAAAAAAAAAAAAAAAArRRRRRRRRRRRAAAAAAAAAAAAAA");
		ps.println();

		ps.close();
		
		long fim = System.currentTimeMillis();
		System.out.println("Passaram: " + (fim - ini) + " Milissegundos");
	}

}
