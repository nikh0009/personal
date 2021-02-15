package nikhil.tripathy.personal;

public class PassByValue {
	public static void main(String...strings) {
		Student student = new Student("Steve",90);
		System.out.println("Before change: "+ student);
		change(student);
		System.out.println("After change: "+ student);
	}
	public static void change(Student student) {
		
		student = new Student("TEmp", 67);
		
		student.setName("Name");
	}
}
