package BAMX

class CategoriaPelicula {

	Categoria categoria
	Pelicula pelicula

	static belongsTo = [categoria : Categoria,
	                    pelicula : Pelicula]

	static mapping = {
		version false
	}
}
