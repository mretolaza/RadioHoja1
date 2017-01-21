
/*
 * Hoja de trabajo no.1 - Simulador de Radio 
 * María Mercedes Retolaza, 16339 
 
 
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
    
	@Override
	public void Hold() {
		// TODO Auto-generated method stub
		
	}
    
}
