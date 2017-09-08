package symbols;
//O papel dessa classe definir uma entrada da tabela de símbolos.
public class symbol {
	
	private String token, lexema, tipo;
	
	public symbol(String tk, String lx, String tp) {
		this.token = tk;
		this.lexema = lx;
		this.tipo = tp;
	}
	
	public String getLexema(){
		return this.lexema;
		
	}
	
	public String getToken(){
		return this.token;
		
	}
	public String getTipo(){
		return this.tipo;
		
	}
	
	
}
