package mx.com.alura.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mx.com.alura.logica.LogicaMasa;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Masa extends JFrame {

	private JPanel contentPane;
	private JTextField textoCantidad;
	private JTextField textoResultado;

	public Masa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menu = new MenuPrincipal();
				
				menu.setVisible(true);
				menu.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Masa.class.getResource("/mx/com/alura/imagenes/IconoAtras.png")));
		btnNewButton_2.setBounds(6, 6, 69, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Masa.class.getResource("/mx/com/alura/imagenes/Logos.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(151, 0, 64, 82);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor de Masas");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 47));
		lblNewLabel_1.setBounds(0, 67, 366, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese el valor y unidad a convertir");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 125, 366, 28);
		contentPane.add(lblNewLabel_2);
		
		JComboBox pesoPrincipal = new JComboBox();
		pesoPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Tonelada (t)", "Kilogramo (kg)", "Gramo (g)", "Miligramo (mg)", "Onza (oz)", "Libra (lb)"}));
		pesoPrincipal.setBounds(78, 165, 210, 36);
		contentPane.add(pesoPrincipal);
		
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
		textoCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		textoCantidad.setColumns(10);
		textoCantidad.setBounds(78, 202, 210, 36);
		contentPane.add(textoCantidad);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Masa.class.getResource("/mx/com/alura/imagenes/Icono Flecha.png")));
		lblNewLabel_4.setBounds(158, 239, 50, 96);
		contentPane.add(lblNewLabel_4);
		
		textoResultado = new JTextField();
		textoResultado.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		textoResultado.setEditable(false);
		textoResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoResultado.setColumns(10);
		textoResultado.setBounds(78, 367, 210, 36);
		contentPane.add(textoResultado);
		
		JComboBox pesoSecundario = new JComboBox();
		pesoSecundario.setModel(new DefaultComboBoxModel(new String[] {"Tonelada (t)", "Kilogramo (kg)", "Gramo (g)", "Miligramo (mg)", "Onza (oz)", "Libra (lb)"}));
		pesoSecundario.setBounds(78, 330, 210, 36);
		contentPane.add(pesoSecundario);
		
		JButton botonAceptar = new JButton("Aceptar");
		botonAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//No dejar en blanco y sin espacios
				String texto = textoCantidad.getText();
				texto = texto.replaceAll(" ", "");
				if(texto.length() == 0) {
					textoCantidad.setText("0.00");
				}
				
				LogicaMasa masa = new LogicaMasa();
				masa.setCantidad(Double.parseDouble(textoCantidad.getText()));
				masa.setMasa1(pesoPrincipal.getSelectedIndex());
				masa.setMasa2(pesoSecundario.getSelectedIndex());
				
				
				//Mostar
				DecimalFormat df = new DecimalFormat("#0.0000");
				String formato = df.format(masa.convertir());
				textoResultado.setText("" + formato);
				
			}
		});
		botonAceptar.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		botonAceptar.setBounds(78, 437, 117, 29);
		contentPane.add(botonAceptar);
		
		JButton botonLimpiar = new JButton("Limpiar");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			textoCantidad.setText("");
			textoResultado.setText("");
			pesoPrincipal.setSelectedIndex(1);
			pesoSecundario.setSelectedIndex(1);
			}
		});
		botonLimpiar.setOpaque(false);
		botonLimpiar.setForeground(Color.WHITE);
		botonLimpiar.setContentAreaFilled(false);
		botonLimpiar.setBorderPainted(false);
		botonLimpiar.setBounds(192, 437, 96, 29);
		contentPane.add(botonLimpiar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Masa.class.getResource("/mx/com/alura/imagenes/fondoVerdo.jpeg")));
		lblNewLabel.setBounds(0, 0, 366, 507);
		contentPane.add(lblNewLabel);
	}

}
