package Exercicio10;

public class PlanoCartesiano {
	
	private double raio;
	private Ponto ponto;
	
	public PlanoCartesiano(double raio,Ponto ponto) {
		this.raio=raio;
		this.ponto=ponto;
		
	}
	public PlanoCartesiano() {
		
	}
	public PlanoCartesiano(double raio) {
		this.raio=raio;
		this.ponto= new Ponto(0,0);
		
	}
	public double getraio() {
		return raio;
	}
	public void setraio(double raio) {
		this.raio=raio;
	}
	public void inflar(double valor) {
		this.raio=this.raio + valor;
	}
	public void desinflar(double valor) {
		if(this.raio >= valor) {
			this.raio=this.raio-valor;
			
		}
	
	}
	public void inflar() {
		inflar(1);
	}
	public void desinflar() {
		desinflar(1);
		
	}
	public void mover() {
		if(this.ponto!=null) {
		
			this.ponto.setx(0);
			this.ponto.sety(0);
		}
	}
	public void mover(double x,double y) {
			this.ponto =new Ponto(x,y);
			
		}
	public void mover(Ponto ponto) {
		if(ponto!=null) {
			this.ponto=ponto;
		}
	}
		public double calArea() {
			return Math.PI*this.raio*this.raio;
		}
	}
	

