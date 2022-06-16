package sezar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class sezar extends JFrame {

	private JPanel contentPane;
	private JTextField txtsifrelenecekMetin;
	private JTextField txtKs;
	private JTextField txtSifrelenmisMetin;
	
	int ks=0;
	int ks2=0;
	String alfabe="abcçdefgðhiýjklmnoöprsþtuüvyz";
	private JTextField txtDesifre;
	private JTextField txtKs2;
	private JTextField txtSifre;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sezar frame = new sezar();
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
	public sezar() {
		setTitle("Sezar \u015Eifreleme");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtsifrelenecekMetin = new JTextField();
	
		txtsifrelenecekMetin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtsifrelenecekMetin.setText("\u015Eifrelenecek Metin");
		txtsifrelenecekMetin.setBounds(10, 56, 436, 30);
		contentPane.add(txtsifrelenecekMetin);
		txtsifrelenecekMetin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kayd\u0131rma Say\u0131s\u0131: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(20, 96, 89, 24);
		contentPane.add(lblNewLabel);
		
		txtKs = new JTextField();
		txtKs.setText("0");
		txtKs.setBounds(107, 100, 96, 19);
		contentPane.add(txtKs);
		txtKs.setColumns(10);
		
		JButton btnNewButton = new JButton("\u015Eifrele");
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(265, 99, 85, 21);
		contentPane.add(btnNewButton);
		
		txtSifrelenmisMetin = new JTextField();
		txtSifrelenmisMetin.setText("\u015Eifrelenmi\u015F Metin");
		txtSifrelenmisMetin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSifrelenmisMetin.setBounds(10, 130, 426, 30);
		contentPane.add(txtSifrelenmisMetin);
		txtSifrelenmisMetin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("abc\u00E7defg\u011Fhi\u0131jklmno\u00F6prs\u015Ftu\u00FCvyz");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(107, 353, 276, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("abc\u00E7defg\u011Fhi\u0131jklmno\u00F6prs\u015Ftu\u00FCvyz");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(107, 376, 225, 13);
		contentPane.add(lblNewLabel_2);
		
		txtDesifre = new JTextField();
		txtDesifre.setText("\u015Eifrelenmemi\u015F Metin\r\n");
		txtDesifre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDesifre.setColumns(10);
		txtDesifre.setBounds(10, 278, 426, 30);
		contentPane.add(txtDesifre);
		
		txtKs2 = new JTextField();
		txtKs2.setText("0");
		txtKs2.setColumns(10);
		txtKs2.setBounds(107, 248, 96, 19);
		contentPane.add(txtKs2);
		
		JLabel lblNewLabel_3 = new JLabel("Kayd\u0131rma Say\u0131s\u0131: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(20, 244, 89, 24);
		contentPane.add(lblNewLabel_3);
		
		txtSifre = new JTextField();
		txtSifre.setText("\u015Eifrelenmi\u015F Metin");
		txtSifre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSifre.setColumns(10);
		txtSifre.setBounds(10, 204, 436, 30);
		contentPane.add(txtSifre);
		
		JButton btnNewButton_1 = new JButton("\u015Eifre \u00C7\u00F6z");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(265, 247, 85, 21);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_4 = new JLabel("\u015Eifrele");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(188, 20, 115, 13);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\u015Eifre \u00C7\u00F6z");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(171, 181, 115, 13);
		contentPane.add(lblNewLabel_5);
		
		txtsifrelenecekMetin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			txtsifrelenecekMetin.setText("");
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i,j,uzunluk;
				String cipher = "";
				String metin ="";
				String sifreli ="";
				String deSifre="";
				// Birinci kaydýrma sayýsýný aldýðýmýz yer
				ks=Integer.parseInt(txtKs.getText());
				// alfabedeki kaydýrma iþlemini yapan for alaný
				for(i=ks;i<29+ks;i++) {
					cipher += alfabe.charAt(i%29);
				}
				lblNewLabel_2.setText(cipher);
				
				metin =txtsifrelenecekMetin.getText();
				
				uzunluk=metin.length();
				// þifreleme alaný
				for ( i = 0; i <uzunluk; i++) {
					for ( j = 0; j < 29; j++) {
						if(metin.charAt(i)==alfabe.charAt(j)) {
							sifreli += alfabe.charAt((j+ks)%29);
						}
					}
					
				}
				txtSifrelenmisMetin.setText(sifreli);
			}
			
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i,j,uzunluk;
				String metin ="";
				String sifreli ="";
				ks2=Integer.parseInt(txtKs2.getText());
				metin =txtSifre.getText();
				uzunluk=metin.length();
				// ÞÝfre çözmek için oluþturuldugumuz for döngüsü
				for ( i = 0; i <uzunluk; i++) {
					for ( j = 0; j < 29; j++) {
						if(metin.charAt(i)==alfabe.charAt(j)) {
							// Çözülmüþ mesajý birleþtirme
							sifreli += alfabe.charAt((j-ks2)%29);
						}
					}
					
				}
				txtDesifre.setText(sifreli);
			}
		});
	}
}
