package BAMX

class Cargo {

	String descripcion

	static hasMany = [administrativo : Administrativo]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
