package nikhil.tripathy.personal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Country implements Externalizable {
	
	private static final long serialVersionUID = 1L;
	private int code;
	private String name;
	
	public Country(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public Country() {
		super();
	}
	
	//getter and setter can be done
	
	public void setCode (int code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(code);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		this.name = in.readUTF();
		this.code = in.readInt();
	}
	
	@Override
	public String toString() {
		return String.format("Country info name=%s, code=%s", name, code);
	}

}
