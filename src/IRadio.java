
public interface IRadio {
	
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


