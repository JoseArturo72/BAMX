package BAMX

class Beneficiario {

	String descripcion
	Etapas etapas
	Persona persona

	static belongsTo = [etapas : Etapas,
	                    persona : Persona]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
