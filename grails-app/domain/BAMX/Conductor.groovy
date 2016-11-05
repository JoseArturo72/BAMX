package BAMX

class Conductor {

	String descripcion
	Voluntario voluntario

	static hasMany = [conductorHasVehiculose : ConductorHasVehiculos]
	static belongsTo = [voluntario : Voluntario]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
