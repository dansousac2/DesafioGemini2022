package com.br.testeCapGemini.main;

import com.br.testeCapGemini.model.AnagramaPar;

public class TesteAnagrama {

	public static void main(String[] args) {
		
		String texto = "ifailuhkqq";
		
		AnagramaPar anagPar = new AnagramaPar();
		System.out.println(anagPar.calcularQtd(texto));
	}

}
