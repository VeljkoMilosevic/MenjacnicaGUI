package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private MenjacnicaGUI menjacnica;


/**
 * Create the frame.
 */
public ObrisiKursGUI(MenjacnicaGUI m) {
	setTitle("Obrisi kurs");
	setResizable(false);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 450, 333);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	menjacnica=m;
	
	JLabel lblSifra = new JLabel("Sifra");
	lblSifra.setBounds(55, 39, 46, 14);
	contentPane.add(lblSifra);
	
	JLabel lblNaziv = new JLabel("Naziv");
	lblNaziv.setBounds(264, 39, 46, 14);
	contentPane.add(lblNaziv);
	
	JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
	lblKupovniKurs.setBounds(264, 110, 80, 14);
	contentPane.add(lblKupovniKurs);
	
	JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
	lblProdajniKurs.setBounds(55, 110, 80, 14);
	contentPane.add(lblProdajniKurs);
	
	JLabel lblSrednjiKurs = new JLabel("Srednji kurs");
	lblSrednjiKurs.setBounds(55, 185, 80, 14);
	contentPane.add(lblSrednjiKurs);
	
	JLabel lblSkraceniNaziv = new JLabel("Skraceni naziv");
	lblSkraceniNaziv.setBounds(264, 185, 96, 14);
	contentPane.add(lblSkraceniNaziv);
	
	textField = new JTextField();
	textField.setBounds(55, 64, 86, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(264, 64, 86, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(264, 135, 86, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setBounds(264, 210, 86, 20);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	textField_4 = new JTextField();
	textField_4.setBounds(55, 135, 86, 20);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	textField_5 = new JTextField();
	textField_5.setBounds(55, 210, 86, 20);
	contentPane.add(textField_5);
	textField_5.setColumns(10);
	
	
	JButton btnOdustani = new JButton("Odustani");
	btnOdustani.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	});
	btnOdustani.setBounds(264, 270, 89, 23);
	contentPane.add(btnOdustani);
	
	JButton btnObrisi = new JButton("Obrisi");
	btnObrisi.setEnabled(false);
	btnObrisi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String valuta = "\nObrisan kurs: Sifra valute:"+textField.getText()+
	" Naziv valute:"+textField_1.getText()+" Prodajni kurs:"+textField_2.getText()+" Kupovni kurs:"+textField_3.getText()+
	" Srednji kurs:" +textField_4.getText()+" Skraceni naziv:"+textField_5.getText();
			menjacnica.ispisiValutu(valuta);
			dispose();
	}
	});
	btnObrisi.setBounds(55, 270, 89, 23);
	contentPane.add(btnObrisi);
	
	JCheckBox chckbxZaistaZeliteDa = new JCheckBox("Zaista obrisi kurs");
	chckbxZaistaZeliteDa.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if(chckbxZaistaZeliteDa.isSelected()) {
				btnObrisi.setEnabled(true);
			}
			else {
				btnObrisi.setEnabled(false);
			}
		}
	});
	chckbxZaistaZeliteDa.setBounds(55, 237, 143, 23);
	contentPane.add(chckbxZaistaZeliteDa);
}
}
