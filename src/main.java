//Objetivos:
/*
 * 1 - Criar a tabela de transição do DFA
 * 2 - Criar a tabela de dados
 * 		2.1 - Preencher a tabela de dados com as palavras reservadas da linguagem
 * 3 - Criar Método(s) que reconhece(rão) Tokens
 * 4 - Criar rotina de reconhecimento de Tokens 
 * */
import symbols.symbol;
import symbols.dataTable;
import javax.swing.JOptionPane;

		//Alteração desejada: Tornar o while um método 
		// para inserir palavras reservadas.
		
public class main {

	public static void main(String[] args) {
		
		Boolean newEntry = new Boolean(true);
		
		dataTable tb = null;
		
		while(newEntry){
			
			String Lex = JOptionPane.showInputDialog("Palavra Reservada");
			String Tok = JOptionPane.showInputDialog("Nome do token"); 
			String Tip = "Reservada";
			
			if((Lex != null) && (Tok != null)) {
				symbol s = new symbol(Lex, Tok,	Tip);
				tb.put(Lex, s);
			
			}
			
			else 
				newEntry = false;
			
		}
		
	}

}
