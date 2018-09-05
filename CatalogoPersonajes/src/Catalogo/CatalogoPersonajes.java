
package Catalogo;


import dibuja.Botones;
import dibuja.imagenes;
import dibuja.fondo;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.PageAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import sun.font.TrueTypeFont;


public class CatalogoPersonajes extends JFrame {  
	
    public static void main(String[] args) {
        
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
                                        
                                        CatalogoPersonajes frame = new CatalogoPersonajes();      	
                                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        ImageIcon icon = new ImageIcon(frame.getClass().getResource("/resources/fondo2.png"));
                                        fondo panel= new fondo(icon.getImage());
                                        
                                        ImageIcon icon2 = new ImageIcon(frame.getClass().getResource("/resources/1humano.png"));
                                        imagenes human= new imagenes(icon2.getImage());
                                        
                                        ImageIcon icon3 = new ImageIcon(frame.getClass().getResource("/resources/orcos.png"));
                                        imagenes orco= new imagenes(icon3.getImage());
                                        
                                        ImageIcon icon4 = new ImageIcon(frame.getClass().getResource("/resources/enano2.png"));
                                        imagenes enano= new imagenes(icon4.getImage());
                                        
                                       
                                        
                                        JLabel lblSeleccioneUnaClase = new JLabel("SELECCIONA UNA CLASE");
                                        lblSeleccioneUnaClase.setForeground(java.awt.Color.white);
                                        lblSeleccioneUnaClase.setFont(new Font("Castellar", Font.BOLD,25));
                                        lblSeleccioneUnaClase.setFont(new Font("Castellar", Font.ITALIC,25));
                                        lblSeleccioneUnaClase.setBounds(200, 420, 370, 86);                                        
                                        
                                        final Botones boton=new Botones(new ImageIcon(frame.getClass().getResource("/resources/botones/btn.png"))); 
                                        boton.setRolloverIcon(new ImageIcon(frame.getClass().getResource("/resources/botones/btn1.png")));
                                        boton.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent arg0) {
                                        FabricaAbstractaPersonaje fabricador;
                                        fabricador=new FabricaConcretaGuerreros();
                                        tipo frame = new tipo("Guerrero", "Caballero" , "Templario", "Mago", "Arquero", fabricador );
                                        frame.setVisible(false);
                                        }
                                        });
                                          
                                        final Botones boton2=new Botones(new ImageIcon(frame.getClass().getResource("/resources/botones/btn.png")));
                                        boton2.setRolloverIcon(new ImageIcon(frame.getClass().getResource("/resources/botones/btn2.png")));
                                        boton2.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                        FabricaAbstractaPersonaje fabricador;
                                        fabricador=new FabricaConcretaOrcos();
                                        tipo frame = new tipo("Barbaro", "Cazador" , "Asesino" , "Brujo", "Chaman", fabricador );
                                        frame.setVisible(false);
                                        }
                                        });
                                        
                                        final Botones boton3=new Botones(new ImageIcon(frame.getClass().getResource("/resources/botones/btn.png")));
                                        boton3.setRolloverIcon(new ImageIcon(frame.getClass().getResource("/resources/botones/btn3.png")));
                                        boton3.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                        FabricaAbstractaPersonaje fabricador;
                                        fabricador=new FabricaConcretaEnanos();  
                                        tipo frame = new tipo("Sacerdote", "Paladin" , "Ballestero", "Elemental","Luchador", fabricador );
                                        frame.setVisible(false);  
                                        }
                                        });
                                        
                                        human.setLocation(90, 170);
                                        orco.setLocation(330, 100);
                                        enano.setLocation(610, 260);
                                        boton.setLocation(100, 50);
                                        boton2.setLocation(350,50);
                                        boton3.setLocation(600,50);
                                        
                                        panel.add(human);
                                        panel.add(orco);
                                        panel.add(enano);
                                        panel.add(lblSeleccioneUnaClase);
                                        panel.add(boton);
                                        panel.add(boton2);
                                        panel.add(boton3);
                                        frame.getContentPane().add(panel);
                                        frame.pack();
					frame.setVisible(true);
				} 
                                catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
                
	}
                            
	public CatalogoPersonajes () {
                this.setResizable(false);
		setBounds(300, 100,0,0);
        }    
}