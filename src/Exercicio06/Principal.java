package Exercicio06;

public class Principal {
	public static void main(String[] args) {
		Empregado emp1 = new Empregado("Pedro", "Silva", 3500);
		Empregado emp2 = new Empregado("Rog�rio", "Deus", 1500);
		
		System.out.println("O sal�rio do " + emp1.getPrimeiroNome() + " � de R$" + emp1.getSalario());
		System.out.println("O sal�rio do " + emp2.getPrimeiroNome() + " � de R$" + emp2.getSalario());
		
		System.out.println("-----Aumento de 10%-------");
		
		emp1.Aumento(10);
		emp2.Aumento(10);
		
		System.out.println("O sal�rio do " + emp1.getPrimeiroNome() + " � de R$" + emp1.getSalario());
		System.out.println("O sal�rio do " + emp2.getPrimeiroNome() + " � de R$" + emp2.getSalario());

	}

}
