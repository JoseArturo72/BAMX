package BAMX

class Centrodeacopio {

	String descripcion
	String direccion
	Estado estado

	static hasMany = [bodegaHasCentrodeacopio : BodegaHasCentrodeacopio]
	static belongsTo = [estado : Estado]

	static mapping = {
		id column: "bigint(20)", generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
		direccion maxSize: 45
	}
}
