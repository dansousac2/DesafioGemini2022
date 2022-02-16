package com.br.testeCapGemini.main;

import com.br.testeCapGemini.model.SenhaSegura;

public class TesteSenhaSegura { // Questão 2

	public static void main(String[] args) {
		
		String senha = "qB*2";
		
		SenhaSegura ss = new SenhaSegura();
		System.out.println(ss.verificarSenha(senha));
		
	}
}
