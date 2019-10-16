package com.paradigmas.lab.calculaimc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JButton btnCalcula;
	
	public Interface(){
		// Configurando o Jframe
		this.setTitle("Calculador de IMC"); // Titulo
		this.setSize(400, 100); //Tamanho
		this.setLayout(new GridLayout(0,2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a aplicacao
		this.setLocationRelativeTo(null); // Centraliza o Jframe
		
		// Instanciando
		lblPeso = new JLabel("Peso: ");
		txtPeso = new JTextField();
		lblAltura = new JLabel("Altura: ");
		txtAltura = new JTextField();
		lblResultado = new JLabel("Resultado: ");
		btnCalcula = new JButton("Calcular");
		
		// Adicionando componentes ao JFrame
		this.add(lblPeso);
		this.add(txtPeso);
		this.add(lblAltura);
		this.add(txtAltura);
		this.add(lblResultado);
		this.add(btnCalcula);
		
		
		
	}

}
