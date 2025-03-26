package br.com.engsenai.CalculosGeometricos.model;

	public class Quadrado {

		private double lado;

		public double area;

		public double perimetro;

		public void setLado(double lado) {

		this.lado= lado;

		}

		private double calcularPerimetro() {

		perimetro = (lado * 4);
		return perimetro;

		}

		private double calcularArea() {

		area=(lado*lado);
		return area;
		}

	public void mostrarDados() {

		System.out.println("--------------");
		System.out.println("Forma geométrica: Quadrado");
		System.out.println("--------------");
		System.out.println("MEDIDAS");
		System.out.println("lado: "+lado);
		System.out.println("--------------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Perímetro: " + calcularPerimetro());

		System.out.println("======================");
		
	}


	
		
	}

	

	

		



