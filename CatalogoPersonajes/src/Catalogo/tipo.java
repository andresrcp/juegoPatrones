package Catalogo;



import dibuja.Botones;
import dibuja.fondo;
import dibuja.imagenes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class tipo extends JFrame {

	public tipo(String m1, String m2, String m3, String m4, String m5, FabricaAbstractaPersonaje fab) {
                
                CatalogoPersonajes frame = new CatalogoPersonajes();      	
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ImageIcon icon = new ImageIcon(frame.getClass().getResource("/resources/fondo2.png"));
                fondo panel1= new fondo(icon.getImage());
                
                JLabel lblSeleccioneTipo = new JLabel("SELECCIONA UN TIPO");
                lblSeleccioneTipo.setForeground(java.awt.Color.white);
		lblSeleccioneTipo.setFont(new Font("Castellar", Font.BOLD, 25));
		lblSeleccioneTipo.setBounds(200, 420, 370, 86);

                ImageIcon icon2 = new ImageIcon(frame.getClass().getResource("/resources/enanof.png"));
                imagenes img= new imagenes(icon2.getImage());
                
                ImageIcon icon3 = new ImageIcon(frame.getClass().getResource("/resources/orc.png"));
                imagenes img2= new imagenes(icon3.getImage());
                
                ImageIcon icon4 = new ImageIcon(frame.getClass().getResource("/resources/humano.png"));
                imagenes img3= new imagenes(icon4.getImage());
                
                ImageIcon icon5 = new ImageIcon(frame.getClass().getResource("/resources/humanoo.png"));
                imagenes img4= new imagenes(icon5.getImage());
                
                ImageIcon icon6 = new ImageIcon(frame.getClass().getResource("/resources/orcarch.png"));
                imagenes img5= new imagenes(icon6.getImage());

                JButton op1 = new JButton("");
                op1.setForeground(java.awt.Color.white);  
                op1.setContentAreaFilled(false);
		op1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    
                            if(fab.getPersonaje(1).Clase.equals("Humanos")) {
                                Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                                op1.setRolloverIcon(new ImageIcon(frame.getClass().getResource("/resources/botones/btnguerr.png")));
                                frame.setVisible(true);                   
                                }
				
				if(fab.getPersonaje(1).Clase.equals("Orcos")) {
					Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
					frame.setVisible(true);
                                        
					}
				
				if(fab.getPersonaje(1).Clase.equals("Enanos")) {
					Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
					frame.setVisible(true);
                                        
					}
				
			}
		});
		op1.setBounds(600, 100, 100, 30);
		
		JButton op2 = new JButton("");
                op2.setForeground(java.awt.Color.white);  
                op2.setContentAreaFilled(false);
		op2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Humanos")) {
					Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
					frame.setVisible(true);
                                        }
					
				if(fab.getPersonaje(1).Clase.equals("Orcos")) {
					Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
					frame.setVisible(true);      
					}
				if(fab.getPersonaje(1).Clase.equals("Enanos")) {
					Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
					frame.setVisible(true);   
					}
			}
		});
		op2.setBounds(600, 150, 100, 30);
		
		JButton op3 = new JButton("");
                op3.setForeground(java.awt.Color.white);  
                op3.setContentAreaFilled(false);
		op3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Humanos")) {
                                        Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                                        frame.setVisible(true);
                                        }
					
                                if(fab.getPersonaje(1).Clase.equals("Orcos")) {
                                        Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                                        frame.setVisible(true);
                                        }
                                if(fab.getPersonaje(1).Clase.equals("Enanos")) {
                                        Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                                        frame.setVisible(true);
                                         }
			}
		});
		op3.setBounds(600, 200, 100, 30);
		
		JButton op4 = new JButton("");
                op4.setForeground(java.awt.Color.white);  
                op4.setContentAreaFilled(false);
		op4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Humanos")) {
					Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
					frame.setVisible(true);
                                        
					}
                                        
                                if(fab.getPersonaje(1).Clase.equals("Orcos")) {
					Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
					frame.setVisible(true);
                                                 
					}        
                                
				if(fab.getPersonaje(1).Clase.equals("Enanos")) {
					Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
					frame.setVisible(true);       
					}
			}
		});
		op4.setBounds(600, 250, 100, 30);
		
		JButton op5 = new JButton("");
                op5.setForeground(java.awt.Color.white);  
                op5.setContentAreaFilled(false);
		op5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fab.getPersonaje(1).Clase.equals("Humanos")) {
					Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
					frame.setVisible(true);       
				}
                                if(fab.getPersonaje(1).Clase.equals("Orcos")) {
					Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
					frame.setVisible(true);    
					}        
                                
				if(fab.getPersonaje(1).Clase.equals("Enanos")) {
					Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
					frame.setVisible(true);
					}
			}
		});
		op5.setBounds(600, 300, 100, 30);
		
		op1.setText(m1);
		op2.setText(m2);
		op3.setText(m3);
		op4.setText(m4);
		op5.setText(m5);
                
                img.setLocation(300, 250);
                img2.setLocation(-50, 40);
                img3.setLocation(250, 180);
                img4.setLocation(500, 300);
                img5.setLocation(400, 165);
                
                panel1.add(img);
                panel1.add(img2);
                panel1.add(img3);
                panel1.add(img4);
                panel1.add(img5);
                panel1.add(op1);
                panel1.add(op2);
                panel1.add(op3);
                panel1.add(op4);
                panel1.add(op5);
                panel1.add(lblSeleccioneTipo);
                frame.getContentPane().add(panel1);
                frame.pack();
		frame.setVisible(true); 
       
	}
}
