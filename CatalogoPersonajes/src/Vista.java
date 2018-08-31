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

	public Vista(PersonajeAbstracto personaje,ImageIcon foto ) {
                this.setResizable(false);
		setBounds(100, 100, 670, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
		JLabel fotopersonaje = new JLabel("");
		fotopersonaje.setBounds(300, 90,200, 349);
		contentPane.add(fotopersonaje);
                
               
                
		JLabel lblEspecialidad = new JLabel("Tipo:");
		lblEspecialidad.setFont(new Font("Springtime Sunshine", Font.BOLD, 18));
                lblEspecialidad.setForeground(java.awt.Color.white);
		lblEspecialidad.setBounds(30, 30, 75, 26);
		contentPane.add(lblEspecialidad);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setFont(new Font("Brodway", Font.BOLD, 18));
                lblVida.setForeground(java.awt.Color.white);
		lblVida.setBounds(30, 50, 75, 26);
		contentPane.add(lblVida);
		
		JLabel lblEscudo = new JLabel("Escudo:");
		lblEscudo.setFont(new Font("Brodway", Font.BOLD, 18));
                lblEscudo.setForeground(java.awt.Color.white);
		lblEscudo.setBounds(30,70, 75, 26);
		contentPane.add(lblEscudo);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setFont(new Font("Brodway", Font.BOLD, 18));
                lblAtaque.setForeground(java.awt.Color.white);
		lblAtaque.setBounds(30, 90, 75, 26);
		contentPane.add(lblAtaque);
		
                JLabel lblarmadura = new JLabel("ARMADURA");
		lblarmadura.setFont(new Font("Brodway", Font.BOLD, 18));
                lblarmadura.setForeground(java.awt.Color.black);
		lblarmadura.setBounds(470, 50, 150, 50);
		contentPane.add(lblarmadura);
                
                JLabel lblVelocidad = new JLabel("Vel. Mov:");
		lblVelocidad.setFont(new Font("Brodway", Font.BOLD, 18));
                lblVelocidad.setForeground(java.awt.Color.white);
		lblVelocidad.setBounds(30, 110, 90, 26);
		contentPane.add(lblVelocidad);
                
                JLabel lblArma = new JLabel("Arma:");
		lblArma.setFont(new Font("Springtime Sunshine", Font.BOLD, 18));
                lblArma.setForeground(java.awt.Color.white);
		lblArma.setBounds(30, 150, 75, 26);
		contentPane.add(lblArma);
                
		JLabel Especialidadreal = new JLabel("");
		Especialidadreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Especialidadreal.setForeground(java.awt.Color.white);
		Especialidadreal.setBounds(130, 30, 142, 26);
		contentPane.add(Especialidadreal);
		
		JLabel Vidareal = new JLabel("");
		Vidareal.setFont(new Font("Brodway", Font.BOLD, 18));
                Vidareal.setForeground(java.awt.Color.white);
		Vidareal.setBounds(130, 50, 142, 26);
		contentPane.add(Vidareal);
		
		JLabel Escudoreal = new JLabel("");
		Escudoreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Escudoreal.setForeground(java.awt.Color.white);
		Escudoreal.setBounds(130, 70, 142, 26);
		contentPane.add(Escudoreal);
		
		JLabel Ataquereal = new JLabel("");
		Ataquereal.setFont(new Font("Brodway", Font.BOLD, 18));
                Ataquereal.setForeground(java.awt.Color.white);
		Ataquereal.setBounds(130, 90, 142, 26);
		contentPane.add(Ataquereal);
		
                JLabel Velocidadreal = new JLabel("");
		Velocidadreal.setFont(new Font("Brodway", Font.BOLD, 18));
                Velocidadreal.setForeground(java.awt.Color.white);
		Velocidadreal.setBounds(130, 110, 142, 26);
		contentPane.add(Velocidadreal);
                
                JLabel Armareal = new JLabel("");
		Armareal.setFont(new Font("Brodway", Font.BOLD, 18));
                Armareal.setForeground(java.awt.Color.white);
		Armareal.setBounds(95, 150, 200, 26);
		contentPane.add(Armareal);
                
                JLabel armareal = new JLabel("");
		armareal.setBounds(50, 200, 200, 170);
		contentPane.add(armareal);
                
                JLabel armadurareal = new JLabel("");
		armadurareal.setBounds(430, 90, 250, 349);
		contentPane.add(armadurareal);
                
                fotopersonaje.setIcon(foto);
                Especialidadreal.setText(personaje.Especialidad);
		Vidareal.setText(personaje.Vida);
		Escudoreal.setText(personaje.Escudo);
		Ataquereal.setText(personaje.Ataque);
                Velocidadreal.setText(personaje.Velocidad);
                Armareal.setText(personaje.Arma);
                armareal.setIcon(personaje.arma1);
                armadurareal.setIcon(personaje.armadura);
                        
                JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo3.png")));
		fondo.setBounds(0, 0, 670, 492);
		contentPane.add(fondo);
                
	}

   
    }

  
