package Exercicio03;

public class Edificio {

	String cor;
	int totalDePortas; int totalDeAndares;
	Porta portas[] = new Porta[50];
	
	
		void pinta(String s) {
			this.cor = s;
		}
		
		int quantasPortasEstaoAbertas() {
			int i = 0, cont = 0;
			while(portas[i] != null) {
				if(portas[i].estaAberta() == true) {
					cont++;
				}
				i++;
			}
			return cont;
		}
		
		void adicionaPorta(Porta p) {
			int i = 0;
			while(portas[i] != null){
				i++;
			}
			portas[i] = new Porta();
			portas[i] = p;
			
		}
		int totalDePortas() {
			int i = 0, cont = 0;
			while(portas[i] != null){
				i++;
				cont++;
			}
			return cont;
		}
		
		void adicionarAndar() { this.totalDeAndares++;
		}
		int totalDeAndares() { return this.totalDeAndares;
		}
	}
