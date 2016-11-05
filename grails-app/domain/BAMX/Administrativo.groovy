package BAMX

class Administrativo {

	Long descripcion
	Cargo cargo
	Estado estado
	Persona persona

	static belongsTo = [cargo : Cargo,
	                    estado : Estado,
	                    persona : Persona]

	static mapping = {
		id generator: "assigned"
		version false
	}
}
