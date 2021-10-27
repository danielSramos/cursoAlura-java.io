package br.com.estudos.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestaCopiarArquivo {

	public static void main(String[] args) throws IOException {

		//Abrindo uma conexão via socket
		Socket socket = new Socket();		

		//Abrindo e lendo o arquivo em forma de binario -> character -> string
		InputStream fis = socket.getInputStream(); //System.in; //new FileInputStream("lorem.txt"); //lendo de um arquivo
		Reader ist = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(ist);

		//abrindo e escrevendo o conteudo de uma string em um arquivo
		OutputStream fos = socket.getOutputStream(); //System.out; //new FileOutputStream("lorem2.txt");
		Writer ost = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ost);

		//adicionando a string a uma variavel do tipo string
		String palavra = br.readLine();

		//laço de iteração para ler a linha e escrever no novo arquivo
		while (palavra != null && !palavra.isEmpty()) {
			bw.write(palavra);
			bw.newLine();
			bw.flush();
			palavra = br.readLine();
		}

		//Fechando os input e output stream
		br.close();
		bw.close();
	}
}
