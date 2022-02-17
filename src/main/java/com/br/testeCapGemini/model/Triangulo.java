package com.br.testeCapGemini.model;

/**
 * Classe respons�vel por criar figuras que se assemelham a tri�ngulos utilizando asteriscos (*)
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class Triangulo { //Quest�o 1

	private int altura;

	/**
	 * Construtor default que recebe a quantidade de n�veis que a figura ir� ter
	 * @param altura informada (int)
	 * @author Danilo
	 */
	public Triangulo(int altura) {
		this.altura = altura;
	}

	/**
	 * Cria uma figura utilizando asteriscos (*) com a quantidade de n�veis (altura) utilizando o atributo altura
	 * @return figura formada (String)
	 * @author Danilo
	 */
	public String criarTriangulo() {
		String concat = "";
			
		if(altura == 1) {
			concat = "*";
			return concat;
		}
		
		if(altura < 1) {
			concat = "N�o � poss�vel criar a ilustra��o com o 'n' informado";
			return concat;
		}
		
		for(int i = 1; i < altura; i++) {
			String asteriscos = "";
			
			for(int e = i; e < altura; e++) {
				asteriscos += " ";
			}
			
			for(int a = i; a > 0; a--) {
				asteriscos += "*";
			}
			
			concat += asteriscos;
			concat += "\n";
		}
		
		String ultimoNivel = "";
		for(int i = altura; i > 0; i--) {
			ultimoNivel += "*";
		}
		
		concat += ultimoNivel;

		return concat;
	}

}
