import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.ResponseException;
import com.jaunt.UserAgent;

/**
 * 
 */

/**
 * @author joey
 *
 */
public class crawler {
	

	/**
	 * Searches on Google a specified Query
	 * @param query Search Query
	 * @return [Elements] collection of results, Null otherwise
	 */
	public Elements googleIt(String query) {
		UserAgent ua = new UserAgent();
		ua.settings.autoSaveAsHTML = true;
		try {
			ua.visit("http://google.com");
			ua.doc.apply(query);
			ua.doc.submit("Google Search");
			return ua.doc.findEvery("<h3 class=r>").findEvery("<a>"); //This is an HTML reference to the entire result: href, title, and all.
			/* A basic print out looks like this:
			 * crawler spi = new crawler();
			 *Elements links = spi.googleIt("Gross");
			 *for(Element link : links) {
			 *	System.out.printf("# : %-65s | %s\n", link.innerText(), link.getAt("href"));
			 *}
			 */
		
		} catch (ResponseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JauntException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
	}
}
