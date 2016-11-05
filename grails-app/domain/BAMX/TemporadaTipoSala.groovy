package BAMX

class TemporadaTipoSala {

	Double costo
	Temporada temporada
	TipoSala tipoSala

	static belongsTo = [temporada : Temporada,
	                    tipoSala : TipoSala]

	static mapping = {
		version false
	}
}
