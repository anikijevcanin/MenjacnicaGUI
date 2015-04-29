package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Enumeration;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblIznos;
	private JTextField iznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnNewRadioButton;
	private JSlider slider;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private MenjacnicaGUI glavniProzor;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI glavniProzor) {
		createContents();
		this.glavniProzor = glavniProzor;
	}
	private void createContents() {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 476, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblNewLabel());
		contentPane.add(getComboBox());
		contentPane.add(getLabel_1());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblIznos());
		contentPane.add(getIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnNewRadioButton());
		contentPane.add(getSlider());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblKupovniKurs.setBounds(12, 19, 159, 22);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Prodajni kurs");
			lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel.setBounds(293, 15, 159, 30);
		}
		return lblNewLabel;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(201, 47, 67, 28);
		}
		return comboBox;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Valuta");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(201, 15, 67, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(12, 48, 159, 30);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(293, 48, 159, 30);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblIznos.setBounds(12, 85, 159, 22);
		}
		return lblIznos;
	}
	private JTextField getIznos() {
		if (iznos == null) {
			iznos = new JTextField();
			iznos.setBounds(12, 114, 159, 30);
			iznos.setColumns(10);
		}
		return iznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblVrstaTransakcije.setBounds(226, 88, 159, 19);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			rdbtnKupovina.setBounds(226, 115, 127, 25);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			rdbtnNewRadioButton.setBounds(226, 137, 127, 25);
		}
		return rdbtnNewRadioButton;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					String pom = Integer.toString(slider.getValue());
					iznos.setText(pom);
				}
			});
			slider.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setBounds(38, 181, 394, 48);
		}
		return slider;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Zameni");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					zameni();
				}
			});
			btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnNewButton.setBounds(35, 247, 182, 30);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnNewButton_1.setBounds(252, 247, 182, 30);
		}
		return btnNewButton_1;
	}
	
	private void zameni() {
		try {
			String izabrani = null;
			for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();
	            if (button.isSelected()) {
	                izabrani =  button.getText();
	            }
	        }
			String zamenjen = "Zamenjena valuta je: " + comboBox.getSelectedItem() + ", za iznos: " + iznos.getText() + 
					", a transakcija u pitanju je: " + izabrani;
			glavniProzor.prikaziNovi(zamenjen);
			dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greška", JOptionPane.ERROR_MESSAGE);
		}
	}
}
