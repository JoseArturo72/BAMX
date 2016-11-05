package BAMX

class TemporadaTipoFuncion {

	Double costo
	Temporada temporada
	TipoFuncion tipoFuncion

	static belongsTo = [temporada : Temporada,
	                    tipoFuncion : TipoFuncion]

	static mapping = {
		version false
	}
}
