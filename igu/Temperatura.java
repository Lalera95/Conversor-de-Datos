package mx.com.alura.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.com.alura.logica.LogicaTemperaturas;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Temperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textoCantidad;
	private JTextField textoResultado;

	public Temperatura() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Temperatura.class.getResource("/mx/com/alura/imagenes/Logos.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(144, 0, 64, 82);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("Conversor de Temperatura");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 40));
		lblNewLabel_1.setBounds(0, 72, 366, 46);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_2 = new JButton("Menu");
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Temperatura.class.getResource("/mx/com/alura/imagenes/IconoAtras.png")));
		btnNewButton_2.setBounds(6, 6, 69, 29);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);

		JLabel lblNewLabel_2 = new JLabel("Ingrese el valor y unidad a convertir");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 130, 366, 28);
		contentPane.add(lblNewLabel_2);

		JComboBox temp1 = new JComboBox();
		temp1.setModel(new DefaultComboBoxModel(new String[] { "Celsius  (°C)", "Fahrenheit (°F)", "Kelvin (K)", "Rankine (°Ra)" }));
		temp1.setBounds(78, 170, 210, 36);
		contentPane.add(temp1);

		textoCantidad = new JTextField();
		textoCantidad.addKeyListener(new KeyAdapter() {

			// Metodo para solo aceptar letras.
			@Override
			public void keyTyped(KeyEvent e) {

				char[] p = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '.' };
				int b = 0;
				for (int i = 0; i <= 10; i++) {
					if (p[i] == e.getKeyChar()) {
						b = 1;
					}
				}
				if (b == 0) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		textoCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textoCantidad.setColumns(10);
		textoCantidad.setBounds(78, 218, 210, 36);
		contentPane.add(textoCantidad);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Temperatura.class.getResource("/mx/com/alura/imagenes/Icono Flecha.png")));
		lblNewLabel_4.setBounds(158, 250, 50, 99);
		contentPane.add(lblNewLabel_4);

		JComboBox temp2 = new JComboBox();
		temp2.setModel(new DefaultComboBoxModel(new String[] { "Celsius  (°C)", "Fahrenheit (°F)", "Kelvin (K)", "Rankine (°Ra)" }));
		temp2.setBounds(78, 340, 210, 36);
		contentPane.add(temp2);

		textoResultado = new JTextField();
		textoResultado.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		textoResultado.setEditable(false);
		textoResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoResultado.setColumns(10);
		textoResultado.setBounds(78, 388, 210, 36);
		contentPane.add(textoResultado);

		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String texto = textoCantidad.getText();
				texto = texto.replaceAll(" ", "");
				if (texto.length() == 0) {
					textoCantidad.setText("0.00");
				}

				double cantidad = Double.parseDouble(textoCantidad.getText());
				int unidadPrincipal = temp1.getSelectedIndex();
				int unidadSecundaria = temp2.getSelectedIndex();

				LogicaTemperaturas logica = new LogicaTemperaturas();
				logica.setCantidad(cantidad);
				logica.setTemperatura1(unidadPrincipal);
				logica.setTemperatura2(unidadSecundaria);

				DecimalFormat df = new DecimalFormat("#0.0000");
				String formato = df.format(logica.convertir());
				textoResultado.setText("" + formato);

			}
		});
		botonAceptar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		botonAceptar.setBounds(78, 447, 117, 29);
		contentPane.add(botonAceptar);

		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				temp1.setSelectedIndex(0);
				temp2.setSelectedIndex(0);
				textoCantidad.setText("");
				textoResultado.setText("");
			}
		});
		botonLimpiar.setForeground(Color.WHITE);
		botonLimpiar.setBounds(192, 449, 96, 29);
		contentPane.add(botonLimpiar);
		botonLimpiar.setOpaque(false);
		botonLimpiar.setContentAreaFilled(false);
		botonLimpiar.setBorderPainted(false);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Temperatura.class.getResource("/mx/com/alura/imagenes/fondoAzulRojo.jpeg")));
		lblNewLabel.setBounds(0, 0, 366, 507);
		contentPane.add(lblNewLabel);
	}
}
