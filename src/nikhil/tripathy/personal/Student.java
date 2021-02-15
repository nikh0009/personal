package nikhil.tripathy.personal;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {
	
	private String name;
	private int age ;
	private List<String> certifications = new ArrayList<String>();
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void addCertification(String certs) {
		certifications.add(certs);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public List<String> getCertifications() {
		return certifications;
	}
	
	@Override
	protected Student clone() {
		Student clone = null;
		try {
			clone = (Student) super.clone();
			//Deep copy
			clone.certifications = new ArrayList(certifications);
		}
		catch (CloneNotSupportedException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return clone;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d, Certifications= %s", this.name, this.age, certifications.toString());
	}
}
