package Nivell1_Ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(args[0]);
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;

	      try {
	         
	         archivo = new File (args[0]);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	        
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}

}
