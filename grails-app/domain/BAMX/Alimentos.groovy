package BAMX

class Alimentos {

	String descripcion
	String fechaCaducidad
	Estado estado
	TipoComida tipoComida

	static hasMany = [bodegaHasAlimentose : BodegaHasAlimentos]
	static belongsTo = [estado : Estado,
	                    tipoComida : TipoComida]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
		fechaCaducidad maxSize: 45
	}
}
