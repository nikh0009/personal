package nikhil.tripathy.personal;

import java.util.Date;

public final class ImmutableClass {
	
	private final String name;
	private final String phone;
	private final Date dob;
	
	public ImmutableClass(String name, String phone, Date dob) {
		this.dob = dob;
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	//returning a copy of mutable object
	public Date getDob() {
		return (Date) dob.clone();
	}
	
}
