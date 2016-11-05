package BAMX

class TipoComida {

	String descripcion

	static hasMany = [alimentose : Alimentos]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
