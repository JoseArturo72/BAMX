package BAMX

class Sexo {

	Character descripcion

	static hasMany = [cliente : Cliente]

	static mapping = {
		id column: "idSexo", generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 1
	}
}
