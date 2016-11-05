package BAMX

class ConductorHasVehiculos {

	Conductor conductor
	Vehiculos vehiculos

	static hasMany = [intermediarioConductorVehiculose : IntermediarioConductorVehiculos,
	                  intermediarioHasConductorHasVehiculose : IntermediarioHasConductorHasVehiculos]
	static belongsTo = [conductor : Conductor,
	                    vehiculos : Vehiculos]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
