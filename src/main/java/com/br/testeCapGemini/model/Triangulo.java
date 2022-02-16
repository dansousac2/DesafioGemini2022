package com.br.testeCapGemini.model;

public class Triangulo { //Questão 1

	private int altura;

	public Triangulo(int altura) {
		this.altura = altura;
	}

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
