package com.br.testeCapGemini.service;

/**
 * Interface responsável por requisitar a entrada de dados de processamento e de retorno a serem utilizadas por tipos
 * específicos de verificações
 * @since fev 2022
 * @version 1.0
 * @author Danilo
 *
 */
public interface Verificacao {
	
	/**
	 * @author Danilo
	 * @param senha pretendida a ser utilizada
	 * @return <b>int</b> 0 (zero) ou 1 (um), dependendo da condição atingida ou não do método implementado pela classe concreta
	 */
	int verificar(String senha);
	
}
