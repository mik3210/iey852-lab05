package application.model;

public class Dinosaur {

	private String name;
	private String type;
	private String carnivore;
	
	public Dinosaur(String name, String type, String carnivore) {
		super();
		this.name = name;
		this.type = type;
		this.carnivore = carnivore;
	}//end of constructor
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarnivore() {
		return carnivore;
	}
	public void setCarnivore(String carnivore) {
		this.carnivore = carnivore;
	}
	@Override
	public String toString() {
		return "Dinosaur [name=" + name + ", type=" + type + ", carnivore=" + carnivore + "]";
	}
	
	
}
