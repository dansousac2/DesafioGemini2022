package com.br.testeCapGemini.model;

import java.util.ArrayList;
import java.util.List;

import com.br.testeCapGemini.service.Verificacao;
import com.br.testeCapGemini.service.verificacoes.CaracterEspecial;
import com.br.testeCapGemini.service.verificacoes.LetraMaiuscula;
import com.br.testeCapGemini.service.verificacoes.LetraMinuscula;
import com.br.testeCapGemini.service.verificacoes.QtdCaracter;
import com.br.testeCapGemini.service.verificacoes.UmNumero;

public class SenhaSegura { // Questão 2

	private List<Verificacao> verificacoes = new ArrayList<>();
	private int qtdDigitosMinima;
	private int adicionar = 0;
	
	public SenhaSegura() {
		verificacoes.add(new UmNumero());
		verificacoes.add(new LetraMinuscula());
		verificacoes.add(new LetraMaiuscula());
		verificacoes.add(new CaracterEspecial());
	}

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
