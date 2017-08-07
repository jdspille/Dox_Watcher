import java.util.Date;

/**
 * 
 */

/**
 * @author joey
 *
 */
public class Personal extends Search {

	public String firstName;
	public String lastName;
	public String email;
	public int DLN;
	public int SSN;
	public String gender;
	public Date dob;
	public int cellPhone;
	@Override
	public boolean updateInfo() {
		checkYellowPages();
		// TODO Auto-generated method stub
		return false;
	}
	
	public String[] checkYellowPages() {
		return null;
	}

	@Override
	public String readable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean readIn(String input) {
		// TODO Auto-generated method stub
		return false;
	}

}
