package com.br.testeCapGemini.service;

/**
 * Interface respons�vel por requisitar a entrada de dados de processamento e de retorno a serem utilizadas por tipos
 * espec�ficos de verifica��es
 * @since fev 2022
 * @version 1.0
 * @author Danilo
 *
 */
public interface Verificacao {
	
	/**
	 * @author Danilo
	 * @param senha pretendida a ser utilizada
	 * @return <b>int</b> 0 (zero) ou 1 (um), dependendo da condi��o atingida ou n�o do m�todo implementado pela classe concreta
	 */
	int verificar(String senha);
	
}
