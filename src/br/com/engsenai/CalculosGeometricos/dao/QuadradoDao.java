package br.com.engsenai.CalculosGeometricos.dao;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.model.Quadrado;

public class QuadradoDao {
	
	public static void criarQuadrado(){
		 
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.println("Qual o lado do quadrado? ");
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarDados();
		
		//Fechar o objeto scanner, remover da memória
		leitor.close();
		
		 }

	}
