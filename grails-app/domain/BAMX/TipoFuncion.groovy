package BAMX

class TipoFuncion {

	String descripcion

	static hasMany = [funcion : Funcion,
	                  temporadaTipoFuncion : TemporadaTipoFuncion]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
