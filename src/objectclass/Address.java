package objectclass;
public class Address {
	String country;
	String state;
	String city;
	int pincode;
	public Address(String country, String state, String city, int pincode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
		
	

}
