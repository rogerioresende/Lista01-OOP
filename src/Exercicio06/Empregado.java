package Exercicio06;

public class Empregado {
	private String primeiroNome;
	private String sobrenome;
	private double salario;
	 
	public Empregado(String nome, String sobrenome, double salario) {
		this.primeiroNome = nome;
		this.sobrenome = sobrenome;
		if(salario <= 0) {
			this.salario = 0;
		}else {
			this.salario = salario;
		}
	}
	
	public void Aumento(double aumento) {
		this.salario = this.salario*((aumento/100) + 1);
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	} 

}
