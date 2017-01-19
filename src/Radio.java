/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.String;
/**
 *
 * @author OscarIvan
 */
public class Radio implements IRadio {

    boolean isOn; 
    String frecuency;
    String station; 
    MemoryBoton[] Memorias;
    int n;
    
    public Radio(int n){
    	isOn = false; 
        frecuency = "AM";
        station = "53"; 
        this.n = n;
    }
    
	@Override
	public void OnOff() {
		// TODO Auto-generated method stub
		isOn = !isOn;
	}
	@Override
	public boolean IsOn() {
		// TODO Auto-generated method stub
		if (isOn){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String ObtenerFrecuencia() {
		// TODO Auto-generated method stub
		return frecuency;
	}
	@Override
	public void AmaFM() {
		// TODO Auto-generated method stub
		if (frecuency.equals("AM")){
			frecuency.isEmpty();
			frecuency += "FM";
		} else if (frecuency.equals("FM")){
			frecuency.isEmpty();
			frecuency += "AM";
		} else {
			System.out.println("Ninguna de las dos");
		}
	}
	@Override
	public void adelante() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atras() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SetMemory(int Posicion) {
		// TODO Auto-generated method stub
		if (Posicion > 0 && Posicion < n){
			Memorias[Posicion] = new MemoryBoton(frecuency, station);
		}
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        sb.append("isON:");
        sb.append(isOn);
        sb.append(" Frecuency:");
        sb.append(frecuency);
        sb.append(" Station:");
        sb.append(station);
        
        return sb.toString();
	}
	@Override
	public boolean limite(float emisora) {
		boolean flag = false;
		if (frecuency.equals("AM")) {
			if (Integer.parseInt(station)*10 > 1610){
				flag = true;
			}
		} else if (frecuency.equals("FM")){
			if (Float.parseFloat(station)/(float)10 > 107.9){
				flag = true;
			}
		}
		return flag;
	} 
    
}