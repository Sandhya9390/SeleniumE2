package com;

public class std{
	String name;
	int id;
	double fees;
	double marks;
	public std(String name, int id, double fees, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "std [name=" + name + ", id=" + id + ", fees=" + fees + ", marks=" + marks + "]";
	}
}
	
	


