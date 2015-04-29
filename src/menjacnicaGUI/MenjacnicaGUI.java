package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.io.File;

import com.sun.glass.events.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObriiKurs;
	private JMenuItem mntmIzvriIzmenu;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
                izadjiIzAplikacije();
            }

		});

		setTitle("Menja\u010Dnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 578, 403);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(150, 10));
			panel.setLayout(null);
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
			panel.add(getBtnNewButton_2());
		}
		return panel;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setPreferredSize(new Dimension(250, 70));
			scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setAutoscrolls(true);
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, Double.class, Double.class, Double.class, String.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			addPopup(table, getPopupMenu());
			table.getColumnModel().getColumn(1).setPreferredWidth(105);
		}
		return table;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziDodajKursGUI();
				}
			});
			btnNewButton.setPreferredSize(new Dimension(110, 20));
			btnNewButton.setBounds(12, 25, 126, 25);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obri\u0161i kurs");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziObrisiKursGUI();
				}
			});
			btnNewButton_1.setPreferredSize(new Dimension(110, 20));
			btnNewButton_1.setBounds(12, 56, 126, 25);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izvr\u0161i zamenu");
			btnNewButton_2.setBounds(12, 89, 126, 25);
		}
		return btnNewButton_2;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ucitajIzFajla();
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/TreeOpen.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sacuvajUFajl();
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izadjiIzAplikacije();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pokaziAbout();
				}
			});
		}
		return mntmAbout;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvriIzmenu());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziDodajKursGUI();
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObriiKurs == null) {
			mntmObriiKurs = new JMenuItem("Obri\u0161i kurs");
			mntmObriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					prikaziObrisiKursGUI();
				}
			});
		}
		return mntmObriiKurs;
	}
	private JMenuItem getMntmIzvriIzmenu() {
		if (mntmIzvriIzmenu == null) {
			mntmIzvriIzmenu = new JMenuItem("Izvr\u0161i zamenu");
		}
		return mntmIzvriIzmenu;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setLineWrap(true);
			textArea.setPreferredSize(new Dimension(250, 300));
			textArea.setWrapStyleWord(true);
		}
		return textArea;
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	private void ucitajIzFajla() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showOpenDialog(contentPane);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				textArea.append("Učitan je fajl: " + file.getAbsolutePath());
				textArea.append("\n");
			}	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void sacuvajUFajl() {
		try {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(contentPane);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				textArea.append("Sačuvan je fajl: " + file.getAbsolutePath());
				textArea.append("\n");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(contentPane, e.getMessage(),
					"Greska", JOptionPane.ERROR_MESSAGE);
		}
	}
	private void izadjiIzAplikacije() {
		int option = JOptionPane.showConfirmDialog(contentPane,
				"Da li želite da izađete iz aplikacije?", "Izlazak",
				JOptionPane.YES_NO_CANCEL_OPTION);

		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	private void pokaziAbout(){
		JOptionPane.showMessageDialog(contentPane,
				"Autor: Anisja Kijevcanin, Verzija 1.0", "O aplikaciji",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void prikaziDodajKursGUI() {
		DodajKursGUI prozorDodaj = new DodajKursGUI(this);
		prozorDodaj.setLocationRelativeTo(contentPane);
		prozorDodaj.setVisible(true);
	}
	
	protected void prikaziNovi(String novi) {
		textArea.append(novi);
		textArea.append("\n");
	}
	
	private void prikaziObrisiKursGUI() {
		ObrisiKursGUI prozorObrisi = new ObrisiKursGUI(this);
		prozorObrisi.setLocationRelativeTo(contentPane);
		prozorObrisi.setVisible(true);
	}
	
	
	
}