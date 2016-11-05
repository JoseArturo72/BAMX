package BAMX

class Pago {

	Date fechaPago
	Boleto boleto
	TipoPago tipoPago

	static hasMany = [detallePago : DetallePago,
	                  pagoDescuento : PagoDescuento]
	static belongsTo = [boleto : Boleto,
	                    tipoPago : TipoPago]

	static mapping = {
		version false
	}
}
