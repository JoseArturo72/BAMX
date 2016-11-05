package BAMX

class Sala {

	String numeroSala
	Integer ancho
	Integer alto
	TipoSala tipoSala

	static hasMany = [asiento : Asiento,
	                  funcion : Funcion]
	static belongsTo = [tipoSala : TipoSala]

	static mapping = {
		version false
	}

	static constraints = {
		numeroSala maxSize: 45
	}
}
