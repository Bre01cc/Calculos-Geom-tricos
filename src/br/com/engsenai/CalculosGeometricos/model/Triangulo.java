package br.com.engsenai.CalculosGeometricos.model;

public class Triangulo {
	private double altura;

	private double base;

	public double area;

	public void setAlturas(double altura) {

	this.altura = altura;
	}
	public void setBases(double base) {
		this.base = base;
	}

	private double calcularArea() {

	area =base * altura;

	return area;

	}
	
	public void mostrarFicha() {
		System.out.println("======================");
		System.out.println("Dados do Triângulo");
		System.out.println("======================");
		System.out.println("Altura: " + altura);
		System.out.println("Base: " + base);
		System.out.println("Área: " + calcularArea());
		System.out.println("=======================");
		
	}
}
