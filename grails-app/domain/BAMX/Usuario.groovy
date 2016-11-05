package BAMX

class Usuario {

	Boolean accountExpired
	Boolean accountLocked
	Boolean enabled
	String password
	Boolean passwordExpired
	String username
	Persona persona

	static hasMany = [rol : Rol]
	static belongsTo = [persona : Persona]

	static mapping = {
		version false
	}

	static constraints = {
		username unique: true
	}
}
