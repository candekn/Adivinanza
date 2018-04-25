package ar.edu.unlam.pb2;

public class Adivinanza {
	//Atributos
	private Integer respuesta;
	
	//Métodos
	public Adivinanza(Integer respuesta){ 	//Este es el constructor, acá se define el valor
		this.respuesta=respuesta;			//del atributo "respuesta". 
	}										//LOS CONSTRUCTORES NO LLEVAN TIPO DE RETORNO 
	
	public boolean numerosIguales(Integer valor){
		if(valor==this.respuesta){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean valorMayorQueRespuesta(Integer valor){
		if(valor>this.respuesta){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void setRespuesta(Integer respuesta){ 	//Los métodos Setters, sirven para cambiar el valor 
		this.respuesta=respuesta;					//de algún atributo (privado) sin romper el encapsulamiento.
	}												//Es decir, sin cambiar el "private" por "public"
	
	public Integer getRespuesta(){					//Los métodos Getters, sirven para obtener el valor de algún
		return this.respuesta;						//atributo privado, sin romper el encapsulamiento.
	}

	@Override
	public String toString() {								//Esto dijo el profe que no se toca. Sirve para que, al
		return "Adivinanza [respuesta=" + respuesta + "]";	//imprimir por pantalla un objeto, nos aparezca el
	}														//valor que tiene asignado en vez de la dirección de memoria.
	
	
}
