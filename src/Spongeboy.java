
public class Spongeboy {
	public static void main(String[] args) {
		SeaCreature spongeboy = new SeaCreature("spongebob");
		spongeboy.eat();
		spongeboy.laugh();
		SeaCreature partick = new SeaCreature("patrick");
		partick.eat();
		System.out.println(partick.getName());
		partick.laugh();
		SeaCreature octopus = new SeaCreature("squidward");
		octopus.eat();
		System.out.println(octopus.getName());
		octopus.laugh();
	}
}
