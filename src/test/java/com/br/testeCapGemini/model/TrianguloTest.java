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
	 * Este m�todo deve construir uma figura com a utiliza��o de "*" (asteriscos), de modo que o n�mero "n" informado
	 * seja o que define quantos n�veis (alutra) a figura triangular ter�.
	 * H� exemplo: n=3, teremos algo como:
	 * 
	 * "  *"
	 * " **"
	 * "***"
	 * 
	 * onde os espa�os em branco tal como est�o tamb�m fazem parte da requisi��o de sa�da.
	 */
	@Test
	public void criaFiguraComNNiveis() {
		Triangulo tri = new Triangulo();
		
		String result = tri.criarTriangulo(4);
		
		String manual = "   *\n  **\n ***\n****";
				
		Assertions.assertEquals(manual, result);
	}

}
