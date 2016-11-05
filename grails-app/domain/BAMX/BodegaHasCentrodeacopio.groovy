package BAMX

class BodegaHasCentrodeacopio {

	Bodega bodega
	Centrodeacopio centrodeacopio

	static belongsTo = [bodega : Bodega,
	                    centrodeacopio : Centrodeacopio]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
