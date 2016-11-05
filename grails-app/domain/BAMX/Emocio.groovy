package BAMX

class Emocio {

	String descripcion

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
