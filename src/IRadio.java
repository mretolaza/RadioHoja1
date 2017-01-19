
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
	
	public default boolean status (boolean on){
		on = !on;
		return on;
	}
	
	public default boolean frecuencia (boolean f){
		f = !f;
		return f;
	}
	
	public default boolean limite (float emisora){
		boolean flag = true;
		if (emisora <= 107.9){
			flag = false;
		}
		return flag;
	}
	
	public default float[] setEmisora(float[] emisoras, int index, float emisora){
		emisoras[index] = emisora;
		return emisoras;
	}
	
	public default float getEmisora(float[] emisoras, int index){
		float emisora = emisoras[index];
		return emisora;
		
	}

}


