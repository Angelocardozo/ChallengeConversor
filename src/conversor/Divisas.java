package conversor;
//creamos la clase emun con las variables de la moneda con su respectivo valor

public enum Divisas {
	
	DOLLAR(4505.50),
	EUROS(4952.63),
	LIBRAESTERLINAS(5683.69),
	YEN(33.37),
	WON(3.41),
	PESO(1);
	//Atributos de la clase enum
	
	private final double cambio;
	
	Divisas(double cambio){
		this.cambio = cambio;
	}
	//obtenemos el cambio de la moneda
	
	public double getCambio() {
		return cambio;
	}
}
