package Nivell1_Ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;



public class ListarYcrearArchivo {
	
	
	
	
	
	public static void main(String[] args) throws IOException	{
	
		// TODO Auto-generated method stub
		
		
		
		//String localizacionFichero ="/home/mario/eclipse-workspace/";
		//System.out.println("/home/mario/eclipse-workspace/");
		String localizacionFichero =args[0];
		ListarYcrearArchivo.listarArbolDirectorios(localizacionFichero,localizacionFichero);
		
		
	}
	  
	
	
	public static void listarArbolDirectorios(String ruta, String loc)throws IOException	  {
		
		Path path = Paths.get(ruta);
		
		int subdirectorios = 0;
		subdirectorios = path.getNameCount();
		for (int i=1; i<=subdirectorios; i++) {
			System.out.println("");
			System.out.format("subpath(0,"+i +"): %s%n", path.subpath(0,i)+ " = Directorio");
			listadoDirectorios(path.subpath(0,i).toString(),loc);
		}
		
	}
	
	public static void listadoDirectorios(String ruta,String loc) throws IOException	{
		ruta = "/"+ruta;
		System.out.println(ruta);
		File carpeta = new File(ruta);
			
			String[] listado = carpeta.list();
			Arrays.sort(listado);
						
			if(listado == null || listado.length == 0) {
				System.out.println("Carpeta vacia");
				
			}else {
				archivar("Contenido del directorio "+ruta+"\n", loc);
				for ( int i = 0; i< listado.length; i++) {
					if(listado[i].charAt(0)=='.') {
						System.out.println(listado[i]+" D");
						archivar(listado[i]+" D\n",loc);
					}else {
						
						File archivo = new File(ruta+"/"+listado[i]);
						
						//System.out.println(archivo.getAbsolutePath());
						//System.out.println(archivo.lastModified());
						Date d = new Date( archivo.lastModified());
						//System.out.println(d);
						
						
						System.out.println(listado[i]+" F Ultima modificación: "+d );
						archivar(listado[i]+" F Ultima modificación: "+d+"\n",loc);
					}
					
					
				}
			}
			
	}
	
	public static void archivar(String linea, String loc) throws IOException{
		
		String archivo =loc+"/resultado1.txt";
		System.out.println(archivo);
		//Path file = Paths.get(archivo);
		File file = new File(archivo);

		BufferedWriter bw = null;
	    FileWriter fw = null;
		try {
		    if (!file.exists()) {
	            file.createNewFile();
	        }
		      
	       
	        fw = new FileWriter(file.getAbsoluteFile(), true);
	        bw = new BufferedWriter(fw);
	        bw.write(linea);
	        System.out.println("información agregada!");
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	                       
	            if (bw != null)
	                bw.close();
	            if (fw != null)
	                fw.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	}
}
