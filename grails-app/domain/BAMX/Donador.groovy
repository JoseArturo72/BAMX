package BAMX

class Donador {

	String descripcion
	Persona persona
	SubEstado subEstado

	static belongsTo = [persona : Persona,
	                    subEstado : SubEstado]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
