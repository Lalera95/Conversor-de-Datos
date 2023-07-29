package mx.com.alura.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.com.alura.logica.LogicaLongitud;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Longitud extends JFrame {

	private JPanel contentPane;
	private JTextField textoCantidad;
	private JTextField textoResultado;

	public Longitud() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton botonMenu = new JButton("Menu");
		botonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menu = new MenuPrincipal();
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				dispose();
			}
		});
		botonMenu.setIcon(new ImageIcon(Longitud.class.getResource("/mx/com/alura/imagenes/IconoAtras.png")));
		botonMenu.setOpaque(false);
		botonMenu.setForeground(Color.WHITE);
		botonMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		botonMenu.setContentAreaFilled(false);
		botonMenu.setBorderPainted(false);
		botonMenu.setBounds(6, 6, 69, 29);
		contentPane.add(botonMenu);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Longitud.class.getResource("/mx/com/alura/imagenes/Logos.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(151, 0, 64, 82);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor de Longitud");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 40));
		lblNewLabel_1.setBounds(6, 72, 366, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese el valor y unidad a convertir");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(6, 130, 366, 28);
		contentPane.add(lblNewLabel_2);
		
		JComboBox longPrincipal = new JComboBox();
		longPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Kilómetro (km)", "Hectómetro (hm)", "Decámetro (dam)", "Metro (m)", "Decímetro (dm)", "Centímetro (cm)", "Milímetro (mm)"}));
		longPrincipal.setBounds(78, 181, 210, 36);
		contentPane.add(longPrincipal);
		
		JComboBox longSecundaria = new JComboBox();
		longSecundaria.setModel(new DefaultComboBoxModel(new String[] {"Kilómetro (km)", "Hectómetro (hm)", "Decámetro (dam)", "Metro (m)", "Decímetro (dm)", "Centímetro (cm)", "Milímetro (mm)"}));
		longSecundaria.setBounds(78, 343, 210, 36);
		contentPane.add(longSecundaria);
		
		textoCantidad = new JTextField();
		textoCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char []p={'1','2','3','4','5','6','7','8','9','0','.'};
			    int b=0;
			    for(int i=0;i<=10;i++){
			    if (p[i]==e.getKeyChar()){b=1;}
			    }
			    if(b==0){
			    	e.consume();  getToolkit().beep();
			    	}
			}
		});
		textoCantidad.setToolTipText("00.0");
		textoCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textoCantidad.setColumns(10);
		textoCantidad.setBounds(78, 216, 210, 36);
		contentPane.add(textoCantidad);
		
		textoResultado = new JTextField();
		textoResultado.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		textoResultado.setToolTipText("00.0");
		textoResultado.setEditable(false);
		textoResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoResultado.setColumns(10);
		textoResultado.setBounds(78, 391, 210, 36);
		contentPane.add(textoResultado);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Longitud.class.getResource("/mx/com/alura/imagenes/Icono Flecha.png")));
		lblNewLabel_4.setBounds(151, 249, 50, 99);
		contentPane.add(lblNewLabel_4);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogicaLongitud logica = new LogicaLongitud();
				
				String texto = textoCantidad.getText();
				texto.replaceAll(" ", "");
				if(texto.length()== 0) {
					textoCantidad.setText("0.00");
				}
				
				
				logica.setCantidad(Double.parseDouble(textoCantidad.getText()));
				logica.setLongitudPrincipal(longPrincipal.getSelectedIndex());
				logica.setLongitudSecundaria(longSecundaria.getSelectedIndex());
				
				//Resultado
				DecimalFormat df = new DecimalFormat("#0.0000");
				String formato = df.format(logica.convertir());
				textoResultado.setText("" + formato);
			}
		});
		botonAceptar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		botonAceptar.setBounds(78, 441, 117, 29);
		contentPane.add(botonAceptar);
		
		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				longPrincipal.setSelectedIndex(0);
				longSecundaria.setSelectedIndex(0);
				textoCantidad.setText("");
				textoResultado.setText("");
			}
		});
		botonLimpiar.setOpaque(false);
		botonLimpiar.setForeground(Color.WHITE);
		botonLimpiar.setContentAreaFilled(false);
		botonLimpiar.setBorderPainted(false);
		botonLimpiar.setBounds(184, 441, 96, 29);
		contentPane.add(botonLimpiar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Longitud.class.getResource("/mx/com/alura/imagenes/fondoMorado.jpg")));
		lblNewLabel.setBounds(0, 0, 366, 507);
		contentPane.add(lblNewLabel);
	}
}
