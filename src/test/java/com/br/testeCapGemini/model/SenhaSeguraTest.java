package com.br.testeCapGemini.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Teste da funcionalidade da Classe {@link SenhaSegura}
 * @since fev 2022
 * @author Danilo
 * @version 1.0
 *
 */
public class SenhaSeguraTest {
	
	/**
	 * Neste m�todo, faltam quase todos os requisitos para uma senha forte (com exce��o de conter n�mero).
	 * N�mero = sim (n�o adicionar nada);
	 * Qtd de caracteres = 5 (min 6) (adicionar 1);
	 * char esp = n�o (adicionar 1);
	 * let Min = n�o (adicionar 1);
	 * let Mai = n�o (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd � atingida, a quantidade de caracteres que temos que adicionar � a jun��o
	 * de todos estes menos a Qtd, ou seja 4 - 1 = 3
	 * @author Danilo
	 * @since fev 2022
	 */
	@Test
	public void ausenciaDe_CaracterEspecial_LetMin_LetMai_QtdSeis() {
		SenhaSegura ss = new SenhaSegura();
		String senha = "12345";
		
		int resultado = ss.verificarSenha(senha);
		
		Assertions.assertEquals(3, resultado);
	}
	
	/**
	 * Neste m�todo, faltam ainda tr�s requisitos para a senha.
	 * N�mero = sim (n�o adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (n�o adicionar nada);
	 * char esp = n�o (adicionar 1);
	 * let Min = n�o (adicionar 1);
	 * let Mai = n�o (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd � atingida, a quantidade de caracteres que temos que adicionar � a jun��o
	 * de todos estes menos a Qtd, ou seja 3 - 0 = 3
	 * @author Danilo
	 * @since fev 2022
	 */
	@Test
	public void ausenciaDe_CaracterEspecial_LetMin_LetMai() {
		SenhaSegura ss = new SenhaSegura();
		String senha = "123456";
		
		int resultado = ss.verificarSenha(senha);
		
		Assertions.assertEquals(3, resultado);
	}
	
	/**
	 * Neste m�todo, faltam dois requisitos para a senha.
	 * N�mero = sim (n�o adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (n�o adicionar nada);
	 * char esp = sim (n�o adicionar nada);
	 * let Min = n�o (adicionar 1);
	 * let Mai = n�o (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd � atingida, a quantidade de caracteres que temos que adicionar � a jun��o
	 * de todos estes menos a Qtd, ou seja 2 - 0 = 2
	 * @author Danilo
	 * @since fev 2022
	 */
	
	@Test
	public void ausenciaDe_LetMin_LetMai() {
		SenhaSegura ss = new SenhaSegura();
		String senha = "1@3456";
		
		int resultado = ss.verificarSenha(senha);
		
		Assertions.assertEquals(2, resultado);
	}
	
	/**
	 * Neste m�todo, falta apenas a letra mai�scula como requisito
	 * N�mero = sim (n�o adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (n�o adicionar nada);
	 * char esp = sim (n�o adicionar nada);
	 * let Min = sim (n�o adicionar nada);
	 * let Mai = n�o (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd � atingida, a quantidade de caracteres que temos que adicionar � a jun��o
	 * de todos estes menos a Qtd, ou seja 1 - 0 = 1
	 * @author Danilo
	 * @since fev 2022
	 */
	
	@Test
	public void ausenciaDe_LetMai() {
		SenhaSegura ss = new SenhaSegura();
		String senha = "1@3a56";
		
		int resultado = ss.verificarSenha(senha);
		
		Assertions.assertEquals(1, resultado);
	}
	
	/**
	 * Neste m�todo, todos os requisitos foram cumpridos devidamente.
	 * N�mero = sim (n�o adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (n�o adicionar nada);
	 * char esp = sim (n�o adicionar nada);
	 * let Min = sim (n�o adicionar nada);
	 * let Mai = sim (n�o adicionar nada); 
	 * Como os requisitos foram cumpridos, n�o h� necessidade de adicionar mais caracteres � senha.
	 * @author Danilo
	 * @since fev 2022
	 */
	
	@Test
	public void todosOsCamposOK() {
		SenhaSegura ss = new SenhaSegura();
		String senha = "1@3a5A";
		
		int resultado = ss.verificarSenha(senha);
		
		Assertions.assertEquals(0, resultado);
	}
}
