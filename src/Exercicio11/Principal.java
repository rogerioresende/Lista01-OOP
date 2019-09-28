package Exercicio11;




public class Principal {

	public static void main(String[] args) {
	
			Data data1 = new Data();
			Data data2 = new Data(3, 11, 1996);
			
			
			System.out.println(data1.toString());
			data1.avancarUmDia();
			System.out.println(data1.toString());
			

			System.out.println(data2.toString());
			data2.avancarUmDia();
			System.out.println(data2.toString());
			
			
		}
	}


