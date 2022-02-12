package Nivell1_Ex5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
	
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		
		
		Cycle bici1 = new Cycle();
		
		System.out.println("Creo un objeto bici1 de la clase Cycle y ejecuto el método ride:");
		bici1.ride(); 
		
		
		 try {
	            System.out.println("Guardando objeto Cycle en el fichero bicis.ser ");

	            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
	            new FileOutputStream("bicis.ser") );
	            escribiendoFichero.writeObject(bici1);
	            escribiendoFichero.close();
	            System.out.println("Serializado objeto Cycle bici1  en el fichero bicis.ser ");

	            
	            System.out.println("Recuperando fichero bicis.ser y copiando el objeto bici1 en el objeto bici2");

	            ObjectInputStream leyendoFichero = new ObjectInputStream( 
	            new FileInputStream("bicis.ser") );

	            
	            Cycle bici2 = (Cycle) leyendoFichero.readObject();
	            leyendoFichero.close();

	            System.out.println("Compruebo que lo hemos recuperado correctamente ejecutando ride() en bici2");
	            bici2.ride();
	           
	            

	            
	        } catch (Exception e) {
	            System.out.println( e.getMessage() );
	        }
		
	}

}
