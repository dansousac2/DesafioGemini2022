package com.br.testeCapGemini.model;

/**
 * Classe responsável por criar figuras que se assemelham a triângulos utilizando asteriscos (*)
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class Triangulo { //Questão 1

	private int altura;

	/**
	 * Construtor default que recebe a quantidade de níveis que a figura irá ter
	 * @param altura informada (int)
	 * @author Danilo
	 */
	public Triangulo(int altura) {
		this.altura = altura;
	}

	/**
	 * Cria uma figura utilizando asteriscos (*) com a quantidade de níveis (altura) utilizando o atributo altura
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
			concat = "Não é possível criar a ilustração com o 'n' informado";
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
