package lip.analex;

public enum Token {
        PARENTESIS_ESQ('('),
	PARENTESIS_DIR(')'),
	OPERADOR_SOMA('+'),
	OPERADOR_MULT('*'),
	OPERADOR_DIVI('/'),
	OPERADOR_SUBT('-'),
	OPERADOR_ATRIB('='),
	PONTO_VIRGULA(';'),
	FIM('F'),
	IDENTIFICADOR('I'),
	LITERAL_INTEIRO('L'),
        OPERADOR_EXP('^'),
	LITERAL_FLUTUANTE('.'),
        
         //begin e end TOKEN
        BEGIN('$'),
        END('#');
        
        
	private char valor;
	
	Token(char valor) {
		this.valor = valor;
	}
	
	public char getValor() {
		return this.valor;
	}
}
