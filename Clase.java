 abstract class Clase{
	private int nivel = 1;
	private int vida;
	private int ataque;
	private int defensa;
	private int suerte;
	private int celeridad;
	private int intelecto;
	private String rol;
	private String nombreClase;

	public int getNivel(){
		return nivel;
	}
	public void setNivel(int nivelVal){
		this.nivel = nivelVal;
	}

	public int getVida(){
		return vida;
	}
	public void setVida(int vidaVal){
		this.vida = vidaVal;
	}

	public int getAtaque(){
		return ataque;
	}
	public void setAtaque(int ataqueVal){
		this.ataque = ataqueVal;
	}

	public int getDefensa(){
		return defensa;
	}
	public void setDefensa(int defensaVal){
		this.defensa = defensaVal;
	}

	public int getSuerte(){
		return suerte;
	}
	public void setSuerte(int suerteVal){
		this.suerte = suerteVal;
	}

	public int getCeleridad(){
		return celeridad;
	}
	public void setCeleridad(int celeridadVal){
		this.celeridad = celeridadVal;
	}

	public int getIntelecto(){
		return intelecto;
	}
	public void setIntelecto(int intelectoVal){
		this.intelecto = intelectoVal;
	}

	public String getRol(){
		return rol;
	}
	public void setRol(String rolVal){
		this.rol = rolVal;
	}

	public String getNombreClase(){
		return nombreClase;
	}
	public void setNombreClase(String nombreClaseVal){
		this.nombreClase = nombreClaseVal;
	}

	public void Guerrero(){
		/*setVida(100);
		setAtaque(25);
		setDefensa(30);
		setSuerte(15);
		setCeleridad(35);
		setIntelecto(20);
		setNombreClase("Guerrero");*/
	}
}

