package Exercicio11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	Calendar data = Calendar.getInstance();	
	
	public Data(int dia, int mes, int ano ) {
		String date = dia + "/" + mes + "/" + ano;
		try { 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
			sdf.setLenient(false); 
			sdf.parse(date); 
		}catch (ParseException e) {
			System.out.println("DATA INVÁLIDA"); 
			return;
		} 
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Data() {
		this.dia = this.data.get(Calendar.DAY_OF_MONTH);
		this.mes = this.data.get(Calendar.MONTH) + 1;
		this.ano = this.data.get(Calendar.YEAR);
	}
	
	public String toString() {
		if(this.dia < 10 && this.mes < 10) {
			return  "0" + this.dia + "/0" + (this.mes) + "/" +this.ano;
		}
		if(this.dia < 10) {
			return  "0" + this.dia + "/" + (this.mes) + "/" +this.ano;
		}
		if(this.mes < 10) {
			return  this.dia + "/0" + (this.mes) + "/" +this.ano;
		}
		return  this.dia + "/" + (this.mes) + "/" +this.ano;
	}
	
	public void avancarUmDia() {
		this.data.set(this.ano, (this.mes - 1), this.dia);
		this.data.add(Calendar.DAY_OF_MONTH, 1);
		this.dia = this.data.get(Calendar.DAY_OF_MONTH);
		this.mes = this.data.get(Calendar.MONTH) + 1;
		this.ano = this.data.get(Calendar.YEAR);
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

}
