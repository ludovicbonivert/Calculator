import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class App extends JFrame {

	private JPanel contentPane;
	private JLabel lbl_bewerkingsteken;
	private JButton button_0;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JTextField getalvak;
	private JTextField tekstvak;
	private JButton button_C;
	private JButton button_plus;
	private JButton button_min;
	private JButton button_X;
	private JButton button_delen;
	private JButton button_equal;
	private JButton btnCe;

	//Init field
	String tekstField = "0";
	int userInput;
	String getalField = "0";
	String bewerkingsteken = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		initComponents();
	}
	private void initComponents() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 526);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		this.lbl_bewerkingsteken = new JLabel("");
		this.lbl_bewerkingsteken.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		this.lbl_bewerkingsteken.setBounds(26, 62, 37, 45);
		this.contentPane.add(this.lbl_bewerkingsteken);
		
		this.button_0 = new JButton("0");
		this.button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_0_actionPerformed(e);
			}
		});
		this.button_0.setBounds(26, 393, 75, 75);
		this.contentPane.add(this.button_0);
		
		this.button_1 = new JButton("1");
		this.button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_1_actionPerformed(e);
			}
		});
		this.button_1.setBounds(26, 317, 75, 75);
		this.contentPane.add(this.button_1);
		
		this.button_2 = new JButton("2");
		this.button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_2_actionPerformed(e);
			}
		});
		this.button_2.setBounds(102, 317, 75, 75);
		this.contentPane.add(this.button_2);
		
		this.button_3 = new JButton("3");
		this.button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_3_actionPerformed(e);
			}
		});
		this.button_3.setBounds(179, 317, 75, 75);
		this.contentPane.add(this.button_3);
		
		this.button_4 = new JButton("4");
		this.button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_4_actionPerformed(e);
			}
		});
		this.button_4.setBounds(26, 242, 75, 75);
		this.contentPane.add(this.button_4);
		
		this.button_5 = new JButton("5");
		this.button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_5_actionPerformed(e);
			}
		});
		this.button_5.setBounds(102, 242, 75, 75);
		this.contentPane.add(this.button_5);
		
		this.button_6 = new JButton("6");
		this.button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_6_actionPerformed(e);
			}
		});
		this.button_6.setBounds(179, 242, 75, 75);
		this.contentPane.add(this.button_6);
		
		this.button_7 = new JButton("7");
		this.button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_7_actionPerformed(e);
			}
		});
		this.button_7.setBounds(26, 167, 75, 75);
		this.contentPane.add(this.button_7);
		
		this.button_8 = new JButton("8");
		this.button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_8_actionPerformed(e);
			}
		});
		this.button_8.setBounds(102, 167, 75, 75);
		this.contentPane.add(this.button_8);
		
		this.button_9 = new JButton("9");
		this.button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_9_actionPerformed(e);
			}
		});
		this.button_9.setBounds(179, 167, 75, 75);
		this.contentPane.add(this.button_9);
		
		this.getalvak = new JTextField();
		this.getalvak.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		this.getalvak.setText("0");
		this.getalvak.setHorizontalAlignment(SwingConstants.RIGHT);
		this.getalvak.setEditable(false);
		this.getalvak.setBounds(75, 18, 259, 65);
		this.contentPane.add(this.getalvak);
		this.getalvak.setColumns(10);
		
		this.tekstvak = new JTextField();
		this.tekstvak.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		this.tekstvak.setText("0");
		this.tekstvak.setHorizontalAlignment(SwingConstants.RIGHT);
		this.tekstvak.setEditable(false);
		this.tekstvak.setBounds(75, 86, 259, 65);
		this.contentPane.add(this.tekstvak);
		this.tekstvak.setColumns(10);
		
		this.button_C = new JButton("C");
		this.button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_C_actionPerformed(e);
			}
		});
		this.button_C.setBounds(102, 393, 75, 37);
		this.contentPane.add(this.button_C);
		
		this.button_plus = new JButton("+");
		this.button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_plus_actionPerformed(e);
			}
		});
		this.button_plus.setBounds(259, 393, 75, 75);
		this.contentPane.add(this.button_plus);
		
		this.button_min = new JButton("-");
		this.button_min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_min_actionPerformed(e);
			}
		});
		this.button_min.setBounds(259, 317, 75, 75);
		this.contentPane.add(this.button_min);
		
		this.button_X = new JButton("X");
		this.button_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_X_actionPerformed(e);
			}
		});
		this.button_X.setBounds(259, 242, 75, 75);
		this.contentPane.add(this.button_X);
		
		this.button_delen = new JButton("/");
		this.button_delen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_delen_actionPerformed(e);
			}
		});
		this.button_delen.setBounds(259, 167, 75, 75);
		this.contentPane.add(this.button_delen);
		
		this.button_equal = new JButton("=");
		this.button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_button_equal_actionPerformed(e);
			}
		});
		this.button_equal.setBounds(178, 393, 75, 75);
		this.contentPane.add(this.button_equal);
		
		this.btnCe = new JButton("CE");
		this.btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCe_actionPerformed(e);
			}
		});
		this.btnCe.setBounds(102, 428, 75, 37);
		this.contentPane.add(this.btnCe);
	}
	
	protected void do_button_0_actionPerformed(ActionEvent e) {
		userInput = 0;
		interactieRekenmachine();
	}
	protected void do_button_1_actionPerformed(ActionEvent e) {
		userInput = 1;
		interactieRekenmachine();
	}
	protected void do_button_2_actionPerformed(ActionEvent e) {
		userInput = 2;
		interactieRekenmachine();
	}
	protected void do_button_3_actionPerformed(ActionEvent e) {
		userInput = 3;
		interactieRekenmachine();
	}
	protected void do_button_4_actionPerformed(ActionEvent e) {
		userInput = 4;
		interactieRekenmachine();
	}
	protected void do_button_5_actionPerformed(ActionEvent e) {
		userInput = 5;
		interactieRekenmachine();
	}
	protected void do_button_6_actionPerformed(ActionEvent e) {
		userInput = 6;
		interactieRekenmachine();
	}
	protected void do_button_7_actionPerformed(ActionEvent e) {
		userInput = 7;
		interactieRekenmachine();
	}
	protected void do_button_8_actionPerformed(ActionEvent e) {
		userInput = 8;
		interactieRekenmachine();
	}
	protected void do_button_9_actionPerformed(ActionEvent e) {
		userInput = 9;
		interactieRekenmachine();
	}
	protected void do_button_C_actionPerformed(ActionEvent e) {
		resetTekstVak();
		resetGetalVak();
		bewerkingsteken = "";
		lbl_bewerkingsteken.setText("");
	}
	protected void do_btnCe_actionPerformed(ActionEvent e) {
		resetTekstVak();
	}
	protected void do_button_delen_actionPerformed(ActionEvent e) {
		bewerkingsteken = "delen";
		lbl_bewerkingsteken.setText("/");
		kopieren();
	}
	protected void do_button_X_actionPerformed(ActionEvent e) {
		bewerkingsteken = "vermenigvuldigen";
		lbl_bewerkingsteken.setText("X");
		kopieren();
	}
	protected void do_button_min_actionPerformed(ActionEvent e) {
		bewerkingsteken = "aftrekken";
		lbl_bewerkingsteken.setText("-");
		kopieren();
	}
	protected void do_button_plus_actionPerformed(ActionEvent e) {
		bewerkingsteken = "optellen";
		lbl_bewerkingsteken.setText("+");
		kopieren();
	}
	protected void do_button_equal_actionPerformed(ActionEvent e) {
		berekenen();
	}
	
	/***********  NEW METHODS **********/
	protected void kopieren(){
		if(getalField == "0"){
			getalField = tekstField;
			getalvak.setText(getalField);	
			resetTekstVak();
		}
	}
	protected void resetTekstVak(){
		userInput = 0;
		tekstField = "0";
		tekstvak.setText("0");
	}
	protected void resetGetalVak(){
		getalField = "0";
		getalvak.setText("0");
	}
	private void interactieRekenmachine(){
		if(userInput == 0 && tekstField == "0"){
			System.out.println("Gebruiker voert een 0 in maar tekstField is al 0");
		} else if (userInput != 0 && tekstField == "0"){
			System.out.println("Gebruiker voert ander nummer dan 0 en dan moeten we tekstField aanpassen");
			tekstField = Integer.toString(userInput);
		}else {
			System.out.println("Toevoegen van userInput in het tekstField vak");
			tekstField += Integer.toString(userInput);
		}
		tekstvak.setText(tekstField);
		uitvoeringOperatie();
	}
	private void berekenen(){
		if(bewerkingsteken != ""){
			double getal1 = Double.parseDouble(getalField);
			double getal2 = Double.parseDouble(tekstField);
			double uitkomst = 0;
			if(bewerkingsteken == "optellen"){
				uitkomst = (int)getal1+(int)getal2;
				getalvak.setText(Double.toString(uitkomst));
				resetTekstVak();
			}
			if(bewerkingsteken == "aftrekken"){
				uitkomst = getal1-getal2;
				getalvak.setText(Double.toString(uitkomst));
				resetTekstVak();
			}
			if(bewerkingsteken == "delen"){
				uitkomst = getal1/getal2;
				getalvak.setText(Double.toString(uitkomst));
				resetTekstVak();
			}
			if(bewerkingsteken == "vermenigvuldigen"){
				uitkomst = getal1*getal2;
				getalvak.setText(Double.toString(uitkomst));
				resetTekstVak();
			}
			getalField = String.valueOf(uitkomst);
		}else {
			getalvak.setText(tekstField);
			getalField = tekstField;
		}
	}
	
	private void uitvoeringOperatie(){
		if(getalField != "0"){
			System.out.println("Er is iets te bereken ! ");
			berekenen();
			tekstvak.setText(Integer.toString(userInput));
		}
	}
	
	
}
