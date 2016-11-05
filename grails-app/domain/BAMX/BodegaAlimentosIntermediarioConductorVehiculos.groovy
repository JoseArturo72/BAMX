package BAMX

class BodegaAlimentosIntermediarioConductorVehiculos {

	BodegaHasAlimentos bodegaHasAlimentos
	IntermediarioConductorVehiculos intermediarioConductorVehiculos

	static belongsTo = [bodegaHasAlimentos : BodegaHasAlimentos,
	                    intermediarioConductorVehiculos : IntermediarioConductorVehiculos]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
