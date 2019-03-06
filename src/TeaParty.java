import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
		 String honorific;
		 if (isKnighted) {
			if (isWoman) {
				honorific = "Lady";
			} else {
				honorific = "Sir";
			}
		 } else {
			if (isWoman) {
				honorific = "Ms.";
			} else {
				honorific = "Mr.";
			}
		 }
		 return "Hello " + honorific + " " + name;
	 }
	 
	 @Test
     public void test() {
             TeaParty teaParty = new TeaParty();
             String greeting = teaParty.welcome(null, false, false);
             assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
             assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
             assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
     }
}
