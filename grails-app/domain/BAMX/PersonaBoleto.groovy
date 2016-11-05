package BAMX

class PersonaBoleto {

	Boleto boleto
	Persona persona

	static belongsTo = [boleto : Boleto,
	                    persona : Persona]

	static mapping = {
		version false
	}
}
