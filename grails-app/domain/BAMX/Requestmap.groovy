package BAMX

class Requestmap {

	String configAttribute
	String httpMethod
	String url

	static mapping = {
		version false
	}

	static constraints = {
		httpMethod nullable: true
		url unique: ["http_method"]
	}
}
