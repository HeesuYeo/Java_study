package myobj;

public class PhoneBookInfo {

	String group;
	String phoneNumber;
	String name;

	public PhoneBookInfo(String group, String phoneNumber, String name) {
		this.group = group;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("[%s,%s,%s]", name, phoneNumber, group);
	}

}