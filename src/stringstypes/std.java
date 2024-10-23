package stringstypes;

import java.util.Objects;

public class std {
	String name;
	int id;
	public std(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "std [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		std other = (std) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}	


