package com.paradigmas.lab.calculaimc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfaceUsuario extends JFrame{
	private JLabel lblPeso = new JLabel("Peso: ");
	private JTextField txtPeso = new JTextField();
	private JLabel lblAltura = new JLabel("Altura: ");
	private JTextField txtAltura = new JTextField();
	private JLabel lblResultado = new JLabel("Resultado: ");
	private JButton btnCalcula = new JButton("Calcular");
	
	public InterfaceUsuario() {
		setConfig();	// Cada vez que chamar o construtor ja será feita a configuração
	}

	private void setConfig() {
		// Configurando o Jframe
		this.setTitle("Calculador de IMC"); // Titulo
		this.setSize(600, 100); //Tamanho
		this.setLayout(new GridLayout(0,2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a aplicacao
		this.setLocationRelativeTo(null); // Centraliza o Jframe
		
		// Evento para calcular o IMC
		btnCalcula.addActionListener(new CalculoIMC());
		
		// Adicionando componentes ao JFrame
		this.add(lblPeso);
		this.add(txtPeso);
		this.add(lblAltura);
		this.add(txtAltura);
		this.add(lblResultado);
		this.add(btnCalcula);
		
	}

}










