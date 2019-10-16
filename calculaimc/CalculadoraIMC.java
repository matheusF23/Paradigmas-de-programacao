package com.paradigmas.lab.calculaimc;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class InterfaceUsuario extends JFrame{
	private JLabel lblPeso;
	private JTextField txtPeso;
	private JLabel lblAltura;
	private JTextField txtAltura;
	private JLabel lblResultado;
	private JButton btnCalcula;
	
	public InterfaceUsuario() {
		setConfig(); // Cada vez que chamar o construtor ja será feita a configuração
	}

	private void setConfig() {
		// Configurando o Jframe
		this.setTitle("Calculador de IMC"); // Titulo
		this.setSize(600, 100); //Tamanho
		this.setLayout(new GridLayout(0,2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fecha a aplicacao
		this.setLocationRelativeTo(null); // Centraliza o Jframe
		
		
		lblPeso = new JLabel("Peso: ");
		txtPeso = new JTextField();
		lblAltura = new JLabel("Altura: ");
		txtAltura = new JTextField();
		lblResultado = new JLabel("Resultado: ");
		btnCalcula = new JButton("Calcular");
		
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
	
	// classe interna para o botao do calculo
	class CalculoIMC implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double peso = Double.parseDouble(txtPeso.getText());
				double altura = Double.parseDouble(txtAltura.getText());
				double imc = peso / Math.pow(altura, 2);
				
				 DecimalFormat df = new DecimalFormat("#0.0");
				
				String resultado = "IMC: " + df.format(imc);
				
				if(imc < 18.5){
                    resultado+=" Abaixo do peso";
                }
                else if(imc < 24.9){
                    resultado+=" Peso ideal";
                }
                else if(imc < 29.9){
                    resultado+=" Levemente acima do peso";
                }
                else if(imc < 34.9){
                    resultado+=" Primeiro grau de obesidade";
                }
                else if(imc < 39.9){
                    resultado+=" Segundo grau de obesidade";
                }
                else
                    resultado+=" Obesidade mórbida";
				
				lblResultado.setText(resultado);
			}catch (ArithmeticException ar) {
                JOptionPane.showMessageDialog(null, "Erro aritmético, causa: "+ar.getMessage());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro desconhecido, causa: "+ex.getMessage());
            }
		}

	}

}


public class CalculadoraIMC {
	public static void main(String[] args) {
		new InterfaceUsuario().setVisible(true);
	}
}
