
public class Guerrero extends PersonajeAbstracto {
	
	
	
	public Guerrero(int ref) {
		super(ref);
		
		if(ref==1){
			setEspecialidad("Guerero");
			setVida("1300");
			setEscudo("180");
			setAtaque("110");
                        setVelocidad("420");
                        setClase("Guerrero");
                        
                        
		}
		
		if(ref==2){
			setEspecialidad("Caballero");
			setVida("1150");
			setEscudo("150");
			setAtaque("180");
                        setVelocidad("430");
			setClase("Guerrero");
			
		}
		if(ref==3){
			setEspecialidad("Templario");
			setVida("1500");
			setEscudo("240");
			setAtaque("85");
                        setVelocidad("400");
			setClase("Guerrero");
		}
		if(ref==4){
			setEspecialidad("Mago");
			setVida("1400");
			setEscudo("150");
			setAtaque("200");
                        setVelocidad("410");
			setClase("Guerrero");
		}
		if(ref==5){
			setEspecialidad("Arquero");
			setVida("1000");
			setEscudo("100");
			setAtaque("230");
                        setVelocidad("450");
			setClase("Guerrero");
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

