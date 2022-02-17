package com.br.testeCapGemini.model;

import java.util.ArrayList;

/**
 * <b>AnagramaPar</b> é uma classe que permite encontrar "anagramas pares" em uma determinada palavra
 * @author Danilo
 * @since fev de 2022
 * @version 1.0
 */

public class AnagramaPar { // Questão 3

	ArrayList<String> anagramasEncontrados = new ArrayList<>();

	/**
	 * 
	 * @param palavra base para anagramas pares
	 * @return <b>int</b> quantidade de anagramas pares encontrados.
	 * @author Danilo
	 */
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
	/**
	 * Método privado para verificar existência de uma palavra no array de anagramas pares
	 * @param palavra a ser pesquisada
	 * @return verdadeiro ou falso, para se está no Array de anagramas encontrados
	 * @author Danilo
	 */
	private boolean isAnagramaNoArray(String s) {
		if (anagramasEncontrados.contains(s)) {
			return true;
		}
		return false;
	}

}
