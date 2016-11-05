package BAMX

class DetallePago {

	String descripcion
	Pago pago

	static belongsTo = [pago : Pago]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 300
	}
}
