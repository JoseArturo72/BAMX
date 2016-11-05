package BAMX

class Estado {

	String descripcion

	static hasMany = [administrativo : Administrativo,
	                  alimentose : Alimentos,
	                  boleto : Boleto,
	                  centrodeacopio : Centrodeacopio,
	                  subEstado : SubEstado]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
