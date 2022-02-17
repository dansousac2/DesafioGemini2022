package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.AnagramaPar;

/**
 * Executa a lógica requisita pelo problema do anagrama
 * @author Danilo
 *
 */
public class AnagramaInterface {

	public static void main(String[] args) {
		
		AnagramaPar anagPar = new AnagramaPar();
		
		String palavra = JOptionPane.showInputDialog("Informe a palavra a ser analisada: ");
		JOptionPane.showMessageDialog(null, anagPar.calcularQtd(palavra),"Anagramas Pares"
				,JOptionPane.INFORMATION_MESSAGE);
	}

}
