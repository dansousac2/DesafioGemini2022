package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;


/**
 * Classe que implementa a interface {@link Verificacao}, respons�vel porverificar a exist�ncia de caracter
 * <b>min�suclo</b> na senha pretendida
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class LetraMaiuscula implements Verificacao {

	/**
	 * Verifica a exist�ncia de ao menos 1 (um) caracter de letra mai�scula na senha pretendida
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
