package Exercicio05;

public class Principal {
	
public static void main(String[] args) {
		
		Invoice invoice = new Invoice(5487, "placa mãe",4,360);
		
		System.out.println("Total:" + invoice.getInvoiceAmount());
		
		
		Invoice invoice02 = new Invoice(1234, "placa mãe", 2, 250);
		
		System.out.println("Quantidade: " + invoice02.getQuantidade());
		System.out.println("Preço: " + invoice02.getPrecoUnitario());
		

	}

}


