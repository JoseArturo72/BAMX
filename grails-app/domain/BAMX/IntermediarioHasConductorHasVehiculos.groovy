package BAMX

class IntermediarioHasConductorHasVehiculos {

	ConductorHasVehiculos conductorHasVehiculos
	Intermediario intermediario

	static belongsTo = [conductorHasVehiculos : ConductorHasVehiculos,
	                    intermediario : Intermediario]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
