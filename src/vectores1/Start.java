package vectores1;

public class Start {

	public static void main(String[] args) {

		MiVector vector = new MiVector(10);
		
		System.out.println(vector.add(11));
		System.out.println(vector.add(9));
		System.out.println(vector.add(7));
		System.out.println(vector.add(0));
		System.out.println(vector.add(15));
		
		System.out.println(vector);

	}

}
