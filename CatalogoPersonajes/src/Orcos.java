public class Orcos extends PersonajeAbstracto {

	public Orcos(int ref) {
		super(ref);
		
		if(ref==1){
			setEspecialidad("Barbaro");
			setVida("950");
			setEscudo("100");
			setAtaque("230");
                        setVelocidad("440");
                        setClase("Orcos");
		}
		
		if(ref==2){
			setEspecialidad("Cazador");
			setVida("1000");
			setEscudo("85");
			setAtaque("220");
                        setVelocidad("430");
                        setClase("Orcos");
			
			
		}
		if(ref==3){
			setEspecialidad("Asesino");
			setVida("1050");
			setEscudo("80");
			setAtaque("300");
                        setVelocidad("435");
                        setClase("Orcos");
			
		}
                
                if(ref==4){
			setEspecialidad("Brujo");
			setVida("1050");
			setEscudo("80");
			setAtaque("300");
                        setVelocidad("435");
                        setClase("Orcos");
			
		}
                
                if(ref==5){
			setEspecialidad("Chaman");
			setVida("1050");
			setEscudo("80");
			setAtaque("300");
                        setVelocidad("435");
                        setClase("Orcos");
			
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
