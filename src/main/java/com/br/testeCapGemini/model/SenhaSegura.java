package com.br.testeCapGemini.model;

import java.util.ArrayList;
import java.util.List;

import com.br.testeCapGemini.service.Verificacao;
import com.br.testeCapGemini.service.verificacoes.CaracterEspecial;
import com.br.testeCapGemini.service.verificacoes.LetraMaiuscula;
import com.br.testeCapGemini.service.verificacoes.LetraMinuscula;
import com.br.testeCapGemini.service.verificacoes.QtdCaracter;
import com.br.testeCapGemini.service.verificacoes.UmNumero;

/**
 * <b>SenhaSegura</b> é uma classe que realiza a verificação de segurança de senha (String) baseada em lista de verificações instanciadas aqui.
 * @author Danilo
 * @since fev 2022
 * @version 1.0
 * @see com.br.testeCapGemini.service.verificacoes
 * @see Verificacao
 */

public class SenhaSegura { // Questão 2

	private List<Verificacao> verificacoes = new ArrayList<>();
	private int qtdDigitosMinima;
	private int adicionar = 0;
	
	/**
	 * Construtor defult que preenche a lista do tipo <b>Verificacao</b>
	 */
	public SenhaSegura() {
		verificacoes.add(new UmNumero());
		verificacoes.add(new LetraMinuscula());
		verificacoes.add(new LetraMaiuscula());
		verificacoes.add(new CaracterEspecial());
	}
	
	/**
	 * 
	 * @param String senha pretendida
	 * @return <b>int</b> quantidade de dígitos que faltam para que a senha seja considerada segura
	 */
	public int verificarSenha(String senha) {
		qtdDigitosMinima = new QtdCaracter().verificar(senha);
		
		verificacoes.forEach(v -> {
			adicionar += v.verificar(senha);
		});
		
		if(qtdDigitosMinima == 0 | qtdDigitosMinima < adicionar) {
			return adicionar;
		} else {			
			return qtdDigitosMinima;
		}
		
	}

	
	
}
