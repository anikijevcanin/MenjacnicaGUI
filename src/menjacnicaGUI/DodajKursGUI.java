package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField sifra;
	private JTextField naziv;
	private JTextField prodajni;
	private JTextField kupovni;
	private JTextField srednji;
	private JTextField skraceni;
	private JLabel lblNewLabel;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private String dodatiKurs;
	private MenjacnicaGUI glavniProzor;


	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI glavniProzor) {
		createContents();
		this.glavniProzor = glavniProzor;
	}
	private void createContents() {
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 313);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getSifra());
		contentPane.add(getNaziv());
		contentPane.add(getProdajni());
		contentPane.add(getKupovni());
		contentPane.add(getSrednji());
		contentPane.add(getSkraceni());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
	}
	private JTextField getSifra() {
		if (sifra == null) {
			sifra = new JTextField();
			sifra.setBounds(12, 56, 143, 22);
			sifra.setColumns(10);
		}
		return sifra;
	}
	private JTextField getNaziv() {
		if (naziv == null) {
			naziv = new JTextField();
			naziv.setBounds(191, 56, 143, 22);
			naziv.setColumns(10);
		}
		return naziv;
	}
	private JTextField getProdajni() {
		if (prodajni == null) {
			prodajni = new JTextField();
			prodajni.setBounds(12, 120, 143, 22);
			prodajni.setColumns(10);
		}
		return prodajni;
	}
	private JTextField getKupovni() {
		if (kupovni == null) {
			kupovni = new JTextField();
			kupovni.setBounds(191, 120, 143, 22);
			kupovni.setColumns(10);
		}
		return kupovni;
	}
	private JTextField getSrednji() {
		if (srednji == null) {
			srednji = new JTextField();
			srednji.setBounds(12, 184, 143, 22);
			srednji.setColumns(10);
		}
		return srednji;
	}
	private JTextField getSkraceni() {
		if (skraceni == null) {
			skraceni = new JTextField();
			skraceni.setBounds(191, 184, 143, 22);
			skraceni.setColumns(10);
		}
		return skraceni;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\u0160ifra");
			lblNewLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNewLabel.setBounds(22, 27, 56, 22);
		}
		return lblNewLabel;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblNaziv.setBounds(206, 27, 56, 22);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblProdajniKurs.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblProdajniKurs.setBounds(22, 91, 106, 22);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblKupovniKurs.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblKupovniKurs.setBounds(201, 91, 101, 22);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblSrednjiKurs.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblSrednjiKurs.setBounds(22, 155, 83, 22);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraceniNaziv.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			lblSkraceniNaziv.setAlignmentX(Component.RIGHT_ALIGNMENT);
			lblSkraceniNaziv.setBounds(201, 155, 101, 22);
		}
		return lblSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					unesiKurs();
				}
			});
			btnDodaj.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnDodaj.setAlignmentX(Component.RIGHT_ALIGNMENT);
			btnDodaj.setBounds(12, 229, 143, 25);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			btnOdustani.setAlignmentX(Component.RIGHT_ALIGNMENT);
			btnOdustani.setBounds(191, 229, 143, 25);
		}
		return btnOdustani;
	}
	private void unesiKurs() {
		try {
			dodatiKurs = "Naziv dodatog kursa: " + naziv.getText() + ", skraćeni naziv: " + skraceni.getText() + ", prodajni kurs: " + prodajni.getText()
					+ ", kupovni kurs: " + kupovni.getText() + " i srednji kurs: " + srednji.getText();
			glavniProzor.prikaziNovi(dodatiKurs);
			dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greška", JOptionPane.ERROR_MESSAGE);
		}

	}

}
