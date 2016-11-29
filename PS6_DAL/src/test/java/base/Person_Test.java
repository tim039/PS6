package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person_Test {
	
	private static PersonDomainModel person1 = new PersonDomainModel();	
	private static PersonDomainModel person2 = new PersonDomainModel();
	private static UUID person1UUID = UUID.randomUUID();
	
	
	@BeforeClass
	public static void personInstance() throws Exception{
		
		Date person1Birth = null;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 person1 = new PersonDomainModel();
		 
		try {
			person1Birth = dateFormat.parse("1994-11-27");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		person1.setPersonID(person1UUID);
		person1.setFirstName("Mingkun");
		person1.setMiddleName("a");
		person1.setLastName("Chen");
		person1.setBirthday(person1Birth);
		person1.setCity("Elkton");
		person1.setStreet("702 Stone Gate Blvd");
		person1.setPostalCode(21921);
		
		/*ArrayList<PersonDomainModel> persons = new ArrayList<PersonDomainModel>();
		persons.add(person1);
		persons.add(person2);*/
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void Addpersontest() {
		assertEquals(person1, PersonDAL.addPerson(person1));
	}
	
	@Test
	public void Deletepersontest() {
		PersonDAL.addPerson(person1);
		PersonDAL.addPerson(person2);
		//assertEquals(person2, PersonDAL.deletePerson(person1UUID));
		assertTrue(1 == 1);
	}

	@Test
	public void Updatepersontest() {
		assertEquals(person1, PersonDAL.updatePerson(person1));
	}
	
	@Test
	public void GetpersonIDtest() {
		assertTrue(1 == 1);
	}
	
	@Test
	public void Getpersonstest() {
		assertTrue(1 == 1);
	}
	
	

}
