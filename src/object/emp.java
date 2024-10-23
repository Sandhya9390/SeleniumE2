package object;
public class emp//extends Object 
{

	String name;
	int id;
	double sal;
	public emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
}




