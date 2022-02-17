package com.br.testeCapGemini.service.verificacoes;

/**
 * Classe que realiza a contagem de caracters da senha pretendida. Não implementa Verificacao pois seu retorno serve
 * de base para comparação com classes que implementam essa interface
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 */
public class QtdCaracter {
	
	/**
	 * Responsável por verificar a quantidade de caracters que <b>faltam</b> na senha pretendida
	 * @author Danilo
	 * @param senha pretendida
	 * @return <b>int</b> 0 (zero) ou n (quantidade variada), para quantidade de caracteres aceita ou não aceita respectivamente
	 */
	public int verificar(String senha) {
		if(senha.length() >= 6) {
			return 0;
		}
		
		return 6 - senha.length();
	}

}
