package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.SenhaSegura;

/**
 * Interface que realiaz a l?gica requisita pelo problema de seguran?a de senha
 * @author Danilo
 *
 */
public class SenhaSeguraInterface { // Quest?o 2

	public static void main(String[] args) {
		
		SenhaSegura ss = new SenhaSegura();
		
		String palavra = JOptionPane.showInputDialog("Informe a senha a ser analisada: ");
		JOptionPane.showMessageDialog(null, ss.verificarSenha(palavra),"Necessidade de caracteres adicionais:"
				,JOptionPane.INFORMATION_MESSAGE);
		
	}
}
