/*
 * chapter 09-04. this ÂüÁ¶
 */

package chapter09;

class Person {
	String lastName;
	String firstName;
	
	String getLastName() {
		return lastName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String buildName() {
		return String.format("%s %s", this.getLastName(), this.getFirstName());
	}
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("È«", "±æµ¿");
		
		System.out.println(person.buildName());
	}

}
