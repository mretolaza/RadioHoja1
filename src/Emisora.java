
public class Emisora {
	//Atributos
	private String nombre; 
	private boolean FMaAM; 
	private float   nEstacion;
	
	//Constructor 
	public Emisora() {
		this.nombre = "nombre";
		this.FMaAM = true;
		this.nEstacion = (float)87.1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFMaAM() {
		return FMaAM;
	}

	public void setFMaAM(boolean fMaAM) {
		FMaAM = fMaAM;
	}

	public float getnEstacion() {
		return nEstacion;
	}

	public void setnEstacion(float nEstacion) {
		this.nEstacion = nEstacion;
	} 
	
	
	
	

}
