package br.com.estudos.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel Ramos");
		cliente.setProfissao("Dev");
		cliente.setCpf("07616109365");
		
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente nome = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());
		

	}

}
