/*
 * Mamifero.java
 * 
 */

public class Mamifero extends Animal {
	
	private String  habitat;
	private boolean bico;
	
	public Mamifero () {
		super ();
		this.habitat = "Pantanal";
		this.bico = false;
	}
	
	@Override
	public String toString () {
		return "[Nome: " + getNome() + 
		      ", Idade: " + getIdade() + 
		      ", Especie: " + especie + 
		      ", Habitat: " + habitat + 
		      ", " + (bico?"T":"Nao t") + "em bico ]";
	}
}

