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
		 * 1� = o-o
		 * 2� = ov-vo
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(2, resultado);
	}

	@Test
	public void tresAnagramas() {
		AnagramaPar anag = new AnagramaPar();
		palavra = "ifailuhkqq";
		
		/*
		 * 1� = i-i
		 * 2� = q-q
		 * 3� = ifa-fai
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(3, resultado);
	}
	
	@Test
	public void quatroAnagramas() {
		AnagramaPar anag = new AnagramaPar();
		palavra = "araueira";
		
		/*
		 * 1� = a-a
		 * 2� = r-r
		 * 3� = araueir-raueira
		 * 4� = rauei-aueir
		 */
		
		int resultado = anag.calcularQtd(palavra);
		
		Assertions.assertEquals(4, resultado);
	}
}
