package br.com.engsenai.CalculosGeometricos.dao;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.model.Circulo;
import br.com.engsenai.CalculosGeometricos.ui.Menu;

public class CirculoDao {
	public static void criarCirculo(){
		 
		Circulo circulo = new Circulo();
		
		System.out.println();
		System.out.println("Criando um objeto Circulo...");
		System.out.println("Qual o raio do circulo? ");
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		circulo.setRaio(leitor.nextDouble());
		
		circulo.mostrarFicha();
		
		Menu.continuar(leitor, "Breno");

}
}