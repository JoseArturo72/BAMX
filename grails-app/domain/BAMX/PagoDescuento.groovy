package BAMX

class PagoDescuento {

	Descuento descuento
	Pago pago

	static belongsTo = [descuento : Descuento,
	                    pago : Pago]

	static mapping = {
		version false
	}
}
