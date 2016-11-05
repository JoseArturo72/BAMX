package BAMX

class Categoria {

	String descripcion

	static hasMany = [categoriaPelicula : CategoriaPelicula]

	static mapping = {
		version false
	}

	static constraints = {
		descripcion maxSize: 45
	}
}
