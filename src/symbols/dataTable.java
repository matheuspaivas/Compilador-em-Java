package symbols;
//O papel dessa classe � implementar a tabela hash da tabela de s�mbolos.
import java.util.*;

public class dataTable {
	
	private Hashtable<String, symbol> table;
	protected dataTable prev;
	
	public dataTable(dataTable p) {
		table = new Hashtable<String, symbol>();
		prev = p;
		
	}
	
	public void put(String s, symbol sym) {
		table.put(s, sym);
		
	}
	//Para recuperar um s�mbolo, uma pesquisa na chave s da hash deve ser feita.
	public symbol get(String s) {
		for(dataTable dt = this; dt != null; dt = dt.prev) {
			symbol found = (symbol)(dt.table.get(s));
			if (found != null) return found;
		}
		return null;
	}

}