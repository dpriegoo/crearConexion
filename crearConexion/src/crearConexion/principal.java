package crearConexion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class principal {

	public static void main(String[] args) throws IOException {
		File fichero = new File("conexion.cfg");
		
		conexion conn = leerDatos(fichero);
	}

	private static conexion leerDatos(File fichero) throws IOException {
	/*	ArrayList<conexion> contenido = new ArrayList<conexion>();
		
		BufferedReader buffLectura = new BufferedReader(new FileReader(fichero));

		String lineaLeida= buffLectura.readLine();


		
			String host = "";
			String port="";
			String dbname="";
			String username="";
			String userpass="";
			if(contenido!=null) {
			int i=0;
			while(lineaLeida!=null) {
				
			
				StringTokenizer campo = new StringTokenizer(lineaLeida, ":");
				lineaLeida = buffLectura.readLine();
			/*if(i==0 || i==1) {
				host = campo.nextToken();
				port = campo.nextToken();
			} else if (i==2|i==3) {
				dbname = campo.nextToken();
				username = campo.nextToken();
			} else {
				userpass = campo.nextToken();
				System.exit(0);
			}*/
			
		/*	switch(i) {
			  case 1:  host = campo.nextToken();
		      break;
			  case 2: port = campo.nextToken();
			  break;
			  case 3: dbname = campo.nextToken();
			  break;
			  case 4: username = campo.nextToken();
			  break;
			  case 5: userpass = campo.nextToken();
			  break;
			}
			i++;
			

			}
			
			contenido.add(new conexion(host, port, dbname, username, userpass));
			
			}
		


		
		
		return contenido;
		*/
		/////////////////////////////
		conexion contenido = new conexion();
		
	
			FileReader fch = new FileReader (fichero);
			BufferedReader bufLectura = new BufferedReader(fch);
			String lineaLeida;
			
			String[] campos;
			
			contenido.setHost(bufLectura.readLine().split(":")[1]);
			contenido.setPort(bufLectura.readLine().split(":")[1]);
			contenido.setDbname(bufLectura.readLine().split(":")[1]);
			contenido.setUsername(bufLectura.readLine().split(":")[1]);
			contenido.setUserpass(bufLectura.readLine().split(":")[1]);
			
			bufLectura.close();
			fch.close();
			System.out.println(contenido);
			return contenido;
	
		
		
	}
}


