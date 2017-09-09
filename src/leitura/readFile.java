package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
	
	public static void main(String[] args){
     
	 try {
		 FileReader arq = new FileReader("C:/Users/Lucas Felipe/eclipse-workspace/Analisador Lexico/src/texto.txt");
	     BufferedReader lerArq = new BufferedReader(arq);
	     
	     int caracter = 0;
	     
	     while ((caracter = lerArq.read()) != -1) {//Enquanto não é o último caracter
				
	    	 System.out.println((char)caracter);
	    	 
	     }
	      
	     arq.close();
	    
	 } catch (IOException e) {
		 System.err.printf("Erro na abertura do arquivo: %s.\n",
         e.getMessage());
	 }
	
	}	
	
}

