package ie.atu.dip;
import java.util.Scanner;

/**
 * This program calculates car insurance premium based on age and accidents.
 * 
 * @author marij
 * 
 *
 */
public class InsuranceProgram {
	/**
	 * This is a variable that stores basic insurance cost.
	 */
	private static int basicInsurance = 500;
	/**
	 * This is a variable that stores insurance surcharge.
	 */
	private static int surcharge = 100;
	
	
	
	/**
	 * Main method calculates cost of insurance based on age and accidents
	 * 
	 * @param args - [0] --> age, [1] --> number of accidents before the age of 25, 
	 * 				 [2] --> number of accidents from the age of 25
	 * 
	 * @throws IllegalArgumentException - if the age is below 17
	 * @throws NumberFormatException - if the age is passed as a string
	 * 
	 */
	public static void main(String[] args) { 
	
                
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(args[0]);
        
        
        
        if(age < 17)
        	throw new IllegalArgumentException("You are too young to drive!");
      
        if (age < 25)
        	ageLessThan25(Integer.parseInt(args[1]));
        if (age >= 25) {
            System.out.println("No additional surcharge");
            
            System.out.print("\nHow many accidents did you have? ");
            int accidents = Integer.parseInt(args[2]);

           ageMoreOrEqualThan25(accidents);
            
           
        }
    }
	
	/**
	 * If the person is younger than 25, this method is called to calculate the cost of insurance
	 * 
	 * @param numberOfAccidents - number of accidents before the age of 25
	 */
	public static void ageLessThan25(int numberOfAccidents) {
		basicInsurance += surcharge; 
        System.out.println("Additional surcharge " + surcharge);
        
        System.out.print("\nHow many accidents did you have? ");
        int accidents = numberOfAccidents;
        
        switch (accidents) {
            case 0: System.out.println("No surcharge");
                    System.out.println("Total amount to pay: " + basicInsurance);
                    break;
            case 1: System.out.println("Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50));
            		basicInsurance += 50;// Pay 650
            break;
            case 2: System.out.println("Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125));
            		basicInsurance += 125;// Pay 725
            break; 
            case 3: System.out.println("Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225));
            		basicInsurance += 225;// Pay 825
            break;
            case 4: System.out.println("Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375));
            		basicInsurance += 375;// Pay 975
            break;
            case 5: System.out.println("Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575));
            		basicInsurance += 575;// Pay 1175
            break;
        }
        
        // There is no case for 6 accidents (there was no "=" sign before)            
        if(accidents >= 6) {
        	basicInsurance = -1;
            System.out.println("No insurance");
        }
	}
	
	
	/**
	 * If the person is 25 or older, this method is called to calculate the cost of insurance
	 * 
	 * @param accidents - - number of accidents after the age of 25
	 */
	public static void ageMoreOrEqualThan25(int accidents) {

		switch (accidents) {
	        case 0: System.out.println("No surcharge");
	                System.out.println("Total amount to pay: " + basicInsurance);
	                basicInsurance += 0;
	                break;
	        case 1: System.out.println("Additional surcharge for accident: " + 50 + " \ntotal amount to pay: " + (basicInsurance + 50)); // Pay 550
	        		basicInsurance += 50;
	        		break;
	        case 2: System.out.println("Additional surcharge for accident: " + 125 + " \ntotal amount to pay: " + (basicInsurance + 125)); // Pay 625;
	        		basicInsurance += 125;
	        		break; 
	        case 3: System.out.println("Additional surcharge for accident: " + 225 + " \ntotal amount to pay: " + (basicInsurance + 225)); // Pay 725;
	        		basicInsurance += 225;
	        		break;
	        case 4: System.out.println("Additional surcharge for accident: " + 375 + " \ntotal amount to pay: " + (basicInsurance + 375)); // Pay 875;
	        		basicInsurance += 375;
	        		break;
	        case 5: System.out.println("Additional surcharge for accident: " + 575 + " \ntotal amount to pay: " + (basicInsurance + 575)); // Pay 1075;
	        		basicInsurance += 575;
	        		break;
		}
    //Originally, there was no case for 6 accidents, so the if statement was adjusted to accidents >=6
	    if(accidents >= 6) {
	    	basicInsurance = -1;
	        System.out.println("No insurance");
	    }
	}

	/**
	 * getter method for basicInsurance variable
	 * 
	 * @return value of  the variable basicInsurance
	 */
	public int getBasicInsurance() {
		return basicInsurance;
	}

	/**
	 * getter method for surcharge variable
	 * 
	 * @return value of  the variable surcharge
	 */
	public int getSurcharge() {
		return surcharge;
		
	}

	/**
	 * setter method for basicInsurance variable
	 * 
	 * @param basicInsurance - new value for basicInsurance
	 */
	public static void setBasicInsurance(int basicInsurance) {
		InsuranceProgram.basicInsurance = basicInsurance;
	}

}
