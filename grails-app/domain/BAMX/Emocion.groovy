package BAMX

class Emocion {

	String descripcion

	static mapping = {
		id column: "idEmocion", generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
