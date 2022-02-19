package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.Triangulo;

/**
 * Classe que implementa a l�gica requisita pelo problema da representa��o de tri�ngulos demiante a determina��o de uma
 * altura n
 * @author Danilo
 *
 */
public class TrianguloInterface { // Quest�o 1

	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do tri�ngulo: "));
		
		String figura = tri.criarTriangulo(altura);
		
		System.out.println(figura);
		
		JOptionPane.showMessageDialog(null, figura + "\n\nVerifique a sa�da no console!","Repesenta��o:"
				,JOptionPane.WARNING_MESSAGE);
		
	}
}
