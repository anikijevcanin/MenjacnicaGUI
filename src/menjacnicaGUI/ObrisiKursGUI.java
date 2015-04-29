package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField sifra;
	private JTextField naziv;
	private JLabel lblNewLabel_2;
	private JTextField prodajni;
	private JLabel lblNewLabel_3;
	private JTextField kupovni;
	private JTextField srednji;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField skraceni;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JRadioButton rdbtnNewRadioButton;
	private MenjacnicaGUI glavniProzor;
	private String obrisaniKurs;


	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI glavniProzor) {
		this.glavniProzor = glavniProzor;
		createContents();
	}
	private void createContents() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("Obri\u0161i kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 386, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getProdajni());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getKupovni());
		contentPane.add(getSrednji());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getSkraceni());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getRdbtnNewRadioButton());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\u0160ifra");
			lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel.setBounds(29, 23, 116, 22);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Naziv");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(195, 23, 116, 22);
		}
		return lblNewLabel_1;
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setEditable(false);
			sifra.setBounds(29, 52, 137, 22);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setEditable(false);
			naziv.setBounds(195, 52, 143, 22);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Prodajni kurs");
			lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(29, 87, 116, 25);
		}
		return lblNewLabel_2;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setEditable(false);
			prodajni.setBounds(29, 116, 137, 22);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Kupovni kurs");
			lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(195, 87, 116, 25);
		}
		return lblNewLabel_3;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setEditable(false);
			kupovni.setBounds(195, 116, 143, 22);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setEditable(false);
			srednji.setBounds(29, 177, 137, 22);
			srednji.setColumns(10);
		}
		return srednji;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Srednji kurs");
			lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(29, 151, 116, 22);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Skra\u0107eni naziv");
			lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(195, 151, 116, 22);
		}
		return lblNewLabel_5;
	}
	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setEditable(false);
			skraceni.setBounds(195, 177, 143, 22);
			skraceni.setColumns(10);
		}
		return skraceni;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Odustani");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnNewButton.setBounds(189, 258, 164, 25);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obri\u0161i");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					obrisiKurs();
				}
			});
			btnNewButton_1.setEnabled(false);
			btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnNewButton_1.setBounds(13, 258, 163, 25);
		}
		return btnNewButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Zaista obri\u0161i kurs");
			rdbtnNewRadioButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(rdbtnNewRadioButton.isSelected())
						btnNewButton_1.setEnabled(true);
					else
						btnNewButton_1.setEnabled(false);
						
				}
			});
			rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			rdbtnNewRadioButton.setBounds(22, 223, 167, 25);
		}
		return rdbtnNewRadioButton;
	}
	
	private void obrisiKurs() {
		try {
			obrisaniKurs = "Naziv obrisanog kursa: " + naziv.getText() + ", skraćeni naziv: " + skraceni.getText() + ", prodajni kurs: " + prodajni.getText()
					+ ", kupovni kurs: " + kupovni.getText() + " i srednji kurs: " + srednji.getText();
			glavniProzor.prikaziNovi(obrisaniKurs);
			dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greška", JOptionPane.ERROR_MESSAGE);
		}

	}
}
