package BAMX

class Intermediario {

	String descripcion

	static hasMany = [intermediarioConductorVehiculose : IntermediarioConductorVehiculos,
	                  intermediarioHasConductorHasVehiculose : IntermediarioHasConductorHasVehiculos]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
