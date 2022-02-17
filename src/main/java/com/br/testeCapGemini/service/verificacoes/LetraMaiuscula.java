package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;


/**
 * Classe que implementa a interface {@link Verificacao}, responsável porverificar a existência de caracter
 * <b>minúsuclo</b> na senha pretendida
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class LetraMaiuscula implements Verificacao {

	/**
	 * Verifica a existência de ao menos 1 (um) caracter de letra maiúscula na senha pretendida
	 * @author Danilo
	 *  
	 */
	public int verificar(String senha) {
		char[] caracteres = senha.toCharArray();
		
		for (int i = 0; i < senha.length(); i++) {
			String s = String.valueOf(caracteres[i]);
			
			if(s.matches("[A-Z]")) {
				return 0;
			}
		}
		
		return 1;
	}

}
