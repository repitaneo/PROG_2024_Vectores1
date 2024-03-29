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
		
		String devolver = "MiVector [";
		
		for(int i=0;i<cuantosHay-1;i++) {
			devolver += datos[i]+", ";
		}
		devolver += datos[cuantosHay-1]+"]";
				
		devolver+="\ncuantosHay=" + cuantosHay;
		
		return devolver;
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
	
	
	
	
	
	public int del(int numero) {
		
		int posicion = buscar(numero);
		
		System.out.println("encontrado el "+numero+" en "+posicion);
		if (posicion!=-1) {
			
			// miro si muevo y tengo numeros a la derecha
			if(posicion<cuantosHay-1) {
				
				for(int i=0;i<cuantosHay-1-posicion;i++) {
					
					datos[posicion+i] = datos[posicion+1+i];
				}
			}
			cuantosHay--;
		}
		return posicion;
	}



	
	
	private int buscar(int numero) {
	
		int devolver = -1;
		
		int i=0;
		boolean encontrado = false;
		while((i<cuantosHay)&&(!encontrado)) {
			
			if(datos[i]==numero) {
				
				encontrado=true;
				devolver = i;
			}
			i++;
		}
		return devolver;
	}
	
	
	
	
	
}
