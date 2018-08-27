
import java.awt.EventQueue;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);               
		setBounds(100, 100, 773, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccioneUnaClase = new JLabel("SELECCIONE UNA CLASE");
		lblSeleccioneUnaClase.setFont(new Font("ARIAL", Font.PLAIN, 30));
		lblSeleccioneUnaClase.setBounds(210, -20, 370, 86);
		contentPane.add(lblSeleccioneUnaClase);
		
                
                JLabel fotoPersonaje = new JLabel("");
		fotoPersonaje.setBounds(35, 37, 531, 349);
		contentPane.add(fotoPersonaje);                
                
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
				tipo frame = new tipo("Sacrdote", "Paladin" , "Ballestero", "Elementalista","Alquimista", fabricador );
				frame.setVisible(true);
			}
		});
		btnOp_1.setBounds(50, 300, 100, 30);
		contentPane.add(btnOp_1);
	}
}