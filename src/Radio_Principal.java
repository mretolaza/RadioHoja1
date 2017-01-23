
/*
 * Hoja de trabajo no.1 - Simulador de Radio 
 * Javier Ramos, 16339 
 * Mar�a Mercedes Retolaza, 16339 
 * Diego Fernandez, 16344 
 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.*;

import com.sun.glass.ui.Timer;
import javax.swing.JCheckBox;

public class Radio_Principal {

	private JFrame frmPrincipal;
	private JSlider slider;
	private JLabel lb_emision;
	private JRadioButton radFM;
	private JRadioButton radAM;
	private ButtonGroup grupo1 = new ButtonGroup();
	private JButton     OnOFF; 
	private Radio rad = new Radio(); 
	private JButton but1; 
	private JButton but2; 
	private JButton but3; 
	private JButton but4; 
	private JButton but5; 
	private JButton but6; 
	private JButton but7; 
	private JButton but8; 
	private JButton but9; 
	private JButton but10; 
	private JButton but11; 
	private JButton but12; 
	private JLabel  lb_AmFm; 
	private String frecuencia; 
	private String estacion; 
	private JCheckBox chkSave;
	private MemoryBoton[] memoria = new MemoryBoton[12];
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radio_Principal window = new Radio_Principal();
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
	public Radio_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipal = new JFrame();
		frmPrincipal.setForeground(Color.WHITE);
		frmPrincipal.getContentPane().setBackground(new Color(25, 25, 112));
		frmPrincipal.getContentPane().setLayout(null);
		//delcaracion del radio 
		Radio  rad = new Radio(); 
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(87, 51, 645, 132);
		frmPrincipal.getContentPane().add(panel);
		panel.setLayout(null);
		
		lb_emision = new JLabel("");
		lb_emision.setFont(new Font("Berlin Sans FB", Font.PLAIN, 35));
		lb_emision.setBounds(288, 38, 229, 53);
		panel.add(lb_emision);
		
		JLabel lb_AmFm = new JLabel("");
		lb_AmFm.setFont(new Font("Berlin Sans FB", Font.PLAIN, 30));
		lb_AmFm.setBounds(10, 0, 119, 132);
		panel.add(lb_AmFm);
		
		radFM = new JRadioButton("   FM");
		grupo1.add(radFM);
		radFM.setSelected(true);
		radFM.setForeground(new Color(0, 0, 255));
		radFM.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		radFM.setBounds(19, 73, 62, 23);
		radFM.addActionListener(new Listener());
		frmPrincipal.getContentPane().add(radFM);
	
		
		radAM = new JRadioButton("  AM");
		grupo1.add(radAM);
		radAM.setForeground(new Color(0, 0, 255));
		radAM.setFont(new Font("Microsoft YaHei", Font.BOLD, 11));
		radAM.setBounds(19, 105, 62, 23);
		radAM.addActionListener(new Listener());
		frmPrincipal.getContentPane().add(radAM);
		
		
		but1 = new JButton("1");
		but1.addActionListener(new Listener());
		but1.setFont(new Font("Verdana", Font.PLAIN, 11));
		but1.setBounds(84, 195, 43, 48);
		frmPrincipal.getContentPane().add(but1);
		
		but2 = new JButton("2");
		but2.addActionListener(new Listener());
		but2.setFont(new Font("Verdana", Font.PLAIN, 11));
		but2.setBounds(134, 195, 43, 48);
		frmPrincipal.getContentPane().add(but2);
		
		but3 = new JButton("3");
		but3.addActionListener(new Listener());
		but3.setFont(new Font("Verdana", Font.PLAIN, 11));
		but3.setBounds(187, 195, 43, 48);
		frmPrincipal.getContentPane().add(but3);
		
		but4 = new JButton("4");
		but4.addActionListener(new Listener());
		but4.setFont(new Font("Verdana", Font.PLAIN, 11));
		but4.setBounds(240, 195, 43, 48);
		frmPrincipal.getContentPane().add(but4);
		
		but5 = new JButton("5");
		but5.addActionListener(new Listener());
		but5.setFont(new Font("Verdana", Font.PLAIN, 11));
		but5.setBounds(293, 195, 43, 48);
		frmPrincipal.getContentPane().add(but5);
		
		but6 = new JButton("6");
		but6.addActionListener(new Listener());
		but6.setFont(new Font("Verdana", Font.PLAIN, 11));
		but6.setBounds(346, 195, 43, 48);
		frmPrincipal.getContentPane().add(but6);
		
		but7 = new JButton("7");
		but7.addActionListener(new Listener());
		but7.setFont(new Font("Verdana", Font.PLAIN, 11));
		but7.setBounds(399, 195, 43, 48);
		frmPrincipal.getContentPane().add(but7);
		
		but8 = new JButton("8");
		but8.addActionListener(new Listener());
		but8.setFont(new Font("Verdana", Font.PLAIN, 11));
		but8.setBounds(452, 195, 43, 48);
		frmPrincipal.getContentPane().add(but8);
		
		but9 = new JButton("9");
		but9.addActionListener(new Listener());
		but9.setFont(new Font("Verdana", Font.PLAIN, 11));
		but9.setBounds(505, 195, 43, 48);
		frmPrincipal.getContentPane().add(but9);
		
		but10 = new JButton("10");
		but10.addActionListener(new Listener());
		but10.setFont(new Font("Verdana", Font.PLAIN, 11));
		but10.setBounds(558, 195, 50, 48);
		frmPrincipal.getContentPane().add(but10);
		
		but11 = new JButton("11");
		but11.addActionListener(new Listener());
		but11.setFont(new Font("Verdana", Font.PLAIN, 11));
		but11.setBounds(618, 195, 50, 48);
		frmPrincipal.getContentPane().add(but11);
		
		but12 = new JButton("12");
		but12.addActionListener(new Listener());
		but12.setFont(new Font("Verdana", Font.PLAIN, 11));
		but12.setBounds(678, 195, 50, 48);
		frmPrincipal.getContentPane().add(but12);
		
		JButton OnOFF = new JButton("ON/OFF");
		OnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == OnOFF) {
					 if (rad.isOn == false) {
					     rad.isOn= true; 
					     but1.setEnabled(false); 
					     but2.setEnabled(false); 
					     but3.setEnabled(false); 
					     but4.setEnabled(false); 
					     but5.setEnabled(false); 
					     but6.setEnabled(false); 
					     but7.setEnabled(false); 
					     but8.setEnabled(false); 
					     but9.setEnabled(false); 
					     but10.setEnabled(false); 
					     but11.setEnabled(false); 
					     but12.setEnabled(false); 
					     lb_emision.setText("Apagado");
					     
					 } else 
						 
						 if (rad.isOn==true) {
							 rad.isOn= false;
					 
							 but1.setEnabled(true); 
						     but2.setEnabled(true); 
						     but3.setEnabled(true); 
						     but4.setEnabled(true); 
						     but5.setEnabled(true); 
						     but6.setEnabled(true); 
						     but7.setEnabled(true); 
						     but8.setEnabled(true); 
						     but9.setEnabled(true); 
						     but10.setEnabled(true); 
						     but11.setEnabled(true); 
						     but12.setEnabled(true); 
						     lb_emision.setText("Bienvenido");
						 }
				 }
			}
		});  
		OnOFF.setBackground(new Color(224, 255, 255));
		OnOFF.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		OnOFF.setBounds(666, 265, 88, 89);
		frmPrincipal.getContentPane().add(OnOFF);
		
		slider = new JSlider();
		slider.setForeground(Color.CYAN);
		slider.setValue(0);
		slider.setMaximum(1079);
		slider.setMinimum(789);
		slider.setBounds(250, 254, 255, 50);
		slider.addChangeListener(new ChangeListener(){
			 @Override
			 
				public void stateChanged(ChangeEvent e) {
					// TODO Auto-generated method stub
				 if (radFM.isSelected()){
					 lb_emision.setText(""+(float)((float)slider.getValue()/(float)10));
					 lb_AmFm.setText("FM");
					 
				 }	else if (radAM.isSelected()) {
					 lb_emision.setText(""+slider.getValue()*10);
					 lb_AmFm.setText("AM");
				 }
				}
		});
		frmPrincipal.getContentPane().add(slider);
		
		chkSave = new JCheckBox("Save");
		chkSave.setBounds(8, 208, 62, 23);
		frmPrincipal.getContentPane().add(chkSave);
		frmPrincipal.setTitle("Principal");
		frmPrincipal.setFont(new Font("Californian FB", Font.PLAIN, 22));
		frmPrincipal.setBounds(100, 100, 780, 404);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Listener implements ActionListener{
		private int i = 0;
		@Override
		public void actionPerformed(ActionEvent e) { 
			i = 0;
			 if (e.getSource() == radFM) {
				slider.setMaximum(1079);
				slider.setMinimum(789);
				slider.setValue(slider.getMinimum());
				
			 }
			 if (e.getSource() == radAM){
				slider.setMaximum(161);
				slider.setMinimum(53);
				slider.setValue(slider.getMinimum());
			 }
			 
			 if (e.getSource() == but1){
				 i = 1;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but2){
				 i = 2;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but3){
				 i = 3;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but4){
				 i = 4;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but5){
				 i = 5;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 
			 if (e.getSource() == but6){
				 i = 6;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but7){
				 i = 7;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but8){
				 i = 1;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 
			 if (e.getSource() == but9){
				 i = 9;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but10){
				 i = 10;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but11){
				 i = 11;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 if (e.getSource() == but12){
				 i = 12;
				 if (chkSave.isSelected() && memoria[i] == null){
					 if (radFM.isSelected()){
						 memoria[i] = new MemoryBoton("FM" , lb_emision.getText());
					 } else {
						 memoria[i] = new MemoryBoton("AM" , lb_emision.getText());
					 }
				 } else {
					if (memoria[i].getFrecuency().equals("FM") && memoria[i] != null){
						radFM.setSelected(true);
						slider.setMaximum(1079);
						slider.setMinimum(789);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value*10));
					} else if (memoria[i].getFrecuency().equals("AM") && memoria[i] != null) {
						radAM.setSelected(true);
						slider.setMaximum(1610);
						slider.setMinimum(530);
						double value = Double.parseDouble(memoria[i].getStation());
						slider.setValue((int)(value/10));
					}
				 }
				 
			 }
			 
			 
		}
		
		
	}
}
			 
			 


