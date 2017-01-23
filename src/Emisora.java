
//Javier Ramos , 16230
//María Mercedes Retolaza , 16339 
//Diego Fernandez, 16344 

public class Emisora {
	//Atributos
	
	private String nombre; 
	private boolean FMaAM;
	private boolean IsOn; 
	private float   nEstacion;
	private String  frecuencia; 
	
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
	
	//public void CambiarFrecuencia(){
		
		//if (frecuencia == "AM")
			//frecuencia = "FM"
			//else 
				//frecuencia ="AM"
		
	//}
	
	//public void limite () { 
		//if (frecuencia=="AM")
		
			
	}

