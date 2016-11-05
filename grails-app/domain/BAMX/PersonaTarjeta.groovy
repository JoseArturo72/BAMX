package BAMX

class PersonaTarjeta {

	Persona persona
	Tarjeta tarjeta

	static belongsTo = [persona : Persona,
	                    tarjeta : Tarjeta]

	static mapping = {
		version false
	}
}
