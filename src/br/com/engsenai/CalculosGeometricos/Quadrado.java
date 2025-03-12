package br.com.engsenai.CalculosGeometricos;

public class Quadrado {
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularPerimetro(){
		double perimetro = lado * 4;
		return perimetro;
		
	}

	public double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}

	public void mostrarDados() {
		System.out.println("-----------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("------------------");
		System.out.println(" PERÍMETRO");
		System.out.println("LADO" + lado);
		System.out.println("ÁREA " + calcularArea());
		
		
	}

	
}
