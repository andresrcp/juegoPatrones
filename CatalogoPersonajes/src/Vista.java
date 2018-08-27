import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Vista extends JFrame {

	private JPanel contentPane;

	public Vista(PersonajeAbstracto personaje,ImageIcon foto) {

		setBounds(100, 100, 915, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fotopersonaje = new JLabel("");
		fotopersonaje.setBounds(35, 37, 531, 349);
		contentPane.add(fotopersonaje);
                
                
                
                
		
		JLabel lblEspecialidad = new JLabel("Tipo:");
		lblEspecialidad.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		lblEspecialidad.setBounds(599, 36, 75, 26);
		contentPane.add(lblEspecialidad);
		
		JLabel lblVida = new JLabel("Vida:");
		lblVida.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		lblVida.setBounds(599, 56, 75, 26);
		contentPane.add(lblVida);
		
		JLabel lblEscudo = new JLabel("Escudo:");
		lblEscudo.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		lblEscudo.setBounds(599, 76, 75, 26);
		contentPane.add(lblEscudo);
		
		JLabel lblAtaque = new JLabel("Ataque:");
		lblAtaque.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		lblAtaque.setBounds(599, 96, 75, 26);
		contentPane.add(lblAtaque);
		
                JLabel lblVelocidad = new JLabel("Vel. Mov:");
		lblVelocidad.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		lblVelocidad.setBounds(599, 116, 75, 26);
		contentPane.add(lblVelocidad);
                
		JLabel Especialidadreal = new JLabel("");
		Especialidadreal.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		Especialidadreal.setBounds(715, 36, 142, 26);
		contentPane.add(Especialidadreal);
		
		JLabel Vidareal = new JLabel("");
		Vidareal.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		Vidareal.setBounds(715, 56, 142, 26);
		contentPane.add(Vidareal);
		
		JLabel Escudoreal = new JLabel("");
		Escudoreal.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		Escudoreal.setBounds(715, 76, 142, 26);
		contentPane.add(Escudoreal);
		
		JLabel Ataquereal = new JLabel("");
		Ataquereal.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		Ataquereal.setBounds(715, 96, 142, 26);
		contentPane.add(Ataquereal);
		
                JLabel Velocidadreal = new JLabel("");
		Velocidadreal.setFont(new Font("Springtime Sunshine", Font.PLAIN, 18));
		Velocidadreal.setBounds(715, 116, 142, 26);
		contentPane.add(Velocidadreal);
                
                
		
		fotopersonaje.setIcon(foto);
		
		Especialidadreal.setText(personaje.Especialidad);
		Vidareal.setText(personaje.Vida);
		Escudoreal.setText(personaje.Escudo);
		Ataquereal.setText(personaje.Ataque);
                Velocidadreal.setText(personaje.Velocidad);
                
	}

}
