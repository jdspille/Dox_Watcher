import com.jaunt.*;


public class main {

	public static void main(String[] args) throws NotFound {
		crawler spi = new crawler();
		Elements links = spi.googleIt("Gross");
		for(Element link : links) {
			System.out.printf("# : %-65s | %s\n", link.innerText(), link.getAt("href"));
		}
	}

}
