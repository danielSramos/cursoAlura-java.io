package br.com.estudos.java.io.test;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("lorem4.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			//System.out.println(linha);

			Scanner lerLinha = new Scanner(linha);
			lerLinha.useLocale(Locale.US); //Definir um local padrao para a maquina virtual se basear

			lerLinha.useDelimiter(",");
			
			
			String tipoConta = lerLinha.next();
			int agencia = lerLinha.nextInt();
			int numero = lerLinha.nextInt();
			String titular = lerLinha.next();
			double saldo = lerLinha.nextDouble();
						
			System.out.println(String.format(new Locale("pt", "br"), "%s - %04d-%08d %20s, %05.2f", tipoConta, agencia, numero, titular, saldo));
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			lerLinha.close();
		}
		scanner.close();
	}
}
