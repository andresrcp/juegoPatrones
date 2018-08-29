

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
import javax.swing.border.EmptyBorder;




public class CatalogoPersonajes extends JFrame { 
        private JPanel contentPane;
	FabricaAbstractaPersonaje fabricador;
		
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatalogoPersonajes frame = new CatalogoPersonajes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CatalogoPersonajes() {
                   
		setBounds(100, 100, 670, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel lblSeleccioneUnaClase = new JLabel("SELECCIONA UNA CLASE");
                lblSeleccioneUnaClase.setForeground(java.awt.Color.white);
		lblSeleccioneUnaClase.setFont(new Font("ARIAL", Font.PLAIN, 30));
		lblSeleccioneUnaClase.setBounds(150, 350, 370, 86);
		contentPane.add(lblSeleccioneUnaClase);             
    
		JButton guerbtn = new JButton("Humanos");
		guerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fabricador=new FabricaConcretaGuerreros();
				tipo frame = new tipo("Guerrero", "Caballero" , "Templario", "Mago", "Arquero", fabricador );
				frame.setVisible(true);      
                        }
		});
		guerbtn.setBounds(50, 100, 100, 30);
		contentPane.add(guerbtn);
                
                
		
		JButton btnOp = new JButton("Orcos");
		btnOp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fabricador=new FabricaConcretaOrcos();
				tipo frame = new tipo("Barbaro", "Cazador" , "Asesino" , "Brujo", "Chaman", fabricador );
				frame.setVisible(true);
                                
			}
		});
		btnOp.setBounds(50, 200, 100, 30);
		contentPane.add(btnOp);
		
		JButton btnOp_1 = new JButton("Enanos");
		btnOp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fabricador=new FabricaConcretaEnanos();
				tipo frame = new tipo("Sacerdote", "Paladin" , "Ballestero", "Elementalista","Alquimista", fabricador );
				frame.setVisible(true);
                                
			}
		});
		btnOp_1.setBounds(50, 300, 100, 30);
		contentPane.add(btnOp_1);
                
                JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo.jpg")));
		fondo.setBounds(0, 0, 670, 492);
		contentPane.add(fondo);   
    }    
}