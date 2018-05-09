package InsertarDatosMySQL;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Component;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.Scrollbar;



public class PruebaGrafica extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4048992287789773298L;
	private JPanel contentPane;
	private JTextField txtLoginDeUsuario;
	private JTextField txtUsuario;
	private JButton btnEmpresa;
	private JButton btnUsuario;
	private JTextField txtContrasea;
	private JPanel LoginUsuario;
	private JPanel MenuPrincipal;
	private JTextField txtInserteAquEl;
	private JTextField txtInserteLaContrasea;
	private JTextField txtRegistro;
	private JButton btnRegistrarUsuario;
	private JPanel LoginEmpresa;
	private JButton btnRegistrarEmpresa;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton button_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtLoginDeEmpresa;
	private JTextArea textArea_1;
	private JButton btnVolver;
	private JButton btnVolver2;
	private JLabel label;
	private JLabel lblNewLabel;
	private JPanel RegistroEmpresa;
	private JButton btnRegistrarse;
	private JTextField txtRegistroDeEmpresa;
	private JTextArea textArea_2;
	private JButton btnVolver3;
	private JTextField txtNombre;
	private JTextField txtEscribeAquEl;
	private JTextField txtCif;
	private JTextField txtEscribeAquEl_1;
	private JTextField txtDireccinPostal;
	private JTextField txtEscribeAquLa;
	private JTextField txtTelfono;
	private JTextField txtEscribeAquEl_2;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaGrafica frame = new PruebaGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 444);
		contentPane = new JPanel();
		contentPane.setInheritsPopupMenu(true);
		contentPane.setIgnoreRepaint(true);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
						contentPane.setLayout(null);
							
							MenuPrincipal = new JPanel();
							MenuPrincipal.setBounds(0, 0, 607, 406);
							MenuPrincipal.setBackground(Color.WHITE);
							contentPane.add(MenuPrincipal);
							MenuPrincipal.setLayout(null);
							
							btnEmpresa = new JButton("New button");
							btnEmpresa.setBounds(34, 103, 280, 163);
							MenuPrincipal.add(btnEmpresa);
							btnEmpresa.setBorder(null);
							btnEmpresa.setIcon(new ImageIcon("G:\\DAW\\Programacion\\InsertarDatosMySQL\\Imagenes\\empresa.jpg"));
							
							btnUsuario = new JButton("New button");
							btnUsuario.setBounds(370, 99, 190, 170);
							MenuPrincipal.add(btnUsuario);
							btnUsuario.setBorder(null);
							btnUsuario.setIcon(new ImageIcon("G:\\DAW\\Programacion\\InsertarDatosMySQL\\Imagenes\\usuario.jpg"));
							
							JTextField txtInfojobs = new JTextField();
							txtInfojobs.setBounds(151, 11, 300, 82);
							MenuPrincipal.add(txtInfojobs);
							txtInfojobs.setBorder(null);
							txtInfojobs.setSelectedTextColor(Color.WHITE);
							txtInfojobs.setFont(new Font("Gabriola", Font.PLAIN, 48));
							txtInfojobs.setForeground(Color.CYAN);
							txtInfojobs.setDisabledTextColor(Color.WHITE);
							txtInfojobs.setCaretColor(Color.WHITE);
							txtInfojobs.setHorizontalAlignment(SwingConstants.CENTER);
							txtInfojobs.setToolTipText("");
							txtInfojobs.setText("MAGEI");
							txtInfojobs.setColumns(10);
							
							JTextField txteresUnaEmpresa = new JTextField();
							txteresUnaEmpresa.setBounds(10, 292, 587, 90);
							MenuPrincipal.add(txteresUnaEmpresa);
							txteresUnaEmpresa.setFont(new Font("Gabriola", Font.PLAIN, 44));
							txteresUnaEmpresa.setForeground(Color.CYAN);
							txteresUnaEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
							txteresUnaEmpresa.setBorder(null);
							txteresUnaEmpresa.setText("\u00BFERES UNA EMPRESA O UN USUARIO?");
							txteresUnaEmpresa.setColumns(10);
							
							LoginEmpresa = new JPanel();
							LoginEmpresa.setBounds(0, 0, 309, 406);
							LoginEmpresa.setLayout(null);
							LoginEmpresa.setForeground(Color.GRAY);
							LoginEmpresa.setFont(new Font("Open Sans", Font.PLAIN, 18));
							LoginEmpresa.setBorder(null);
							LoginEmpresa.setBackground(Color.CYAN);
							contentPane.add(LoginEmpresa);
							
							label = new JLabel("");
							label.setFocusCycleRoot(true);
							label.setIcon(new ImageIcon("G:\\DAW\\Programacion\\InsertarDatosMySQL\\Imagenes\\inicioempresa.jpg"));
							label.setHorizontalAlignment(SwingConstants.CENTER);
							label.setBounds(88, 47, 158, 120);
							LoginEmpresa.add(label);
							
							btnRegistrarEmpresa = new JButton("Pincha aqu\u00ED\r\n");
							btnRegistrarEmpresa.setForeground(new Color(255, 127, 80));
							btnRegistrarEmpresa.setFont(new Font("Gabriola", Font.BOLD, 18));
							btnRegistrarEmpresa.setFocusable(false);
							btnRegistrarEmpresa.setFocusTraversalKeysEnabled(false);
							btnRegistrarEmpresa.setFocusPainted(false);
							btnRegistrarEmpresa.setContentAreaFilled(false);
							btnRegistrarEmpresa.setBorder(null);
							btnRegistrarEmpresa.setBounds(174, 361, 89, 23);
							LoginEmpresa.add(btnRegistrarEmpresa);
							
							textField = new JTextField();
							textField.setText("No est\u00E1s registrado? ");
							textField.setForeground(new Color(255, 127, 80));
							textField.setFont(new Font("Gabriola", Font.PLAIN, 18));
							textField.setColumns(10);
							textField.setBorder(null);
							textField.setBounds(63, 350, 116, 45);
							LoginEmpresa.add(textField);
							
							textField_1 = new JTextField();
							textField_1.setText("Inserte la contrase\u00F1a...\r\n");
							textField_1.setForeground(Color.GRAY);
							textField_1.setColumns(10);
							textField_1.setBorder(null);
							textField_1.setBackground(Color.WHITE);
							textField_1.setBounds(96, 249, 167, 20);
							LoginEmpresa.add(textField_1);
							
							textField_2 = new JTextField();
							textField_2.setText("Inserte aqu\u00ED el usuario...\r\n");
							textField_2.setForeground(Color.GRAY);
							textField_2.setColumns(10);
							textField_2.setBorder(null);
							textField_2.setBackground(Color.WHITE);
							textField_2.setBounds(96, 200, 167, 20);
							LoginEmpresa.add(textField_2);
							
							button_1 = new JButton("INICIAR SESI\u00D3N");
							button_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
							button_1.setBackground(new Color(255, 127, 80));
							button_1.setBounds(96, 280, 145, 45);
							LoginEmpresa.add(button_1);
							
							textField_3 = new JTextField();
							textField_3.setText("Contrase\u00F1a:\r\n");
							textField_3.setSelectedTextColor(Color.MAGENTA);
							textField_3.setHorizontalAlignment(SwingConstants.CENTER);
							textField_3.setForeground(Color.MAGENTA);
							textField_3.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 13));
							textField_3.setColumns(10);
							textField_3.setBorder(null);
							textField_3.setBounds(88, 224, 91, 30);
							LoginEmpresa.add(textField_3);
							
							textField_4 = new JTextField();
							textField_4.setText("Usuario:\r\n");
							textField_4.setSelectedTextColor(Color.MAGENTA);
							textField_4.setHorizontalAlignment(SwingConstants.CENTER);
							textField_4.setForeground(Color.MAGENTA);
							textField_4.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 13));
							textField_4.setColumns(10);
							textField_4.setBorder(null);
							textField_4.setBounds(78, 175, 91, 30);
							LoginEmpresa.add(textField_4);
							
							txtLoginDeEmpresa = new JTextField();
							txtLoginDeEmpresa.setText("Login de empresa");
							txtLoginDeEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
							txtLoginDeEmpresa.setForeground(Color.GRAY);
							txtLoginDeEmpresa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
							txtLoginDeEmpresa.setDisabledTextColor(Color.CYAN);
							txtLoginDeEmpresa.setColumns(10);
							txtLoginDeEmpresa.setBorder(null);
							txtLoginDeEmpresa.setBackground(Color.CYAN);
							txtLoginDeEmpresa.setBounds(99, 0, 151, 36);
							LoginEmpresa.add(txtLoginDeEmpresa);
							
							textArea_1 = new JTextArea();
							textArea_1.setBounds(52, 135, 228, 260);
							LoginEmpresa.add(textArea_1);
							
							btnVolver2 = new JButton("/");
							btnVolver2.setBounds(0, 383, 23, 23);
							LoginEmpresa.add(btnVolver2);
							btnVolver2.setBorder(null);
							
								
								LoginUsuario = new JPanel();
								LoginUsuario.setBounds(0, 0, 309, 406);
								contentPane.add(LoginUsuario);
								LoginUsuario.setFont(new Font("Open Sans", Font.PLAIN, 18));
								LoginUsuario.setBorder(null);
								LoginUsuario.setBackground(Color.CYAN);
								LoginUsuario.setForeground(Color.GRAY);
								LoginUsuario.setLayout(null);
								
								lblNewLabel = new JLabel("");
								lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel.setBounds(89, 44, 158, 120);
								lblNewLabel.setIcon(new ImageIcon("G:\\DAW\\Programacion\\InsertarDatosMySQL\\Imagenes\\iniciousuario.jpg"));
								LoginUsuario.add(lblNewLabel);
								
								btnRegistrarUsuario = new JButton("Pincha aqu\u00ED\r\n");
								btnRegistrarUsuario.setForeground(new Color(255, 127, 80));
								btnRegistrarUsuario.setFont(new Font("Gabriola", Font.BOLD, 18));
								btnRegistrarUsuario.setContentAreaFilled(false);
								btnRegistrarUsuario.setFocusable(false);
								btnRegistrarUsuario.setFocusTraversalKeysEnabled(false);
								btnRegistrarUsuario.setFocusPainted(false);
								btnRegistrarUsuario.setBorder(null);
								btnRegistrarUsuario.setBounds(174, 361, 89, 23);
								LoginUsuario.add(btnRegistrarUsuario);
								
								txtRegistro = new JTextField();
								txtRegistro.setBorder(null);
								txtRegistro.setForeground(new Color(255, 127, 80));
								txtRegistro.setFont(new Font("Gabriola", Font.PLAIN, 18));
								txtRegistro.setText("No est\u00E1s registrado? ");
								txtRegistro.setBounds(63, 350, 116, 45);
								LoginUsuario.add(txtRegistro);
								txtRegistro.setColumns(10);
								
								txtInserteLaContrasea = new JTextField();
								txtInserteLaContrasea.setText("Inserte la contrase\u00F1a...\r\n");
								txtInserteLaContrasea.setForeground(Color.GRAY);
								txtInserteLaContrasea.setColumns(10);
								txtInserteLaContrasea.setBorder(null);
								txtInserteLaContrasea.setBackground(Color.WHITE);
								txtInserteLaContrasea.setBounds(96, 249, 167, 20);
								LoginUsuario.add(txtInserteLaContrasea);
								
								txtInserteAquEl = new JTextField();
								txtInserteAquEl.setBorder(null);
								txtInserteAquEl.setForeground(Color.GRAY);
								txtInserteAquEl.setBackground(Color.WHITE);
								txtInserteAquEl.setText("Inserte aqu\u00ED el usuario...\r\n");
								txtInserteAquEl.setBounds(96, 200, 167, 20);
								LoginUsuario.add(txtInserteAquEl);
								txtInserteAquEl.setColumns(10);
								
								JButton btnNewButton_1 = new JButton("INICIAR SESI\u00D3N");
								btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
								btnNewButton_1.setBounds(96, 280, 145, 45);
								btnNewButton_1.setBackground(new Color(255, 127, 80));
								LoginUsuario.add(btnNewButton_1);
								
								txtContrasea = new JTextField();
								txtContrasea.setBounds(88, 224, 91, 30);
								txtContrasea.setText("Contrase\u00F1a:\r\n");
								txtContrasea.setSelectedTextColor(Color.MAGENTA);
								txtContrasea.setHorizontalAlignment(SwingConstants.CENTER);
								txtContrasea.setForeground(Color.MAGENTA);
								txtContrasea.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 13));
								txtContrasea.setColumns(10);
								txtContrasea.setBorder(null);
								LoginUsuario.add(txtContrasea);
								
								txtUsuario = new JTextField();
								txtUsuario.setBounds(78, 175, 91, 30);
								txtUsuario.setFont(new Font("Source Sans Pro Semibold", Font.BOLD, 13));
								txtUsuario.setForeground(Color.MAGENTA);
								txtUsuario.setSelectedTextColor(Color.MAGENTA);
								txtUsuario.setBorder(null);
								txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
								txtUsuario.setText("Usuario:\r\n");
								LoginUsuario.add(txtUsuario);
								txtUsuario.setColumns(10);
								
								txtLoginDeUsuario = new JTextField();
								txtLoginDeUsuario.setBounds(99, 0, 151, 36);
								txtLoginDeUsuario.setForeground(Color.GRAY);
								txtLoginDeUsuario.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
								txtLoginDeUsuario.setBackground(Color.CYAN);
								txtLoginDeUsuario.setBorder(null);
								txtLoginDeUsuario.setDisabledTextColor(Color.CYAN);
								txtLoginDeUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
								txtLoginDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
								txtLoginDeUsuario.setText("Login de usuario");
								LoginUsuario.add(txtLoginDeUsuario);
								txtLoginDeUsuario.setColumns(10);
								
								JTextArea textArea = new JTextArea();
								textArea.setBounds(52, 135, 228, 260);
								LoginUsuario.add(textArea);
								
								btnVolver = new JButton("/");
								btnVolver.setBorder(null);
								btnVolver.setBounds(0, 383, 23, 23);
								LoginUsuario.add(btnVolver);
								
								RegistroEmpresa = new JPanel();
								RegistroEmpresa.setLayout(null);
								RegistroEmpresa.setForeground(Color.GRAY);
								RegistroEmpresa.setFont(new Font("Open Sans", Font.PLAIN, 18));
								RegistroEmpresa.setBorder(null);
								RegistroEmpresa.setBackground(new Color(128, 128, 128));
								RegistroEmpresa.setBounds(0, 0, 309, 406);
								contentPane.add(RegistroEmpresa);
								
								txtTelfono = new JTextField();
								txtTelfono.setForeground(new Color(0, 191, 255));
								txtTelfono.setText("Tel\u00E9fono:");
								txtTelfono.setFont(new Font("Gabriola", Font.PLAIN, 18));
								txtTelfono.setColumns(10);
								txtTelfono.setBorder(null);
								txtTelfono.setBounds(42, 247, 86, 20);
								RegistroEmpresa.add(txtTelfono);
								
								txtEscribeAquEl_2 = new JTextField();
								txtEscribeAquEl_2.setText("Escribe aqu\u00ED el tel\u00E9fono");
								txtEscribeAquEl_2.setColumns(10);
								txtEscribeAquEl_2.setBounds(42, 271, 192, 20);
								RegistroEmpresa.add(txtEscribeAquEl_2);
								
								txtDireccinPostal = new JTextField();
								txtDireccinPostal.setForeground(new Color(0, 191, 255));
								txtDireccinPostal.setText("Direcci\u00F3n postal:");
								txtDireccinPostal.setFont(new Font("Gabriola", Font.PLAIN, 18));
								txtDireccinPostal.setColumns(10);
								txtDireccinPostal.setBorder(null);
								txtDireccinPostal.setBounds(42, 185, 98, 20);
								RegistroEmpresa.add(txtDireccinPostal);
								
								txtEscribeAquLa = new JTextField();
								txtEscribeAquLa.setText("Escribe aqu\u00ED la direcci\u00F3n postal ");
								txtEscribeAquLa.setColumns(10);
								txtEscribeAquLa.setBounds(42, 209, 192, 20);
								RegistroEmpresa.add(txtEscribeAquLa);
								
								txtEscribeAquEl_1 = new JTextField();
								txtEscribeAquEl_1.setText("Escribe aqu\u00ED el CIF de la empresa");
								txtEscribeAquEl_1.setColumns(10);
								txtEscribeAquEl_1.setBounds(42, 154, 192, 20);
								RegistroEmpresa.add(txtEscribeAquEl_1);
								
								txtCif = new JTextField();
								txtCif.setForeground(new Color(0, 191, 255));
								txtCif.setText("CIF:");
								txtCif.setFont(new Font("Gabriola", Font.PLAIN, 18));
								txtCif.setColumns(10);
								txtCif.setBorder(null);
								txtCif.setBounds(42, 130, 86, 20);
								RegistroEmpresa.add(txtCif);
								
								txtEscribeAquEl = new JTextField();
								txtEscribeAquEl.setText("Escribe aqu\u00ED el nombre de la empresa");
								txtEscribeAquEl.setBounds(42, 99, 192, 20);
								RegistroEmpresa.add(txtEscribeAquEl);
								txtEscribeAquEl.setColumns(10);
								
								txtNombre = new JTextField();
								txtNombre.setForeground(new Color(0, 191, 255));
								txtNombre.setFont(new Font("Gabriola", Font.PLAIN, 18));
								txtNombre.setBorder(null);
								txtNombre.setText("Nombre:");
								txtNombre.setBounds(42, 75, 86, 20);
								RegistroEmpresa.add(txtNombre);
								txtNombre.setColumns(10);
								
								JScrollBar scrollBar = new JScrollBar();
								scrollBar.setBounds(244, 92, 17, 217);
								RegistroEmpresa.add(scrollBar);
								
								btnRegistrarse = new JButton("REGISTRARSE\r\n");
								btnRegistrarse.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
								btnRegistrarse.setBackground(new Color(0, 191, 255));
								btnRegistrarse.setBounds(77, 310, 145, 45);
								RegistroEmpresa.add(btnRegistrarse);
								
								txtRegistroDeEmpresa = new JTextField();
								txtRegistroDeEmpresa.setText("Registro de empresa");
								txtRegistroDeEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
								txtRegistroDeEmpresa.setForeground(new Color(0, 191, 255));
								txtRegistroDeEmpresa.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
								txtRegistroDeEmpresa.setDisabledTextColor(Color.CYAN);
								txtRegistroDeEmpresa.setColumns(10);
								txtRegistroDeEmpresa.setBorder(null);
								txtRegistroDeEmpresa.setBackground(Color.GRAY);
								txtRegistroDeEmpresa.setBounds(77, 11, 173, 39);
								RegistroEmpresa.add(txtRegistroDeEmpresa);
								
								textArea_2 = new JTextArea();
								textArea_2.setBounds(28, 58, 271, 317);
								RegistroEmpresa.add(textArea_2);
								
								btnVolver3 = new JButton("/");
								btnVolver3.setBorder(null);
								btnVolver3.setBounds(0, 383, 23, 23);
								RegistroEmpresa.add(btnVolver3);
								btnVolver3.addActionListener(this);
								
							
		
				
				
				//............BOTONES......................................................................................//
				
				btnUsuario.addActionListener(this);
				btnEmpresa.addActionListener(this);
				btnVolver.addActionListener(this);
				btnVolver2.addActionListener(this);
				btnRegistrarEmpresa.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent pulsar) {
		
		if (pulsar.getSource() == btnUsuario){
			LoginEmpresa.setVisible(false);
			LoginUsuario.setVisible(true);
			MenuPrincipal.setVisible(false);
		}
		if (pulsar.getSource() == btnEmpresa){
			LoginUsuario.setVisible(true);
			LoginEmpresa.setVisible(true);
			MenuPrincipal.setVisible(false);
		}
		if (pulsar.getSource() == btnVolver) {
			LoginUsuario.setVisible(false);
			LoginEmpresa.setVisible(false);
			MenuPrincipal.setVisible(true);
		}
		if (pulsar.getSource() == btnVolver2) {
			LoginUsuario.setVisible(false);
			LoginEmpresa.setVisible(false);
			MenuPrincipal.setVisible(true);
		}
		if (pulsar.getSource() == btnVolver3) {
			LoginUsuario.setVisible(false);
			LoginEmpresa.setVisible(false);
			MenuPrincipal.setVisible(true);
		}
		if (pulsar.getSource() == btnRegistrarEmpresa) {
			LoginUsuario.setVisible(false);
			LoginEmpresa.setVisible(false);
			MenuPrincipal.setVisible(false);
			RegistroEmpresa.setVisible(true);
		}
		
	}
}
