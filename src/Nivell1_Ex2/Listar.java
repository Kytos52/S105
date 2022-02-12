package Nivell1_Ex2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Listar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		Listar.listarArbolDirectorios(args[0]);
		
	}
	
	
	
	public static void listarArbolDirectorios(String ruta) {
		
		Path path = Paths.get(ruta);
		
		int subdirectorios = 0;
		subdirectorios = path.getNameCount();
		for (int i=1; i<=subdirectorios; i++) {
			System.out.println("");
			System.out.format("subpath(0,"+i +"): %s%n", path.subpath(0,i)+ " = Directorio");
			listadoDirectorios(path.subpath(0,i).toString());
		}
		
	}
	
	public static void listadoDirectorios(String ruta) {
		ruta = "/"+ruta;
		System.out.println(ruta);
		File carpeta = new File(ruta);
			
			String[] listado = carpeta.list();
			Arrays.sort(listado);
						
			if(listado == null || listado.length == 0) {
				System.out.println("Carpeta vacia");
				
			}else {
				for ( int i = 0; i< listado.length; i++) {
					if(listado[i].charAt(0)=='.') {
						System.out.println(listado[i]+" D");
					}else {
						System.out.println(listado[i]+" F");
					}
					
					
				}
			}
		}
	

}
