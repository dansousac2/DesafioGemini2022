package com.br.testeCapGemini.service.verificacoes;

import com.br.testeCapGemini.service.Verificacao;

public class CaracterEspecial implements Verificacao {
	
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
