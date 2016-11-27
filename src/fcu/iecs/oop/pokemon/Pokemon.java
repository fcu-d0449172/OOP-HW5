package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	
	public Pokemon(String name, int cp) {
		this.name = name;
		this.cp = cp;
	}
	
	public String getName() {
		return this.name;
	}
	public int getCp() {
		return this.cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
}