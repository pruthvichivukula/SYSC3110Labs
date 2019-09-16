
import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> addressBook = new ArrayList<>();
	
	public void addBuddy(BuddyInfo newBuddy) {
		addressBook.add(newBuddy);
	}
	
	public void removeBuddy(int indexToRemove) {
		if((indexToRemove >= 0) && (indexToRemove < addressBook.size())) {
			addressBook.remove(indexToRemove);
		}	
	}
	

	public static void main(String[] args) {
		System.out.println("AddressBook wooo");
	}

}

