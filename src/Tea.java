
public class Tea {
	public static void main(String[] args) {
		TeaBag sip = new TeaBag(TeaBag.PASSION_FRUIT);
		Kettle liquid = new Kettle();
		liquid.getWater();
		liquid.boil();
		Cup gulp = new Cup();
		gulp.makeTea(sip, liquid.getWater());
	}
}
