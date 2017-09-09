package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
	public static void main(String[] args){
     
	 try {
	  FileReader arq = new FileReader("C:/Users/Lucas Felipe/Documents/Aulas Lucas/COMP/Trab 1/texto.txt");
	      BufferedReader lerArq = new BufferedReader(arq);
	 
	      
	      String linha = lerArq.readLine(); // l� a primeira linha
	// a vari�vel "linha" recebe o valor "null" quando o processo
	// de repeti��o atingir o final do arquivo texto
	      while (linha != null) {
	        System.out.printf("%s\n", linha);
	 
	        linha = lerArq.readLine(); // l� da segunda at� a �ltima linha
	      }
	 
	      arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }	  
	}	
}

