package BAMX

class IntermediarioConductorVehiculos {

	ConductorHasVehiculos conductorHasVehiculos
	Intermediario intermediario

	static hasMany = [bodegaAlimentosIntermediarioConductorVehiculose : BodegaAlimentosIntermediarioConductorVehiculos]
	static belongsTo = [conductorHasVehiculos : ConductorHasVehiculos,
	                    intermediario : Intermediario]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
