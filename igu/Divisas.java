package mx.com.alura.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.com.alura.logica.LogicaDivisas;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Divisas extends JFrame {

	private JPanel contentPane;
	private JTextField textoDivisa;
	private JTextField textoResultado;

	public Divisas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Conversor de Divisas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 47));
		lblNewLabel_1.setBounds(0, 62, 366, 46);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Divisas.class.getResource("/mx/com/alura/imagenes/Logos.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(151, 0, 64, 82);
		contentPane.add(lblNewLabel_3);

		JComboBox divisaPrincipal = new JComboBox();
		divisaPrincipal.setModel(new DefaultComboBoxModel(new String[] { "Peso Mexicano (MXN)", "Dolar (USD)","Euro (EUR)", "Libra Esterlina (GBP)", "Yen Japones (JPY)", "Won Sul-Coreano (KRW)" }));
		divisaPrincipal.setBounds(78, 174, 210, 36);
		contentPane.add(divisaPrincipal);

		JLabel lblNewLabel_2 = new JLabel("Ingrese la cantidad y moneda a convertir");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 134, 366, 28);
		contentPane.add(lblNewLabel_2);

		textoDivisa = new JTextField();
		textoDivisa.addKeyListener(new KeyAdapter() {
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
		textoDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		textoDivisa.setBounds(78, 215, 210, 36);
		contentPane.add(textoDivisa);
		textoDivisa.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Divisas.class.getResource("/mx/com/alura/imagenes/Icono Flecha.png")));
		lblNewLabel_4.setBounds(158, 247, 50, 96);
		contentPane.add(lblNewLabel_4);

		textoResultado = new JTextField();
		textoResultado.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		textoResultado.setEditable(false);
		textoResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoResultado.setColumns(10);
		textoResultado.setBounds(78, 377, 210, 36);
		contentPane.add(textoResultado);

		JComboBox divisaSegunda = new JComboBox();
		divisaSegunda.setModel(new DefaultComboBoxModel(new String[] { "Peso Mexicano (MXN)", "Dolar (USD)","Euro (EUR)", "Libra Esterlina (GBP)", "Yen Japones (JPY)", "Won Sul-Coreano (KRW)" }));
		divisaSegunda.setBounds(78, 336, 210, 36);
		contentPane.add(divisaSegunda);

		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String texto = textoDivisa.getText();
				texto.replaceAll(" ", "");
				if (texto.length() == 0) {
					textoDivisa.setText("0.00");
				}

				double cantidad = Double.parseDouble(textoDivisa.getText());
				int divisa1 = divisaPrincipal.getSelectedIndex();
				int divisa2 = divisaSegunda.getSelectedIndex();

				// metodo
				LogicaDivisas logica = new LogicaDivisas();
				logica.setMoneda1(cantidad);
				logica.setDivisa1(divisa1);
				logica.setDivisa2(divisa2);

				// Mostrar Resultado
				DecimalFormat df = new DecimalFormat("#0.0000");
				String formato = df.format(logica.convertir());
				textoResultado.setText("$ " + formato);
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		btnNewButton.setBounds(58, 436, 117, 29);
		contentPane.add(btnNewButton);

		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textoDivisa.setText("");
				divisaPrincipal.setSelectedIndex(0);
				divisaSegunda.setSelectedIndex(0);
				textoResultado.setText("");

			}
		});
		botonLimpiar.setForeground(Color.GRAY);
		botonLimpiar.setBounds(187, 438, 117, 29);
		contentPane.add(botonLimpiar);

		JButton btnNewButton_2 = new JButton("Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menuprincipal = new MenuPrincipal();
				menuprincipal.setVisible(true);
				menuprincipal.setLocationRelativeTo(null);
				dispose();

			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Divisas.class.getResource("/mx/com/alura/imagenes/IconoAtras.png")));
		btnNewButton_2.setBounds(6, 6, 69, 29);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Divisas.class.getResource("/mx/com/alura/imagenes/fondo.jpeg")));
		lblNewLabel.setBounds(0, 0, 366, 507);
		contentPane.add(lblNewLabel);
	}
}
