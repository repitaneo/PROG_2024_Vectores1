package vectores1;

import java.util.Arrays;

public class MiVector {

	private int vector[];
	private int cuantosHay;
	
	
	public MiVector(int longitud) {
		
		vector = new int[longitud];
		cuantosHay = 0;
	}


	
	@Override
	public String toString() {
		return "MiVector " + Arrays.toString(vector) + "\ncuantosHay=" + cuantosHay;
	}
	
	
	
	
	
	
}
