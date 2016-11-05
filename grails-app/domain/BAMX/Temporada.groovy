package BAMX

class Temporada {

	String descripcion
	Date fechaInicio
	Date fechaFin

	static hasMany = [diasInhabilese : DiasInhabiles,
	                  temporadaTipoFuncion : TemporadaTipoFuncion,
	                  temporadaTipoSala : TemporadaTipoSala]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
