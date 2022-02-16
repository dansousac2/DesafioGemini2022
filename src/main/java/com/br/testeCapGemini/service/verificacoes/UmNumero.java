package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

public class UmNumero implements Verificacao {

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
