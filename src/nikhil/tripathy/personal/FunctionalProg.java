package nikhil.tripathy.personal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProg {
	public static void main(String...strings) {
		
		Country c1 = new Country(1,"India");
		Country c2 = new Country(5,"US");
		Country c3 = new Country(10,"Japan");
		Country c4 = new Country(123,"Korea");
		
		List<Country> countrylist = Arrays.asList(c1,c2,c3,c4);
		
		List<Country > filtered = countrylist.stream()
									.filter(count -> count.getCode() > 5)
									.collect(Collectors.toList());
		System.out.println(filtered);
		
	}
	
}
