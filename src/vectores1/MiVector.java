package vectores1;

import java.util.Arrays;

public class MiVector {

	private int datos[];
	private int cuantosHay;
	
	
	public MiVector(int longitud) {
		
		datos = new int[longitud];
		cuantosHay = 0;
	}


	
	@Override
	public String toString() {
		return "MiVector " + Arrays.toString(datos) + "\ncuantosHay=" + cuantosHay;
	}
	
	
	
	public int add(int numero) {
		
		// si caben mas numeros
		if(cuantosHay<datos.length) {
			// coloco donde cuantosHay
			datos[cuantosHay] = numero;
			// añado uno mas al contador de elementos
			cuantosHay++;
			
			// devuelvo la posición en la que entró el último
			return cuantosHay-1;
		}
		return -1;
	}
	
	
	
	
	
	
	
	
}
