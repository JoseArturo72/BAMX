package BAMX

class BodegaHasAlimentos {

	Alimentos alimentos
	Bodega bodega

	static hasMany = [bodegaAlimentosIntermediarioConductorVehiculose : BodegaAlimentosIntermediarioConductorVehiculos]
	static belongsTo = [alimentos : Alimentos,
	                    bodega : Bodega]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
