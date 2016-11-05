package BAMX

class Boleto {

	Date fecha
	Double costoTotal
	Asiento asiento
	Estado estado
	Funcion funcion

	static hasMany = [pago : Pago,
	                  personaBoleto : PersonaBoleto]
	static belongsTo = [asiento : Asiento,
	                    estado : Estado,
	                    funcion : Funcion]

	static mapping = {
		version false
	}
}
