package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

/**
 * Classe que agrupa a lógica de verificação numérica
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class UmNumero implements Verificacao {

	/**
	 * Verifica se há ao menos 1 (um) número na senha pretendida
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
