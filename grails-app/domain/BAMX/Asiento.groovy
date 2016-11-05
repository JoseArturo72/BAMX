package BAMX

class Asiento {

	String descripcion
	Sala sala

	static hasMany = [boleto : Boleto]
	static belongsTo = [sala : Sala]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
