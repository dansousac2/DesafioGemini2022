package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

/**
 * Classe que implementa a interface {@link Verificacao}, responsável por verificar a existência de caracteres
 * especiais (<b>!@#$%^&*()-+</b>)
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class CaracterEspecial implements Verificacao {
	
	/**
	 * Verifica a existência de ao menos 1 caracter especial
	 * @author Danilo
	 * 
	 */
	public int verificar(String senha) {
		char[] charPossivel = senha.toCharArray();
		
		for (int i = 0; i < senha.length(); i++) {
			String s = String.valueOf(charPossivel[i]);
			if(s.matches("[!@#$%^&*()-+]")) {
				return 0;
			}
		}
		
		return 1;
	}

}
