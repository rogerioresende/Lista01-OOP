package Exercicio05;

public class Principal {
	
public static void main(String[] args) {
		
		Invoice invoice = new Invoice(5487, "placa m�e",4,360);
		
		System.out.println("Total:" + invoice.getInvoiceAmount());
		
		
		Invoice invoice02 = new Invoice(1234, "placa m�e", 2, 250);
		
		System.out.println("Quantidade: " + invoice02.getQuantidade());
		System.out.println("Pre�o: " + invoice02.getPrecoUnitario());
		

	}

}


