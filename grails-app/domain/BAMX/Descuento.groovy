package BAMX

class Descuento {

	String descripcion
	Double porcentaje
	Date fechaInicio
	Date fechaFin
	Boolean estado

	static hasMany = [pagoDescuento : PagoDescuento]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 50
		estado nullable: true
	}
}
