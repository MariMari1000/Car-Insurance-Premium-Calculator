package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Timeout;

class InsuranceProgramTest {

	public static InsuranceProgram insuranceProgram;
	
	@BeforeAll
	public static void SetUp() {
		insuranceProgram = new InsuranceProgram();
	}
	
	@AfterEach
	public void SetUp2() {
		insuranceProgram.setBasicInsurance(500);
	}
	
	@AfterAll
	public static void CleanUp() {
		insuranceProgram = null;
	}
	
	@Test
	public void IllegalAgeForDrivingException() {
		assertThrows(IllegalArgumentException.class, () ->{
			insuranceProgram.main(new String[] {"14", "7", "9"});
		});
		
	}
	
	@Test
	public void StringAsArgumentForAgeException() {
		assertThrows(NumberFormatException.class, () -> {
			insuranceProgram.main(new String[] {"nine", "7", "9"});
		});	

	}
	
	
	@ParameterizedTest
	@CsvSource({"600, 0", "650, 1", "725, 2", "825, 3", "975, 4", "1175, 5", "-1, 6"})
	public void AgeLessThan25AndAllAccidentVariations(int insuranceAmount, int numberOfAccidents) {
		insuranceProgram.ageLessThan25(numberOfAccidents);
		
		assertEquals(insuranceAmount, insuranceProgram.getBasicInsurance());
	}
	
	
	@Test
	@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
	public void AgeMoreThan25And0AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "0"});
		
		assertEquals(500, insuranceProgram.getBasicInsurance());
	}
	
	@Test
	public void AgeMoreThan25And1AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "1"});
		
		assertEquals(550, insuranceProgram.getBasicInsurance());
	}
	@Test
	public void AgeMoreThan25And2AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "2"});
		
		assertEquals(625, insuranceProgram.getBasicInsurance());
	}
	@Test
	public void AgeMoreThan25And3AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "3"});
		
		assertEquals(725, insuranceProgram.getBasicInsurance());
	}
	@Test
	public void AgeMoreThan25And4AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "4"});
		
		assertEquals(875, insuranceProgram.getBasicInsurance());
	}
	@Test
	public void AgeMoreThan25And5AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "5"});
		
		assertEquals(1075, insuranceProgram.getBasicInsurance());
	}
	@Test
	public void AgeMoreThan25And6AccidentsTest() {
		insuranceProgram.main(new String[] {"26", "0", "6"});
		
		assertEquals(-1, insuranceProgram.getBasicInsurance());

}
}
