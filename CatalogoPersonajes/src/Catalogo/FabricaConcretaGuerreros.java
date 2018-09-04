package Catalogo;




public class FabricaConcretaGuerreros extends FabricaAbstractaPersonaje {



	@Override
	PersonajeAbstracto getPersonaje(int ref) {
		return new Humanos(ref);
	
	}

}
