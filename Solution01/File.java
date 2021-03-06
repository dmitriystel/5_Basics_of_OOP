package by.introduction.fifth.OOP1.main;

import java.util.Objects;

public class File {

	private String name;
	
	public File() {		
	}

	public File(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}	
}
