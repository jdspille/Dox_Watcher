import java.util.ArrayList;

import com.jaunt.*;


public class driver {

	public static void main(String[] args) {
		ArrayList<Person> classroom = new ArrayList<Person>();
		Person temp = new Person("Spillers", "Joseph");
		classroom.add(temp);
		for(Person play : classroom) {
			play.save();
		}
	}

}
