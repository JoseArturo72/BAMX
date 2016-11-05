package BAMX

class Voluntario {

	String descripcion
	Integer nivel
	Persona persona
	SubEstado subEstado

	static hasMany = [conductor : Conductor]
	static belongsTo = [persona : Persona,
	                    subEstado : SubEstado]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
