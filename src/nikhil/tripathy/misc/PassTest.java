package nikhil.tripathy.misc;

public class PassTest {
	
	public static void main (String... args) {
		Person someone = new Person("Someone");
		changeName(someone);
		System.out.println(someone.getName());
		newObject(someone);
		System.out.println(someone.getName());
	}

	public static void changeName(Person person) {
		person.setName("nobody");
	}
	
	public static void newObject(Person person) {
		person = new Person("heller");
	}
}
