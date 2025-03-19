package br.com.engsenai.CalculosGeometricos.model;

	public class Quadrado {

		private double lado;

		public double area;

		public double perimetro;

		public void setLado(double lado) {

		this.lado= lado;

		}

		public void calcularPerimetro() {

		perimetro = (lado * 4);

		}

		public void calcularArea() {

		area=(lado*lado);
		}

	public void mostrarDados() {

		System.out.println("--------------");

		System.out.println("Forma geométrica: Quadrado");

		System.out.println("--------------");

		System.out.println("MEDIDAS");

		System.out.println("lado: "+lado);

		System.out.println("--------------");

		System.out.println("RESOLUÇÕES OBTIDAS");

		System.out.println("Área: "+ area);

		System.out.println("Perimetro:" + perimetro);

		System.out.println("--------------");
		
	}


	
		
	}

	

	

		



