public class BuddyInfo {
	
	private String name;
	private String phoneNumber;
	
	BuddyInfo(String _name, String _phoneNumber){
		this.name = _name;
		this.phoneNumber = _phoneNumber;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		BuddyInfo fren = new BuddyInfo("Homer", "5");
		System.out.println("Hello " + fren.getName());
		
	}

}
