package Exercicio05;

public class Invoice {
	private int numFaturado;
	private String descricao;
	private int quantidade;
	private double precoUnitario;
	
	public Invoice(int numFaturado, String descricao, int quant, double preco) {
		this.numFaturado = numFaturado;
		this.descricao = descricao;
		if(quant < 0) {
			this.quantidade = 0;
		}else {
			this.quantidade = quant;
		}
		if(preco < 0) {
			this.precoUnitario = 0;
		}else {
			this.precoUnitario = preco;
		}
	}
	
	public double  getInvoiceAmount() {
		return this.quantidade * this.precoUnitario;
	}

	public int getNumFaturado() {
		return numFaturado;
	}

	public void setNumFaturado(int numFaturado) {
		this.numFaturado = numFaturado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quant) {
		if(quant < 0) {
			this.quantidade = 0;
		}else {
			this.quantidade = quant;
		}
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double preco) {
		if(preco < 0) {
			this.precoUnitario = 0;
		}else {
			this.precoUnitario = preco;
		}
	}

}
