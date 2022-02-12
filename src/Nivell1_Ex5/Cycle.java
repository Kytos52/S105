package Nivell1_Ex5;

import java.io.Serializable;

public class Cycle implements Serializable {
	
	int ruedas = 0;
	String tipo = "cycle";
	
	
	public void ride() {
		System.out.println("Estoy circulando con ride() y tengo "+ wheels()+ " ruedas");
	}
	
	public int wheels() {
		return ruedas;
	}
	
	public void balance(){
		System.out.println();
	}
	

}
