package br.com.engsenai.CalculosGeometricos.dao;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.model.Triangulo;
import br.com.engsenai.CalculosGeometricos.ui.Menu;

public class TrianguloDAO {
	public static void criarTrapezio(){
		 
		Triangulo trapezio = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		
		
		
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual o altura do triângulo? ");
		trapezio.setAlturas(leitor.nextDouble());
		
		System.out.println("Qual a base do triângulo? ");
		trapezio.setBases(leitor.nextDouble());
		
		
		
		trapezio.mostrarFicha();
		
		Menu.continuar(leitor, "Breno");
			
		 }

}
