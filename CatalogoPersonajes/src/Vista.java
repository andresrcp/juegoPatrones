import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Vista extends JFrame {
        
	private JPanel contentPane;

	public Vista(PersonajeAbstracto personaje,ImageIcon foto) {
                this.setResizable(false);
		setBounds(100, 100, 670, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
		JLabel fotopersonaje = new JLabel("");
		fotopersonaje.setBounds(100, 90,200, 349);
		contentPane.add(fotopersonaje);
                
		JLabel lblEspecialidad = new JLabel("Tipo:");
		lblEspecialidad.setFont(new Font("Springtime Sunshine", Font.BOLD, 18));
                lblEspecialidad.setForeground(java.awt.Color.white);
		lblEspecialidad.setBounds(400, 180, 75, 26);
		contentPane.add(lblEspecialidad);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setFont(new Font("Brodway", Font.BOLD, 18));
                lblVida.setForeground(java.awt.Color.white);
		lblVida.setBounds(400, 200, 75, 26);
		contentPane.add(lblVida);
		
		JLabel lblEscudo = new JLabel("Escudo:");
		lblEscudo.setFont(new Font("Brodway", Font.BOLD, 18));
                lblEscudo.setForeground(java.awt.Color.white);
		lblEscudo.setBounds(400,220, 75, 26);
		contentPane.add(lblEscudo);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setFont(new Font("Brodway", Font.BOLD, 18));
                lblAtaque.setForeground(java.awt.Color.white);
		lblAtaque.setBounds(400, 240, 75, 26);
		contentPane.add(lblAtaque);
		
                JLabel lblVelocidad = new JLabel("Vel. Mov:");
		lblVelocidad.setFont(new Font("Brodway", Font.BOLD, 18));
                lblVelocidad.setForeground(java.awt.Color.white);
		lblVelocidad.setBounds(400, 260, 90, 26);
		contentPane.add(lblVelocidad);
                
		JLabel Especialidadreal = new JLabel("");
		Especialidadreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Especialidadreal.setForeground(java.awt.Color.white);
		Especialidadreal.setBounds(500, 180, 142, 26);
		contentPane.add(Especialidadreal);
		
		JLabel Vidareal = new JLabel("");
		Vidareal.setFont(new Font("Brodway", Font.BOLD, 18));
                Vidareal.setForeground(java.awt.Color.white);
		Vidareal.setBounds(500, 200, 142, 26);
		contentPane.add(Vidareal);
		
		JLabel Escudoreal = new JLabel("");
		Escudoreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Escudoreal.setForeground(java.awt.Color.white);
		Escudoreal.setBounds(500, 220, 142, 26);
		contentPane.add(Escudoreal);
		
		JLabel Ataquereal = new JLabel("");
		Ataquereal.setFont(new Font("Brodway", Font.BOLD, 18));
                Ataquereal.setForeground(java.awt.Color.white);
		Ataquereal.setBounds(500, 240, 142, 26);
		contentPane.add(Ataquereal);
		
                JLabel Velocidadreal = new JLabel("");
		Velocidadreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Velocidadreal.setForeground(java.awt.Color.white);
		Velocidadreal.setBounds(500, 260, 142, 26);
		contentPane.add(Velocidadreal);
		fotopersonaje.setIcon(foto);

		Especialidadreal.setText(personaje.Especialidad);
		Vidareal.setText(personaje.Vida);
		Escudoreal.setText(personaje.Escudo);
		Ataquereal.setText(personaje.Ataque);
                Velocidadreal.setText(personaje.Velocidad);
                
                JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo2.png")));
		fondo.setBounds(0, 0, 670, 492);
		contentPane.add(fondo);
	}

}
