import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class tipo extends JFrame {

	private JPanel contentPane;

	
	public tipo(String m1, String m2, String m3, String m4, String m5, FabricaAbstractaPersonaje fab) {
	
		setBounds(100, 100, 773, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblSeleccioneTipo = new JLabel("SELECCIONE UN TIPO");
		lblSeleccioneTipo.setFont(new Font("ARIAL", Font.PLAIN, 30));
		lblSeleccioneTipo.setBounds(221, -20, 362, 86);
		contentPane.add(lblSeleccioneTipo);
                
                
		JButton op1 = new JButton("");
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(fab.getPersonaje(1).Clase.equals("Guerrero")) {
				Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/Humans.gif")));
				frame.setVisible(true);
				}
				
				if(fab.getPersonaje(1).Clase.equals("Distancia")) {
					Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
				
				if(fab.getPersonaje(1).Clase.equals("Healers")) {
					Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
				
			}
		});
		op1.setBounds(50, 100, 100, 30);
		contentPane.add(op1);
		
		JButton op2 = new JButton("");
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Guerrero")) {
					Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
					
					if(fab.getPersonaje(1).Clase.equals("Distancia")) {
						Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
					if(fab.getPersonaje(1).Clase.equals("Healers")) {
						Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
			}
		});
		
		op2.setBounds(50, 150, 100, 30);
		contentPane.add(op2);
		
		JButton op3 = new JButton("");
		op3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Guerrero")) {
					Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
					
					if(fab.getPersonaje(1).Clase.equals("Distancia")) {
						Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
					if(fab.getPersonaje(1).Clase.equals("Healer")) {
						Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
			}
		});
		op3.setBounds(50, 200, 100, 30);
		contentPane.add(op3);
		
		JButton op4 = new JButton("");
		op4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Guerrero")) {
					Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
                                        
                                if(fab.getPersonaje(1).Clase.equals("Distancia")) {
						Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}        
                                
					if(fab.getPersonaje(1).Clase.equals("Healer")) {
						Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
			}
		});
		op4.setBounds(50, 250, 100, 30);
		contentPane.add(op4);
		
		JButton op5 = new JButton("");
		op5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Guerrero")) {
					Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("")));
					frame.setVisible(true);
					}
                                         if(fab.getPersonaje(1).Clase.equals("Distancia")) {
						Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}        
                                
					if(fab.getPersonaje(1).Clase.equals("Healer")) {
						Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("")));
						frame.setVisible(true);
						}
			}
		});
		
		op5.setBounds(50, 300, 100, 30);
		contentPane.add(op5);
		
		op1.setText(m1);
		op2.setText(m2);
		op3.setText(m3);
		op4.setText(m4);
		op5.setText(m5);
		
	
	}
    

}
