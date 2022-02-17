package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.SenhaSegura;

public class SenhaSeguraInterface { // Questão 2

	public static void main(String[] args) {
		
		SenhaSegura ss = new SenhaSegura();
		
		String palavra = JOptionPane.showInputDialog("Informe a senha a ser analisada: ");
		JOptionPane.showMessageDialog(null, ss.verificarSenha(palavra),"Necessidade de caracteres adicionais:"
				,JOptionPane.INFORMATION_MESSAGE);
		
	}
}
