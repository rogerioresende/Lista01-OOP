

package Exercicio02;

public class Banco {

	ContaCorrente conta[] = new ContaCorrente[50];
	
	int i = 0;
	void criarConta(String numConta, double saldo, boolean statusEspecial, double limite) {
	this.conta[i] = new ContaCorrente();
	this.conta[i].numConta = numConta;
	this.conta[i].saldo = saldo;
	this.conta[i].statusEspecial = statusEspecial;
	this.conta[i].limiteDisponivel = limite;
	this.conta[i].limiteAtual = limite;
	this.conta[i].conjMovimentacao[0] = new Movimentacao();
	this.conta[i].conjMovimentacao[0].descricao = "Conta criada com sucesso";
	this.conta[i].conjMovimentacao[0].valor = saldo;
	this.conta[i].conjMovimentacao[0].tipoDeMovimentacao = "Criação de conta";
	i++;
	System.out.println("Conta " + numConta + " criada com sucesso");
	
	}
		double sacar(String numConta, double valor) {
			int j = 0, l = 0;
			while(this.conta[j] != null) {
				if(this.conta[j].numConta.equals(numConta) ) {
					if((this.conta[j].saldo + this.conta[j].limiteAtual) >= valor) {
						if(valor <= this.conta[j].saldo) {
							this.conta[j].saldo = this.conta[j].saldo - valor;
						}else {
							this.conta[j].saldo = this.conta[j].saldo - valor;
							this.conta[j].limiteAtual = this.conta[j].saldo + this.conta[j].limiteAtual;
						}
						while(l < 50) {
							if(this.conta[j].conjMovimentacao[l] == null) {
								this.conta[j].conjMovimentacao[l] = new Movimentacao();
								this.conta[j].conjMovimentacao[l].descricao = "Saque";
								this.conta[j].conjMovimentacao[l].tipoDeMovimentacao = "Débito";
								this.conta[j].conjMovimentacao[l].valor = valor;
								l = 50;
							}
							l++;
						}
						System.out.println("Saque realizado com sucesso");
						return valor;
					}
					System.out.println("Saldo insuficiente");
					return -1;
				}
				j++;
			}
			System.out.println("Conta não encontrada");
			return -1;
		}
		void depositar(String numConta, double valor) {
			int j = 0, l = 0;
			while(this.conta[j] != null) {
				if(this.conta[j].numConta.equals(numConta) ) {
					while(l < 50) {
						if(this.conta[j].conjMovimentacao[l] == null) {
							this.conta[j].conjMovimentacao[l] = new Movimentacao();
							this.conta[j].conjMovimentacao[l].descricao = "Depósito";
							this.conta[j].conjMovimentacao[l].tipoDeMovimentacao = "Débito";
							this.conta[j].conjMovimentacao[l].valor = valor;
							l = 50;
						}
						l++;
					}
					if(this.conta[j].limiteAtual < this.conta[j].limiteDisponivel) {
						this.conta[j].limiteAtual = valor + this.conta[j].limiteAtual;
						valor = this.conta[j].limiteAtual - this.conta[j].limiteDisponivel;
						this.conta[j].saldo = valor;
					}else {
						this.conta[j].saldo = this.conta[j].saldo + valor;
					}
					System.out.println("Deposito realizado com sucesso");
					return;
				}
				j++;
			}
			System.out.println("Conta não encontrada");
		}
		double emisaoSaldo(String numConta) {
			int j = 0;
			while(this.conta[j] != null) {
				if(this.conta[j].numConta.equals(numConta) ) {
					return conta[j].saldo;
				}
				j++;
			}
			System.out.println("Conta não encontrada");
			return -1;
		}
		void emisaoExtrato(String numConta) {
			int j = 0;
			while(this.conta[j] != null) {
				if(this.conta[j].numConta.equals(numConta) ) {
					System.out.println("Extrato");
					System.out.println("Número da conta: " + this.conta[j].numConta);
					System.out.println("Saldo: "+ this.conta[j].saldo);
					System.out.println("Especial: " + this.conta[j].statusEspecial);
					System.out.println("Limite atual: " + this.conta[j].limiteAtual );
					System.out.println("Limite disponível: " + this.conta[j].limiteDisponivel );
					System.out.println( );
					System.out.println("Movimentação");
					int l = 0;
					while(this.conta[j].conjMovimentacao[l] != null) {
						System.out.println("Descrição: " + this.conta[j].conjMovimentacao[l].descricao);
						System.out.println("Tipo: " + this.conta[j].conjMovimentacao[l].tipoDeMovimentacao);
						System.out.println("Valor: " + this.conta[j].conjMovimentacao[l].valor);
						System.out.println( );
						l++;
					}
				}
				j++;
			}
		}
		void transfParaConta(String numConta01, String numConta02 , double valor) {
			double transf = sacar(numConta01, valor);
			if(transf > -1) {
				depositar(numConta02, valor);
			}
		}
	}
	