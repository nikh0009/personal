package nikhil.tripathy.personal;

public class FormaterTest {
	
	public static void main (String...strings) {
		String url = "http://somerandom.com/tests?block=%s&compid=%s";
		System.out.println(String.format(url, "false","adfdfadfDAFDFADF"));
		
	}

}
