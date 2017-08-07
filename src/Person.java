import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Person {
	private String handle;
	private Criminal crimHistory;
	private Social socHistory;
	private Personal persHistory;
	private Deep deepHistory;
	
	public Person(String lastName, String firstName) {
		read(lastName, firstName);
	}

	public int getInfo() {
		return 0;
	}
	
	public void print() {
		System.out.println("PERSON!");
	}
	
	public void save() {
		try {
			Writer wr = new FileWriter(new File("./Person/" + persHistory.lastName + "," + persHistory.firstName));
			wr.write(handle);
			wr.write(persHistory.readable());
			wr.write(socHistory.readable());
			wr.write(crimHistory.readable());
			wr.write(deepHistory.readable());
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void read(String lastName, String firstName) {
		try {
			Scanner fc = new Scanner(new File("./Person/" + lastName + "," + firstName));
			handle = fc.nextLine();
			persHistory.readIn(fc.nextLine());
			socHistory.readIn(fc.nextLine());
			crimHistory.readIn(fc.nextLine());
			deepHistory.readIn(fc.nextLine());
			fc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Adding new Person");
		}
	}
}
