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
	 * Neste método, faltam quase todos os requisitos para uma senha forte (com exceção de conter número).
	 * Número = sim (não adicionar nada);
	 * Qtd de caracteres = 5 (min 6) (adicionar 1);
	 * char esp = não (adicionar 1);
	 * let Min = não (adicionar 1);
	 * let Mai = não (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd é atingida, a quantidade de caracteres que temos que adicionar é a junção
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
	 * Neste método, faltam ainda três requisitos para a senha.
	 * Número = sim (não adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (não adicionar nada);
	 * char esp = não (adicionar 1);
	 * let Min = não (adicionar 1);
	 * let Mai = não (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd é atingida, a quantidade de caracteres que temos que adicionar é a junção
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
	 * Neste método, faltam dois requisitos para a senha.
	 * Número = sim (não adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (não adicionar nada);
	 * char esp = sim (não adicionar nada);
	 * let Min = não (adicionar 1);
	 * let Mai = não (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd é atingida, a quantidade de caracteres que temos que adicionar é a junção
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
	 * Neste método, falta apenas a letra maiúscula como requisito
	 * Número = sim (não adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (não adicionar nada);
	 * char esp = sim (não adicionar nada);
	 * let Min = sim (não adicionar nada);
	 * let Mai = não (adicionar 1); 
	 * Como ao adicionar qualquer caracter a Qtd é atingida, a quantidade de caracteres que temos que adicionar é a junção
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
	 * Neste método, todos os requisitos foram cumpridos devidamente.
	 * Número = sim (não adicionar nada);
	 * Qtd de caracteres = 6 (min 6) (não adicionar nada);
	 * char esp = sim (não adicionar nada);
	 * let Min = sim (não adicionar nada);
	 * let Mai = sim (não adicionar nada); 
	 * Como os requisitos foram cumpridos, não há necessidade de adicionar mais caracteres à senha.
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
