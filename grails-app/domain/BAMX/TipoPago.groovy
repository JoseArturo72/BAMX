package BAMX

class TipoPago {

	String descripcion

	static hasMany = [pago : Pago]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
