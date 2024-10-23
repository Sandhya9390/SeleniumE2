package stringstypes;
public class students {
	public students(String name, int id, double fees, char gender) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
		this.gender = gender;
	}
	String name;
	int id;
	double fees;
	char gender;
	@Override
	public String toString() {
		return "students [name=" + name + ", id=" + id + ", fees=" + fees + ", gender=" + gender + "]";
	}
   @Override
	public boolean equals(Object o){
		students res=(students)o;
		return this.fees==fees&&this.gender==res.gender;
	}
	@Override
	public int hashCode() {
		return (int)(fees+gender);
	}
}
		
	
	
		
	
	
	


