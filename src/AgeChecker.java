import javax.swing.JOptionPane;


public class AgeChecker {

	//Prompt user for first, last name and year of birth
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null, "Whats your first name?");
		String lastName = JOptionPane.showInputDialog(null, "Whats your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));
		
		//Call functions to verify age
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
		
		//Provide output verifying boolean expression
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + ", you may proceed with your pruchase");
			
		} else {
			JOptionPane.showMessageDialog(null, fullName + ", your not old enough to purchase booze");
		}
		
	}
	//This method receives an int parameter for year of birth and boolean expression
	public static boolean verifyLegalAge(int yob) {
		boolean legalAgeStatus = (2013-yob) >= 19;
		return legalAgeStatus;
	}
		//This method receives two strings parameters and returns one string
	public static String concatenateNames(String fn, String ln) {
			String fullName = fn +" " + ln;
			return fullName;
		}
	}
	
	


