/*
 * Animal.java
 * 
 */

public class Animal {
	
	private   String nome;
	private   int    idade;
	protected String especie;
	
	public Animal () {
		setAnimal ();
	}
	
	public Animal ( String nome ) {
		setAnimal ();
		setNome ( nome );
	}
	
	public Animal ( String nome, int idade ) {
		setAnimal ();
		setNome ( nome );
		setIdade ( idade );
	}
	
	public Animal ( String nome, int idade, String especie ) {
		setAnimal ();
		setNome ( nome );
		setIdade ( idade );
		setEspecie ( especie );
	}
	
	private void setAnimal () {
		this.nome    = "Toto";
		this.idade   = 5;
		this.especie = "cachorro";		
	}
	
	public void setNome ( String nome ) {
		if ( ! nome.isEmpty() ) {
			this.nome = nome;
		}
	}
	
	public void setIdade ( int idade ) {
		if ( idade >= 0 ) {
			this.idade = idade;
		}
	}
	
	public void setEspecie ( String especie ) {
		this.especie = especie;
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getIdade () {
		return idade;
	}
	
	public String getEspecie () {
		return especie;
	}
	
	@Override
	public String toString () {
		return "[Nome: " + nome + 
		      ", Idade: " + idade + 
		      ", Especie: " + especie + "]";
	}
}

