package extra;

public class Person {
	private String name;
	private String superpower;
	public Person(){};
	
	public String getName() {
		return name;
	}
	
	public String getSuperpower() {
		return superpower;
	}
	
	public void setName(String rename) {
		this.name = rename;
	}
	
	public void setSuperpower(String power) {
		this.superpower = power;
	}
	
	public String toString() {
		return name + " has mad " + superpower + " skills!";
	}
}
