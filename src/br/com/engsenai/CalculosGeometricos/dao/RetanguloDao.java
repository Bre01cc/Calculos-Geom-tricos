package br.com.engsenai.CalculosGeometricos.dao;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.model.Retangulo;

public class RetanguloDao {
	public static void criarRetangulo(){
		 
		Retangulo retangulo= new Retangulo();
		
		System.out.println();
		System.out.println("Criando um objeto retângulo...");
		System.out.println("================================");
		
		
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual a altura do retângulo? ");
		retangulo.setAlturas(leitor.nextDouble());
		
		System.out.println("Qual a base do retângulo? ");
		retangulo.setBases(leitor.nextDouble());
		
		retangulo.mostrarFicha();
		
		//Fechar o objeto scanner, remover da memória
		//leitor.close();
		
		
		 }

}
