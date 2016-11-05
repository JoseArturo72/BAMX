package BAMX

class Vehiculos {

	String descripcion

	static hasMany = [conductorHasVehiculose : ConductorHasVehiculos]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
