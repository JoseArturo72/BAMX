package BAMX

class Etapas {

	String descripcion

	static hasMany = [beneficiario : Beneficiario]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
