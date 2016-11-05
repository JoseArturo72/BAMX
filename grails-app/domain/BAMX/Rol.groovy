package BAMX

class Rol {

	String authority

	static hasMany = [usuario : Usuario]

	static mapping = {
		version false
	}

	static constraints = {
		authority unique: true
	}
}
