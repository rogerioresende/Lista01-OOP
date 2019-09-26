package Exercicio03;

public class Principal {

	public static void main(String[] args) {
		//Porta
		Porta porta = new Porta();
		porta.dimensaoX = 0.60;
		porta.dimensaoY = 1.80;
		porta.dimensaoZ = 0.10;
		porta.abre();
		porta.pinta("Azul");
		System.out.println("Dimensão X: " + porta.dimensaoX);
		System.out.println("Dimensão y: " + porta.dimensaoY);
		System.out.println("Dimensão Z: " + porta.dimensaoZ);
		System.out.println("Cor da porta: " + porta.cor);
		System.out.println("A porta esta aberta: " + porta.estaAberta());
		System.out.println();
		
		
		//Casa
		Casa casa = new Casa();
		casa.pinta("Amarela");
		casa.porta1.dimensaoX = 0.60;
		casa.porta1.dimensaoY = 1.80;
		casa.porta1.dimensaoZ = 0.10;
		casa.porta2.dimensaoX = 0.60;
		casa.porta2.dimensaoY = 1.80;
		casa.porta2.dimensaoZ = 0.10;
		casa.porta3.dimensaoX = 0.60;
		casa.porta3.dimensaoY = 1.80;
		casa.porta3.dimensaoZ = 0.10;
		casa.porta1.abre();
		casa.porta2.fecha();
		casa.porta3.abre();

		System.out.println("Cor da casa: " + casa.cor);
		System.out.println("A casa tem : " + casa.totalDePortas() + " portas ");
		System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
		System.out.println();
	
		//Edificio
		Edificio edificio = new Edificio();
		edificio.pinta("Rosa");
		edificio.adicionaPorta(porta);
		edificio.adicionaPorta(porta);
		edificio.adicionarAndar();
		System.out.println("Cor do edifício: " + edificio.cor);
		System.out.println("Total de portas: " + edificio.totalDePortas());
		System.out.println("Total de portas abertas: " + edificio.quantasPortasEstaoAbertas());
		System.out.println("Total de andares: " + edificio.totalDeAndares);
		}
	}