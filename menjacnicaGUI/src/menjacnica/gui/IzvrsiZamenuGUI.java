package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import java.awt.Button;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private MenjacnicaGUI menjacnica;

	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI m) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		menjacnica=m;
		
		JLabel lblKupovniKurs = new JLabel("Kupovni kurs");
		lblKupovniKurs.setBounds(41, 11, 79, 14);
		contentPane.add(lblKupovniKurs);
		
		JLabel lblProdajniKurs = new JLabel("Prodajni kurs");
		lblProdajniKurs.setBounds(316, 11, 71, 14);
		contentPane.add(lblProdajniKurs);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(41, 37, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(316, 37, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblValuta = new JLabel("Valuta");
		lblValuta.setBounds(200, 11, 46, 14);
		contentPane.add(lblValuta);
		
		JLabel lblIznos = new JLabel("Iznos");
		lblIznos.setBounds(41, 68, 46, 14);
		contentPane.add(lblIznos);
		
		textField_2 = new JTextField();
		textField_2.setBounds(41, 93, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblVrstaTransakcije = new JLabel("Vrsta transakcije");
		lblVrstaTransakcije.setBounds(316, 68, 86, 14);
		contentPane.add(lblVrstaTransakcije);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CFH"}));
		comboBox.setBounds(191, 37, 55, 20);
		contentPane.add(comboBox);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				textField_2.setText(Integer.toString(slider.getValue()));
			}
		});
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(5);
		slider.setBounds(24, 148, 375, 45);
		contentPane.add(slider);
		
		JRadioButton rdbtnKupovna = new JRadioButton("Kupovna");
		rdbtnKupovna.setBounds(305, 92, 109, 23);
		contentPane.add(rdbtnKupovna);
		
		JRadioButton rdbtnProdajna = new JRadioButton("Prodajna");
		rdbtnProdajna.setBounds(305, 118, 109, 23);
		contentPane.add(rdbtnProdajna);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnKupovna);
		bg.add(rdbtnProdajna);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String transakcija=null;
				if(rdbtnKupovna.isSelected()) {
					transakcija = "kupovna";
				}
				if(rdbtnProdajna.isSelected()) {
					transakcija = "prodajna";
				}
				
			String valuta = "\nZamenjena valuta:" +comboBox.getSelectedItem()+" iznos "+slider.getValue()+" transakcija: "+transakcija;
							menjacnica.ispisiValutu(valuta);
								dispose();
			}
		});
		btnIzvrsiZamenu.setBounds(51, 227, 125, 23);
		contentPane.add(btnIzvrsiZamenu);
		
		JButton btnOdustani = new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnOdustani.setBounds(280, 227, 125, 23);
		contentPane.add(btnOdustani);
		
	}
}
