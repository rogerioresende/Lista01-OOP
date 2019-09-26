package Exercicio08;

public class Principal {
	
	public static void main(String[] args) {
		Ponto2D ponto1 = new Ponto2D(2, 2);
		Ponto2D ponto2 = new Ponto2D(5, 2);
		Ponto2D ponto3 = new Ponto2D(ponto1);
		
		System.out.println("PONTO1: " + ponto1.toString());
		System.out.println("PONTO2: " + ponto2.toString());
		System.out.println("PONTO3: " + ponto3.toString());
		
		System.out.println("PONTO 1 E PONTO 3 SÃO IGUAIS: " + ponto1.comparar(ponto3));
		
	    System.out.println("DISTANCIA ENTRE O PONTO 1 E PONTO 2: " + ponto1.calcularDistancia(ponto2));
		

	}

}
