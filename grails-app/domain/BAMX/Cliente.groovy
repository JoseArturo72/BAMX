package BAMX

class Cliente {

	String nombre
	String apellidoUno
	String apellidoDos
	Integer edad
	Sexo sexo

	static belongsTo = [sexo : Sexo]

	static mapping = {
		version false
	}

	static constraints = {
		nombre maxSize: 45
		apellidoUno maxSize: 45
		apellidoDos nullable: true, maxSize: 45
	}
}
