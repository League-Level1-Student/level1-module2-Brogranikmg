package extra;

public class Taco {
	private String m_e_a_t = "rat legs";
	private String s_a_u_c_e = "worm blood";
	public Taco(){};
	
	public String getMeat() {
		return m_e_a_t;
	}
	
	public String getSauce() {
		return s_a_u_c_e;
	}
	
	public void setMeat(String meat) {
		this.m_e_a_t = meat;
	}
	
	public void setSauce(String sauce) {
		this.s_a_u_c_e = sauce;
	}
}
