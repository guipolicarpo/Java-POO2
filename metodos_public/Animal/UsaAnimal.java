/*
 * UsaAnimal.java
 * 
 */

public class UsaAnimal {
	
	public static void main (String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal("Gigi");
		Animal a3 = new Animal("Matador", 9);
		Animal a4 = new Animal("Bebe", 2, "Dromedario");
		
		System.out.println( "[A1]: " + a1 );
		System.out.println( "[A2]: " + a2 );
		System.out.println( "[A3]: " + a3 );
		System.out.println( "[A4]: " + a4 );
	}
}

