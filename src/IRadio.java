
//Javier Ramos , 16230
//María Mercedes Retolaza , 16339 
//Diego Fernandez, 16344 
public interface IRadio {
	
	public void OnOff(); 
	public boolean IsOn(); 
	public String ObtenerFrecuencia(); 
	public void AmaFM(); 
	public void adelante(); 
	public void atras(); 
	public void SetMemory(int Posicion); 
	public String ToString(); 
	public boolean limite(float emisora); 
	
	
	
	
	public default float[] setEmisora(float[] emisoras, int index, float emisora){
		emisoras[index] = emisora;
		return emisoras;
	}
	
	public default float getEmisora(float[] emisoras, int index){
		float emisora = emisoras[index];
		return emisora;
		
	}

}


