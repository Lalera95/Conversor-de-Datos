package mx.com.alura.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {
	private JPanel contentPane;
	
	
	public MenuPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor de Datos");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 47));
		lblNewLabel_1.setBounds(0, 70, 366, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Seleccione el tipo de Conversion a realizar:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(0, 115, 366, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/Logos.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(151, 0, 64, 82);
		contentPane.add(lblNewLabel_3);
		
		JTextArea txtrCreadoPorLalo = new JTextArea();
		txtrCreadoPorLalo.setText("                              Creado por: Lalo Rosas");
		txtrCreadoPorLalo.setForeground(Color.WHITE);
		txtrCreadoPorLalo.setFont(new Font("SignPainter", Font.PLAIN, 16));
		txtrCreadoPorLalo.setBackground(new Color(51, 204, 255));
		txtrCreadoPorLalo.setBounds(0, 487, 366, 20);
		contentPane.add(txtrCreadoPorLalo);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura temperatura = new Temperatura();
				temperatura.setVisible(true);
				temperatura.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/IconoTemperatura.png")));
		btnNewButton_1.setBounds(210, 164, 96, 99);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masa masa = new Masa();
				masa.setVisible(true);
				masa.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/IconoPeso.png")));
		btnNewButton_1_2.setBounds(210, 309, 96, 99);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Longitud longitud = new Longitud();
				longitud.setVisible(true);
				longitud.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_1_1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/IconoLongitud.png")));
		btnNewButton_1_1_1.setBounds(54, 309, 96, 99);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Divisas divisas = new Divisas();
				divisas.setVisible(true);
				divisas.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/IconoDivisa.png")));
		btnNewButton_1_1.setBounds(56, 164, 96, 99);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		btnSalir.setBounds(118, 436, 130, 29);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Longitud");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setForeground(Color.WHITE);
		lblNewLabel_4_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1_2.setBounds(54, 402, 97, 22);
		contentPane.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Divisas");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(54, 259, 97, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Temperatura");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1_1.setBounds(209, 260, 97, 16);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Peso");
		lblNewLabel_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1_2_1.setBounds(209, 402, 97, 22);
		contentPane.add(lblNewLabel_4_1_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/mx/com/alura/imagenes/fondo.jpeg")));
		lblNewLabel.setBounds(0, 0, 366, 500);
		contentPane.add(lblNewLabel);
	}
}
