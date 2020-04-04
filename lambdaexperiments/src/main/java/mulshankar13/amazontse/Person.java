package mulshankar13.amazontse;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	String firstName;
	String lastName;
	int age;
	String country;

	public Person(String firstName, String lastName, int age, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return firstName + "|" + lastName + "|" + age + "|" + country;
	}
}

class FirstNameCompare implements Comparator<Person> {
	public int compare(Person one, Person two) {
		return one.getFirstName().compareTo(two.getFirstName());
	}
}

class LastNameCompare implements Comparator<Person> {
	public int compare(Person one, Person two) {
		return one.getLastName().compareTo(two.getLastName());
	}
}

class AgeCompare implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getAge() > o2.getAge() ? 1 : (o1.getAge() < o2.getAge() ? -1 : 0);
	}
}

class CountryCompare implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getCountry().compareTo(o2.getCountry());
	}
}

class PersonUtils {
	public static void sortPersons(List<Person> persons, String[] sortBy) {
		// invoke comparator based on these fields if not empty
		for (String string : sortBy) {
			System.out.println(string);
		}
		FirstNameCompare first = new FirstNameCompare();
		LastNameCompare lastNameCompare = new LastNameCompare();
		CountryCompare countryCompare = new CountryCompare();
		AgeCompare ageCompare = new AgeCompare();
		String firstname = "";
		String lastname = "";
		String age = "";
		String country = "";
		for (String field : sortBy) {
			if (field.equalsIgnoreCase("firstname")) {
				firstname = "firstname";
				System.out.println(" field:" + field);
				
				System.out.println(persons);
			} else if (field.equalsIgnoreCase("lastname")) {
				lastname = "lastname";
				System.out.println(" field:" + field);
				
				System.out.println(persons);
			} else if (field.equalsIgnoreCase("age")) {
				age = "age";
				System.out.println(" field:" + field);
				Collections.sort(persons, ageCompare);
			} else if (field.equalsIgnoreCase("country")) {
				country = "country";
				System.out.println(" field:" + field);
				
			}
		}
		
		if(!firstname.isEmpty()) {
			Collections.sort(persons, first);
		}
		if(!lastname.isEmpty()) {
			Collections.sort(persons, lastNameCompare);
		}
		if(!country.isEmpty()) {
			Collections.sort(persons, countryCompare);
		}
		if(!age.isEmpty()) {
			Collections.sort(persons, ageCompare);
		}

	}

}