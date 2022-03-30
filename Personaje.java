import java.util.Scanner;

public class Personaje {
	
	private String genero;
	private String nombrePersonaje;
	private Clase clasePersonaje;

	public void setNombrePersonaje(String thegame){
		this.nombrePersonaje = thegame;
	}
	public String getNombrePersonaje(){
    return this.nombrePersonaje;
  }
	public void asignarRolClase(String tipoClase){
		
	    if (tipoClase.equals("Tanque")){
	    	CreadorTanque tanque = new CreadorTanque();
	    	this.clasePersonaje = tanque.crearClase();
	    }
	
		else if (tipoClase.equals("Soporte")){
			CreadorSoporte soporte = new CreadorSoporte();
			this.clasePersonaje = soporte.crearClase();
		}

		else if (tipoClase.equals("DPS")){
			CreadorDPS dps = new CreadorDPS();
			this.clasePersonaje = dps.crearClase();
		}
	}
}

