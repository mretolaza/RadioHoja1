import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Radio_Principañ {

	private JFrame frmPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio_Principañ window = new Radio_Principañ();
					window.frmPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Radio_Principañ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.getContentPane().setBackground(new Color(25, 25, 112));
		frmPrincipal.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(94, 51, 614, 132);
		frmPrincipal.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lb_emision = new JLabel("-");
		lb_emision.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lb_emision.setBounds(193, 43, 219, 53);
		panel.add(lb_emision);
		
		JLabel lb_AmFm = new JLabel("*");
		lb_AmFm.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lb_AmFm.setBounds(10, 0, 119, 132);
		panel.add(lb_AmFm);
		
		JRadioButton radFM = new JRadioButton("   FM");
		radFM.setForeground(new Color(0, 0, 255));
		radFM.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		radFM.setBounds(19, 73, 62, 23);
		frmPrincipal.getContentPane().add(radFM);
		
		JRadioButton radAM = new JRadioButton("  AM");
		radAM.setForeground(new Color(0, 0, 255));
		radAM.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		radAM.setBounds(19, 105, 62, 23);
		frmPrincipal.getContentPane().add(radAM);
		
		JButton but1 = new JButton("1");
		but1.setFont(new Font("Verdana", Font.PLAIN, 11));
		but1.setBounds(84, 195, 43, 48);
		frmPrincipal.getContentPane().add(but1);
		
		JButton but2 = new JButton("2");
		but2.setFont(new Font("Verdana", Font.PLAIN, 11));
		but2.setBounds(134, 195, 43, 48);
		frmPrincipal.getContentPane().add(but2);
		
		JButton but3 = new JButton("3");
		but3.setFont(new Font("Verdana", Font.PLAIN, 11));
		but3.setBounds(187, 195, 43, 48);
		frmPrincipal.getContentPane().add(but3);
		
		JButton but4 = new JButton("4");
		but4.setFont(new Font("Verdana", Font.PLAIN, 11));
		but4.setBounds(240, 195, 43, 48);
		frmPrincipal.getContentPane().add(but4);
		
		JButton but5 = new JButton("5");
		but5.setFont(new Font("Verdana", Font.PLAIN, 11));
		but5.setBounds(293, 195, 43, 48);
		frmPrincipal.getContentPane().add(but5);
		
		JButton but6 = new JButton("6");
		but6.setFont(new Font("Verdana", Font.PLAIN, 11));
		but6.setBounds(346, 195, 43, 48);
		frmPrincipal.getContentPane().add(but6);
		
		JButton but7 = new JButton("7");
		but7.setFont(new Font("Verdana", Font.PLAIN, 11));
		but7.setBounds(399, 195, 43, 48);
		frmPrincipal.getContentPane().add(but7);
		
		JButton but8 = new JButton("8");
		but8.setFont(new Font("Verdana", Font.PLAIN, 11));
		but8.setBounds(452, 195, 43, 48);
		frmPrincipal.getContentPane().add(but8);
		
		JButton but9 = new JButton("9");
		but9.setFont(new Font("Verdana", Font.PLAIN, 11));
		but9.setBounds(505, 195, 43, 48);
		frmPrincipal.getContentPane().add(but9);
		
		JButton but10 = new JButton("10");
		but10.setFont(new Font("Verdana", Font.PLAIN, 11));
		but10.setBounds(558, 195, 50, 48);
		frmPrincipal.getContentPane().add(but10);
		
		JButton but11 = new JButton("11");
		but11.setFont(new Font("Verdana", Font.PLAIN, 11));
		but11.setBounds(618, 195, 50, 48);
		frmPrincipal.getContentPane().add(but11);
		
		JButton but12 = new JButton("12");
		but12.setFont(new Font("Verdana", Font.PLAIN, 11));
		but12.setBounds(678, 195, 50, 48);
		frmPrincipal.getContentPane().add(but12);
		
		JRadioButton RadSave = new JRadioButton(" Save");
		RadSave.setForeground(Color.BLUE);
		RadSave.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		RadSave.setBounds(19, 136, 62, 23);
		frmPrincipal.getContentPane().add(RadSave);
		
		JButton btnNewButton = new JButton("ON/OFF");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnNewButton.setBounds(620, 314, 108, 40);
		frmPrincipal.getContentPane().add(btnNewButton);
		frmPrincipal.setTitle("Principal");
		frmPrincipal.setFont(new Font("Californian FB", Font.PLAIN, 22));
		frmPrincipal.setBounds(100, 100, 780, 404);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
