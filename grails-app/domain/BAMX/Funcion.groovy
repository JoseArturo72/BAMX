package BAMX

class Funcion {

	Date horario
	Pelicula pelicula
	Sala sala
	TipoFuncion tipoFuncion

	static hasMany = [boleto : Boleto]
	static belongsTo = [pelicula : Pelicula,
	                    sala : Sala,
	                    tipoFuncion : TipoFuncion]

	static mapping = {
		version false
	}
}
