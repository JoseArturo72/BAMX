package BAMX

class DiasInhabiles {

	String descripcion
	Temporada temporada

	static belongsTo = [temporada : Temporada]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
