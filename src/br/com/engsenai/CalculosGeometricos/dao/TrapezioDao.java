package br.com.engsenai.CalculosGeometricos.dao;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.model.Trapezio;
import br.com.engsenai.CalculosGeometricos.ui.Menu;


public class TrapezioDao {
	public static void criarTrapezio(){
		 
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		
		
		
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual o altura do trapézio? ");
		trapezio.setAlturas(leitor.nextDouble());
		
		System.out.println("Qual a base maior do trapézio? ");
		trapezio.setBasesMaior(leitor.nextDouble());
		
		System.out.println("Qual a base menor do trapézio? ");
		trapezio.setBasesMenor(leitor.nextDouble());
		
		trapezio.mostrarFicha();
		
		Menu.continuar(leitor, "Breno");
			
		 }
	}


