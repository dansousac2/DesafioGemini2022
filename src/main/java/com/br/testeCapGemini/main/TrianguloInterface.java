package com.br.testeCapGemini.main;

import javax.swing.JOptionPane;

import com.br.testeCapGemini.model.Triangulo;

public class TrianguloInterface { // Quest�o 1

	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do tri�ngulo: "));
		
		System.out.println(tri.criarTriangulo(altura));
		
		JOptionPane.showMessageDialog(null, "Verifique a sa�da no console!","Repesenta��o:"
				,JOptionPane.WARNING_MESSAGE);
		
	}
}
