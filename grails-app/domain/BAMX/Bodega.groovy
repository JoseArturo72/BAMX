package BAMX

class Bodega {

	String descripcion

	static hasMany = [bodegaHasAlimentose : BodegaHasAlimentos,
	                  bodegaHasCentrodeacopio : BodegaHasCentrodeacopio]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
