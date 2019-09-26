package Exercicio09;

public class Reta {
	private double a;
    private double b;
     
    public Reta(double a, double b) {
    	this.a = a;
    	this.b = b;
    }
    public Reta(Ponto2D ponto1, Ponto2D ponto2) {
    	this.a = (ponto2.getY() - ponto1.getY())/(ponto2.getX() - ponto1.getX()); //a =(y2 – y1) / (x2 – x1)
    	this.b = -1 * this.a * ponto1.getX() + ponto1.getY();                    //y – y1 = a * (x – x1) --> b = -ax1 + y1
    }
    public String toString() {
    	if(this.b < 0) {
    		return "y=" + this.a + "x" + this.b;
    	}
    	return "y=" + this.a + "x+" + this.b; 
    }
    public boolean pontoPertenceReta(Ponto2D ponto) {
    	double aux1;
    	aux1 = this.a * ponto.getX() + this.b;
    	if(aux1 == ponto.getY()) {
    		return true;
    	}
    	return false;
    }
    public String pontoDeInterseção(Reta reta) {
    	if(this.a == reta.getA()) {
    		return null;
    	}
    	double x = (reta.getB() + (-1 * this.b)) / (this.a + (-1 * reta.getA()));
    	double y = this.a * x + this.b;
    	return "(" + x + "," + y + ")";
    }
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}

}
