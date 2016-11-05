package BAMX

class Persona {

	String nombre
	String apellidoUno
	String apellidoDos

	static hasMany = [administrativo : Administrativo,
	                  beneficiario : Beneficiario,
	                  donador : Donador,
	                  personaBoleto : PersonaBoleto,
	                  personaTarjeta : PersonaTarjeta,
	                  usuario : Usuario,
	                  voluntario : Voluntario]

	static mapping = {
		version false
	}

	static constraints = {
		nombre maxSize: 45
		apellidoUno maxSize: 45
		apellidoDos nullable: true, maxSize: 45
	}
}
