package BAMX

class Pelicula {

	String nombre
	String director
	Integer duracion

	static hasMany = [categoriaPelicula : CategoriaPelicula,
	                  funcion : Funcion]

	static mapping = {
		version false
	}

	static constraints = {
		nombre maxSize: 45
		director maxSize: 45
	}
}
