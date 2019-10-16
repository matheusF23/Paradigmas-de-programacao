package com.paradigmas.lab.calculaimc;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Interface extends JFrame{
	
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JButton btnCalcula;
	
	public Interface(){
		// Configurando o Jframe
		this.setTitle("Calculador de IMC"); // Titulo
		this.setSize(500, 100); //Tamanho
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
		
		// Evento para calcular o IMC
		btnCalcula.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				double imc = peso / Math.pow(altura, 2);
				
				DecimalFormat df = new DecimalFormat("#0.0");
				String resultado = "IMC: " + df.format(imc);
				
				if(imc < 18.5){resultado+=". Abaixo do peso";}
                else if(imc < 24.9){resultado+=". Peso ideal";}
                else if(imc < 29.9){resultado+=". Levemente acima do peso";}
                else if(imc < 34.9){resultado+=". Primeiro grau de obesidade";}
                else if(imc < 39.9){resultado+=". Segundo grau de obesidade";}
                else resultado+=" Obesidade m�rbida";
				
				lblResultado.setText(resultado);
			}
			
		});
		
		// Adicionando componentes ao JFrame
		this.add(lblPeso);
		this.add(txtPeso);
		this.add(lblAltura);
		this.add(txtAltura);
		this.add(lblResultado);
		this.add(btnCalcula);	
	}
}


public class CalculadoraIMC {
	public static void main(String[] args) {
		Interface frame = new Interface();
		frame.setVisible(true);
	}
}
