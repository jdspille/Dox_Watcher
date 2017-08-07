import java.util.List;

/**
 * 
 */

/**
 * @author joey
 *
 */
public class Criminal extends Search {
	boolean warrentOut;
	List<String> charges;
	@Override
	public boolean updateInfo() {
		checkMyCase();
		checkMostWanted();
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Check mycase database
	 * https://public.courts.in.gov/mycase/#/vw/Search
	 * @return list of charges
	 */
	List<String> checkMyCase(){
		return charges;
		
	}
	
	/**
	 * @return
	 */
	boolean checkMostWanted(){
		return warrentOut;
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
