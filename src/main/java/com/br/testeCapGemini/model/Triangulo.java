package com.br.testeCapGemini.model;

/**
 * Classe respons�vel por criar figuras que se assemelham a tri�ngulos utilizando asteriscos (*)
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class Triangulo { //Quest�o 1

	/**
	 * Cria uma figura utilizando asteriscos (*) com a quantidade de n�veis (altura) utilizando o atributo altura
	 * @param h altura do tri�ngulo
	 * @return figura formada (String)
	 * @author Danilo
	 */
	public String criarTriangulo(int h) {
		String concat = "";
			
		if(h == 1) {
			concat = "*";
			return concat;
		}
		
		if(h < 1) {
			concat = "N�o � poss�vel criar a ilustra��o com o 'n' informado";
			return concat;
		}
		
		for(int i = 1; i < h; i++) {
			String asteriscos = "";
			
			for(int e = i; e < h; e++) {
				asteriscos += " ";
			}
			
			for(int a = i; a > 0; a--) {
				asteriscos += "*";
			}
			
			concat += asteriscos;
			concat += "\n";
		}
		
		String ultimoNivel = "";
		for(int i = h; i > 0; i--) {
			ultimoNivel += "*";
		}
		
		concat += ultimoNivel;

		return concat;
	}

}
