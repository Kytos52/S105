package Nivell1_Ex1;
import java.io.File;
import java.util.Arrays;

public class GestionDirectorios {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//String ruta="/home/mario/eclipse-workspace/utils";
		
		
		
		System.out.println(args[0]);
		String ruta= args[0];
		
		File carpeta = new File(ruta);
		String[] listado = carpeta.list();
		Arrays.sort(listado);
		
		
		if(listado == null || listado.length == 0) {
			System.out.println("Carpeta vacia");
			
		}else {
			for ( int i = 0; i< listado.length; i++) {
				System.out.println(listado[i]);
			}
		}
	
	


	}
}