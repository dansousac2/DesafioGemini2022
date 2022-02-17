package com.br.testeCapGemini.model;

import java.util.ArrayList;

public class AnagramaPar { // Questão 3

	ArrayList<String> anagramasEncontrados = new ArrayList<>();

	public int calcularQtd(String palavra) {
		int anagramasPares = 0;

		char[] letrasDaPalavra = palavra.toCharArray();

		int index = 0;
		for (char c : letrasDaPalavra) {

			if (!(index < palavra.length() - 1)) {
				break;
			}
			
			String s = String.valueOf(c);
			String sub = palavra.substring(index + 1);

			String subPreparada = "[" + sub + "]"; // expressão regular formada (exreg)
			if (s.matches(subPreparada)) {

				if (!isAnagramaNoArray(s)) {
					anagramasPares++;
					anagramasEncontrados.add(s);

					int indexMatch = sub.indexOf(s);
					if (indexMatch > 0) {
						String novaSub = palavra.substring(index, indexMatch + 1);
						if (!isAnagramaNoArray(novaSub)) {
							anagramasPares++;
							anagramasEncontrados.add(novaSub);

							String parNovaSub = palavra.substring(index + 1, indexMatch + 2);
							anagramasEncontrados.add(parNovaSub);
						}
					}
				}
			}

			index++;

		}

		return anagramasPares;
	}

	private boolean isAnagramaNoArray(String s) {
		if (anagramasEncontrados.contains(s)) {
			return true;
		}
		return false;
	}

}
