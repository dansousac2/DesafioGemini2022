package com.br.testeCapGemini.model;

import java.util.ArrayList;

public class AnagramaPar { // Questão 3

	public int calcularQtd(String palavra) {
		int anagramasPares = 0;

		char[] letrasDaPalavra = palavra.toCharArray();
		ArrayList<String> anagramasEncontrados = new ArrayList<>();

		for (char c : letrasDaPalavra) {
			String s = String.valueOf(c);
			int index = 0;

			while (index < palavra.length() - 1) {
				String sub = palavra.substring(index + 1);
				
				if (s.matches(sub)) {
					
					if (!anagramasEncontrados.contains(s)) {
						anagramasPares++;
						anagramasEncontrados.add(s);

						int indexMatch = 
					}
				}
				
				index++;
			}
		}

		return anagramasPares;
	}

}
