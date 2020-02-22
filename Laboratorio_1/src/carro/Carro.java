package carro;

public abstract class Carro {
	public abstract String tipo();
	
	public final void imprimir() {
		System.out.println("SOY UN TIPO DE CARRO = " + tipo());
	}
}
