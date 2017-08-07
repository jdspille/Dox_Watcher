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

}
