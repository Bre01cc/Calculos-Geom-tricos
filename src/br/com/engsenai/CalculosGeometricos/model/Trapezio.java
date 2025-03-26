package br.com.engsenai.CalculosGeometricos.model;

public class Trapezio {
	public double altura;
	public double baseMaior;
	public double baseMenor;
	private double area;
	
	public void setAlturas(double altura) {
		this.altura = altura;
	}
	public void setBasesMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	public void setBasesMenor(double baseMenor) {
		
		this.baseMenor = baseMenor;
	}
	private double calcularArea() {

		area = altura*(baseMaior + baseMenor)/2;
		return area;
	}
	public void mostrarFicha() {
		System.out.println("=========================");
		System.out.println("Dados do trapézio");
		System.out.println("");
		System.out.println("Altura:"+ altura);
		System.out.println("Base Maior:"+ baseMaior);
		System.out.println("Base Menor:"+ baseMenor);
		System.out.println("Área: " + calcularArea());
		System.out.println("==========================");
	}
}
	
