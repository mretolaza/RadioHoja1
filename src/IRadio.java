
/*
 * Hoja de trabajo no.1 - Simulador de Radio 
 * Javier Ramos, 16339 
 * María Mercedes Retolaza, 16339 
 * Diego Fernandez, 16344 
 
 */
public interface IRadio {
	
	    public void OnOff();
	    public boolean isOn();
	    public String getFrecuency();
	    public void changeFrecuency();
	    public String getStation();   
	    public void Forward();
	    public void Backward();
	    public void setMemory(int Position);
	    public String ToString(); 

}



