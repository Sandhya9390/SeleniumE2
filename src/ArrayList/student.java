package ArrayList;
import java.util.ArrayList;
public class student {
	String name;
	int id;
	int age;
	long mobno;
	public student(String name, int id, int age, long mobno) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", age=" + age + ", mobno=" + mobno + "]";
	}
}	


