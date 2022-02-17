package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

/**
 * Classe que agrupa a l�gica de verifica��o num�rica
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class UmNumero implements Verificacao {

	/**
	 * Verifica se h� ao menos 1 (um) n�mero na senha pretendida
	 * @author Danilo
	 */
	public int verificar(String senha) {
		char[] caracteres = senha.toCharArray();
		
		for (int i = 0; i < senha.length(); i++) {
			String s = String.valueOf(caracteres[i]);
			
			if(s.matches("[0-9]")) {
				return 0;
			}
		}
		
		return 1;
	}
	
}
