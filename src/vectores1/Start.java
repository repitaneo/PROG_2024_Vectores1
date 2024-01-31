package vectores1;

public class Start {

	public static void main(String[] args) {

		MiVector vector = new MiVector(10);
		
		vector.add(4);
		vector.add(6);
		vector.add(7);
		vector.add(2);
		vector.add(14);
		vector.add(-1);
		vector.add(-2);
		
		System.out.println(vector);
		
		System.out.println("borrando________________");
		vector.del(-2);
		System.out.println(vector);

	}

}
