package Exercicio09;

public class Principal {
	public static void main(String[] args) {
		
		Ponto2D ponto1 = new Ponto2D(2,-5);
		Ponto2D ponto2 = new Ponto2D(1 ,-4);
		Reta reta1 = new Reta(ponto1, ponto2);
		Reta reta2 = new Reta(2,-6);
		
		System.out.println("EQUA플O DA RETA 1: " + reta1.toString());
		System.out.println("EQUA플O DA RETA 2: " + reta2.toString());
		
		System.out.println("O PONTO(2,-5) PERTENCE A RETA 2: " + reta2.pontoPertenceReta(ponto1));
		System.out.println("O PONTO(1,-4) PERTENCE A RETA 2: " + reta2.pontoPertenceReta(ponto2));
		
		Reta reta3 = new Reta(-1, 2);
		Reta reta4 = new Reta(3, 4);
		
		System.out.println("EQUA플O DA RETA 3: " + reta3.toString());
		System.out.println("EQUA플O DA RETA 4: " + reta4.toString());
		
		System.out.println("PONTO DE INTERSE플O DA RETA 2 E 3: " + reta3.pontoDeInterse豫o(reta4));
	}

}
