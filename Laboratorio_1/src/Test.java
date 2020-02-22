import avion.Avioneta;
import avion.Jet;
import carro.Carro;
import carro.Sedan;
import carro.Suv;

public class Test {
	private void ejecutarCarro() {
		//Carro c=new Suv();
				//c.tipo();
				Carro s=new Sedan();
				s.imprimir();
				
				s=new Suv();
				s.imprimir();
	}
	
	private static void ejecutarAvion() {
		Aeropuerto aero=new Aeropuerto(new Jet());
		aero.takingOff();
		
		aero=new Aeropuerto(new Avioneta());
		aero.takingOff();
	}
	
	public static void main(String[] args) {
		ejecutarAvion();
	}
}

//principio de diseño OPEN-CLOSE
//OPEN: ABIERTO PARA EXTENCIÓN
//CLOSE: CERRADO PARA MODIFICACIÓN