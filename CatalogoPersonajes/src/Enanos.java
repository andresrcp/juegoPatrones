public class Enanos extends PersonajeAbstracto {
	
	
	
	public Enanos(int ref) {
		super(ref);
		
		if(ref==1){
			setEspecialidad("Sacerdote");
			setVida("950");
			setEscudo("130");
			setAtaque("140");
                        setVelocidad("460");
                        setClase("Enanos");
		}
		
		if(ref==2){
			setEspecialidad("Paladin");
			setVida("1150");
			setEscudo("140");
			setAtaque("150");
                        setVelocidad("410");
			 setClase("Enanos");
			
		}
		if(ref==3){
			setEspecialidad("Ballestero");
			setVida("1200");
			setEscudo("135");
			setAtaque("155");
                        setVelocidad("420");
                        setClase("Enanos");
			
		}
		if(ref==4){
			setEspecialidad("Elementalista");
			setVida("1250");
			setEscudo("145");
			setAtaque("145");
                        setVelocidad("425");
                        setClase("Enanos");
		}
                
                if(ref==5){
			setEspecialidad("Alquimista");
			setVida("1250");
			setEscudo("145");
			setAtaque("145");
                        setVelocidad("425");
                        setClase("Enanos");
		}
	
		
	}
	
	@Override
	void setEspecialidad(String nuevaEspecialidad) {
		Especialidad=nuevaEspecialidad;
		
	}

	@Override
	void setVida(String nuevaVida) {
		Vida=nuevaVida;
		
	}

	@Override
	void setEscudo(String nuevoEscudo) {
		Escudo=nuevoEscudo;
		
	}

	@Override
	void setAtaque(String nuevoAtaque) {
		Ataque=nuevoAtaque;
		
	}
	
        @Override
	void setVelocidad(String nuevoVelocidad) {
		Velocidad=nuevoVelocidad;
		
	}
	
        @Override
	void setClase(String nuevaClase) {
		Clase=nuevaClase;
		
	}

}
