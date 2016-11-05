package BAMX

class SubEstado {

	String descripcion
	Estado estado

	static hasMany = [donador : Donador,
	                  voluntario : Voluntario]
	static belongsTo = [estado : Estado]

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
