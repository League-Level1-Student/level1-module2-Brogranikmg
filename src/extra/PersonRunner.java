package extra;

public class PersonRunner {
	public static void main(String[] args) {
		Person noah = new Person();
		noah.setName("Noah M. Lastname");
		noah.setSuperpower("singing");
		Person wormguys = new Person();
		wormguys.setName("The Worm Guys");
		wormguys.setSuperpower("being worms");
		Person rowan = new Person();
		rowan.setName("Rowan Alec St. Actuali Awsum");
		rowan.setSuperpower("no one knows");
		Person max = new Person();
		max.setName("Max McJeannason");
		max.setSuperpower("controlling clouds");
		System.out.println(noah);
		System.out.println(wormguys);
		System.out.println(rowan);
		System.out.println(max);
	}
}