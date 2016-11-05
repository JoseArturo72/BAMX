package BAMX

class Tarjeta {

	String numeroCuenta

	static hasMany = [personaTarjeta : PersonaTarjeta]

	static mapping = {
		version false
	}

	static constraints = {
		numeroCuenta maxSize: 25
	}
}
