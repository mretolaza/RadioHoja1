/**
 * 
 */
import java.util.Scanner;
/**
 * Hoja de trabajo no.1 - Simulador de Radio 
 * Javier Ramos, 16339 
 * Maria Mercedes Retolaza, 16339 
 * Diego Fernandez, 16344 
 
 */
public class InterfazCMD {
	
	public static void main(String[] args) {
		MemoryBoton[] memoria = new MemoryBoton[12];
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Radio rad = new Radio();
		boolean keepGoing = true;
		String radioEst = "ON";
		int opcion = 0;
		int casGuard =0;
		int casActi = 0;
		
		System.out.println("--------------------------------------------------");
		System.out.println("|      Radio " + radioEst);
		System.out.println("|      Estacion: " + rad.station);
		System.out.println("|      " + rad.frecuency);
		System.out.println("--------------------------------------------------");
		
		try{
			while (keepGoing == true){
				System.out.println("Elija su opcion (1-6)");
				System.out.println("1. Cambiar ON/OFF");
				System.out.println("2. Cambiar frecuencia");
				System.out.println("3. Cambiar estacion para arriba");
				System.out.println("4. Cambiar estacion para abajo");
				System.out.println("5. Guardar estacion");
				System.out.println("6. Elegir estacion guardada");
				opcion = teclado.nextInt();
				
				if (opcion == 1){
					rad.OnOff();
					if(radioEst.equals("ON"))
						radioEst = "OFF";
					else
						radioEst = "ON";
					
					System.out.println("--------------------------------------------------");
					System.out.println("|      Radio " + radioEst);
					System.out.println("|      Estacion: " + rad.station);
					System.out.println("|      " + rad.frecuency);
					System.out.println("--------------------------------------------------");
				}
				
				else if(radioEst.equals("OFF")){
					System.out.print("Encender radio primero");
				}
				
				else if (opcion == 2){
					rad.changeFrecuency();
					System.out.println("--------------------------------------------------");
					System.out.println("|      Radio " + radioEst);
					System.out.println("|      Estacion: " + rad.station);
					System.out.println("|      " + rad.frecuency);
					System.out.println("--------------------------------------------------");
				}
				
				else if (opcion == 3){
					rad.Forward();
					System.out.println("--------------------------------------------------");
					System.out.println("|      Radio " + radioEst);
					System.out.println("|      Estacion: " + rad.station);
					System.out.println("|      " + rad.frecuency);
					System.out.println("--------------------------------------------------");
				}
				
				else if (opcion == 4){
					rad.Backward();
					System.out.println("--------------------------------------------------");
					System.out.println("|      Radio " + radioEst);
					System.out.println("|      Estacion: " + rad.station);
					System.out.println("|      " + rad.frecuency);
					System.out.println("--------------------------------------------------");
				}
				
				else if (opcion == 5){
					while (casGuard < 1 || casGuard > 12){
						try{
							System.out.println("En cual casilla desea guardar la estacion actual?(1-12)");
							casGuard = teclado.nextInt();
							
							if (rad.frecuency.equals("FM")){
								memoria[casGuard-1] = new MemoryBoton("FM" , rad.getStation());
							} else {
								memoria[casGuard-1] = new MemoryBoton("AM" , rad.getStation());
							}
							
						}catch(Exception e){
							System.out.println("Solo ingresar enteros del 1 al 12");
						}
						
					}
					casGuard = 0;
				}
				
				else if (opcion == 6){
					while (casActi < 1 || casActi > 12){
						try{
							System.out.println("Que casilla con guardado desea activar?");
							casActi = teclado.nextInt();
							memoria[casActi-1].getStation();
							System.out.println("--------------------------------------------------");
							System.out.println("|      Radio");
							System.out.println("|      Estacion: " + memoria[casActi-1].getStation());
							System.out.println("|      " + memoria[casActi-1].getFrecuency());
							System.out.println("--------------------------------------------------");
							
						}catch(Exception e){
							System.out.println("Solo ingresar enteros del 1 al 12 y casillas previamente guardadas");
						}
					}
					casActi = 0;
				}
				
				else{
					System.out.println("Solo utilizar numeros entre las opciones del 1 al 6");
				}
			}
			
		}catch(Exception e){
			System.out.println("Porfavor unicamente utilizar numeros enteros del 1 al 6");
		}
	}

}

