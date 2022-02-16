package com.br.testeCapGemini.service.verificacoes;

public class QtdCaracter {
	
	public int verificar(String senha) {
		if(senha.length() >= 6) {
			return 0;
		}
		
		return 6 - senha.length();
	}

}
