
public abstract class PersonajeAbstracto {
	
	String Especialidad;
	String Vida;
	String Escudo;
	String Ataque;
        String Velocidad;
        String Clase;
        
	
	abstract void setEspecialidad(String nuevaEspecialidad);
	abstract void setVida(String nuevaVida);
	abstract void setEscudo(String nuevoEscudo);
	abstract void setAtaque(String nuevoAtaque);
        abstract void setVelocidad(String nuevaVelocidad);
        abstract void setClase(String nuevaClase);
        
	
	
	public PersonajeAbstracto(int ref){
		
	}

}
