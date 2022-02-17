package com.br.testeCapGemini.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Teste da funcionalidade da Classe {@link Triangulo}
 * @since fev 2022
 * @author Danilo
 * @version 1.0
 *
 */
public class AnagramaParTest {

	private String palavra;
	
	@Test
	public void doisAnagramas() {
		AnagramaPar anag = new AnagramaPar();
		palavra = "ovo";
		
		/*
		 * 1º = o-o
		 * 2º = ov-vo
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(2, resultado);
	}

	@Test
	public void tresAnagramas() {
		AnagramaPar anag = new AnagramaPar();
		palavra = "ifailuhkqq";
		
		/*
		 * 1º = i-i
		 * 2º = q-q
		 * 3º = ifa-fai
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(3, resultado);
	}
	
	@Test
	public void quatroAnagramas() {
		AnagramaPar anag = new AnagramaPar();
		palavra = "araueira";
		
		/*
		 * 1º = a-a
		 * 2º = r-r
		 * 3º = araueir-raueira
		 * 4º = rauei-aueir
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(4, resultado);
	}
}
