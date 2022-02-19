package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.Triangulo;

/**
 * Classe que implementa a lógica requisita pelo problema da representação de triângulos demiante a determinação de uma
 * altura n
 * @author Danilo
 *
 */
public class TrianguloInterface { // Questão 1

	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do triângulo: "));
		
		String figura = tri.criarTriangulo(altura);
		
		System.out.println(figura);
		
		JOptionPane.showMessageDialog(null, figura + "\n\nVerifique a saída no console!","Repesentação:"
				,JOptionPane.WARNING_MESSAGE);
		
	}
}
