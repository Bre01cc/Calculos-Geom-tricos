package br.com.engsenai.CalculosGeometricos.ui;

import java.util.Scanner;

import br.com.engsenai.CalculosGeometricos.dao.QuadradoDao;
import br.com.engsenai.CalculosGeometricos.dao.RetanguloDao;
import br.com.engsenai.CalculosGeometricos.model.Quadrado;

public class Menu {
	public  static void mostrarMenu() {
		System.out.println("------------------------");
		System.out.println("CACULADORA DE POLÍGNOS");
		System.out.println("-----------------------");
		System.out.println("1-Qudrado");
		System.out.println("2-Rêtangulo");
		System.out.println("3-Trapêzio");
		System.out.println("4-Triângulo");
		System.out.println("5-Circunfêrencia");
		System.out.println("--------------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao==1) {
			QuadradoDao.criarQuadrado();
			
		}else if (opcao==2) {
			RetanguloDao.criarRetangulo();
			
		}
		
		else if(opcao ==3){
		}else {
			System.out.println("Essa opção ainda não foi implementada");
		}
		
		leitor.close();
	}
		
		public static void continuar(Scanner leitor, String nome) {
			String resposta ="";
			
			//se for verdadeiro é falso
			while (!resposta.equals("C")|| !resposta.equals("S")) {
				System.out.print(nome +" você, deseja efetuar outro Cálculo (C ou S)/?");
			   resposta = leitor.next();
				
				
			}
			
			if(resposta.equalsIgnoreCase("s")) {
			Menu.mostrarMenu();
			}
				

		


}

}
