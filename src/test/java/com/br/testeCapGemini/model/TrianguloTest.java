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
class TrianguloTest {

	/**
	 * Este método deve construir uma figura com a utilização de "*" (asteriscos), de modo que o número "n" informado
	 * seja o que define quantos níveis (alutra) a figura triangular terá.
	 * Há exemplo: n=3, teremos algo como:
	 * 
	 * "  *"
	 * " **"
	 * "***"
	 * 
	 * onde os espaços em branco tal como estão também fazem parte da requisição de saída.
	 */
	@Test
	public void criaFiguraComNNiveis() {
		Triangulo tri = new Triangulo();
		
		String result = tri.criarTriangulo(4);
		
		String manual = "   *\n  **\n ***\n****";
				
		Assertions.assertEquals(manual, result);
	}

}
