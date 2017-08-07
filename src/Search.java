
public abstract class Search {
 public boolean isActive;
 
 
 /**
  * Runs all check methods
 * @return True if info found, false if not
 */
public abstract boolean updateInfo();
/**
 * @return readable copy of search results
 */
public abstract String readable();

/**
 * Reads in data from file to respective class
 * @return true if successfully read in
 */
public abstract boolean readIn(String input);

}
