package mx.com.alura.igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla extends JFrame {

	private JPanel contentPane;

	
	public Pantalla() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPrincipal menuPrincipal = new MenuPrincipal();
				menuPrincipal.setVisible(true);
				menuPrincipal.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		btnNewButton.setBounds(110, 399, 130, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4_1 = new JLabel("cual podras convertir tipos de datos");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(0, 308, 366, 16);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("Bienvenido al Conversor de Datos, con el ");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 290, 366, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Pantalla.class.getResource("/mx/com/alura/imagenes/LogoL.png")));
		lblNewLabel_3.setBounds(0, 34, 366, 103);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Hoefler Text", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(1, 214, 366, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor de Datos");
		lblNewLabel_1.setFont(new Font("SignPainter", Font.BOLD, 47));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 143, 366, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4_2 = new JLabel(" como Divisas, Temperaturas,");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_2.setBounds(-6, 328, 366, 16);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Longitudes y Peso");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4_1_1.setBounds(-6, 346, 366, 19);
		contentPane.add(lblNewLabel_4_1_1);
		
		JTextArea txtrCreadoPorLalo = new JTextArea();
		txtrCreadoPorLalo.setFont(new Font("SignPainter", Font.PLAIN, 16));
		txtrCreadoPorLalo.setForeground(Color.WHITE);
		txtrCreadoPorLalo.setBackground(Color.GRAY);
		txtrCreadoPorLalo.setText("                              Creado por: Lalo Rosas");
		txtrCreadoPorLalo.setBounds(0, 491, 366, 19);
		contentPane.add(txtrCreadoPorLalo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Pantalla.class.getResource("/mx/com/alura/imagenes/fondoblanco.jpeg")));
		lblNewLabel_2.setBounds(0, 0, 366, 510);
		contentPane.add(lblNewLabel_2);
		
		
		
	}
}
