package BAMX

class TipoSala {

	String descripcion

	static hasMany = [sala : Sala,
	                  temporadaTipoSala : TemporadaTipoSala]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
