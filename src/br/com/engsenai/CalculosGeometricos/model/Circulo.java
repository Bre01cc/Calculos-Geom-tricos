package br.com.engsenai.CalculosGeometricos.model;

public class Circulo {
	double raio;
	private double area;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	private double calcularArea() {

		area = Math.PI*(raio*raio);

		return area;
	}
	
	public void mostrarFicha() {
		
		System.out.println("=================================================");
		System.out.println("Dados do Circulo");
		System.out.println("-----------------------");
		System.out.println("Raio do Circulo:"+ raio);
		System.out.println("A área do circulo:" + calcularArea());
		System.out.println("-------------------------------------------------");
		System.out.println("Espero que o resultado tenha sanado a sua dúvida");
		System.out.println("=================================================");
		
	}
	

}
