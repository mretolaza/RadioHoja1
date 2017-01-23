
/*
 * Hoja de trabajo no.1 - Simulador de Radio 
 * Javier Ramos, 16339 
 * Maria Mercedes Retolaza, 16339 
 * Diego Fernandez, 16344 
 
 */

public class MemoryBoton implements iBoton{

    String frecuency;
    String station; 
    
    public MemoryBoton (String frecuency, String station)
    {
        this.frecuency= frecuency;
        this.station = station;
    }
    public String Push() {
        return frecuency.concat("|").concat(station);
    }
    
    public void Hold(String frecuency, String station) {
        this.frecuency = frecuency;
        this.station = station;
    }
    
    public String getFrecuency(){
    	return frecuency;
    }
    
    public String getStation(){
    	return station;
    }
    
	@Override
	public void Hold() {
		// TODO Auto-generated method stub
		
	}
    
}
