package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

public class LetraMaiuscula implements Verificacao {

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
