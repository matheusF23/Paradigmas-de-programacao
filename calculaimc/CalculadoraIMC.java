package com.paradigmas.lab.calculaimc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class FrameCalculator extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JButton btnCalcula;
	private JButton btnLimpar;
	private JButton btnExit;
	
	private JPanel jpnAltura;
	private JPanel jpnPeso;
	private JPanel jpnButton;

	
	public FrameCalculator(){
		// Configurando o Jframe
		setTitle("Calculador de IMC"); // Titulo
		setSize(250, 200); //Tamanho
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a aplicacao
		setLocationRelativeTo(null); // Centraliza o Jframe
		
		
		// Instanciando
		lblPeso = new JLabel("Peso (kg): ");
		txtPeso = new JTextField(15);
		lblAltura = new JLabel("Altura (m): ");
		txtAltura = new JTextField(15);
		lblResultado = new JLabel("IMC: ");
		btnCalcula = new JButton("Calcular");
		btnLimpar = new JButton("Limpar");
		btnExit = new JButton("Sair");
		jpnAltura = new JPanel();
		jpnPeso = new JPanel();
		jpnButton = new JPanel();
		
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
                else resultado+=" Obesidade mórbida";
				
				lblResultado.setText(resultado);
			}
			
		});
		
		// Evento para limpar os campos
		btnLimpar.addActionListener((ev) -> {
				txtPeso.setText("");
				txtAltura.setText("");
				lblResultado.setText("IMC: ");
		});
		
		// Evento para fechar aplicacao
		btnExit.addActionListener((ev) -> System.exit(0));
		
		// Adicionando componentes ao JFrame
		
		jpnPeso.add(lblPeso);
		jpnPeso.add(txtPeso);
		
		jpnAltura.add(lblAltura);
		jpnAltura.add(txtAltura);
		
		jpnButton.add(btnCalcula);
		jpnButton.add(btnLimpar);
		jpnButton.add(btnExit);
		
		add(jpnPeso);
		add(jpnAltura);
		add(jpnButton);
		add(lblResultado);
	}
}


public class CalculadoraIMC {
	public static void main(String[] args) {
		FrameCalculator frame = new FrameCalculator();
		frame.setVisible(true);
	}
}
