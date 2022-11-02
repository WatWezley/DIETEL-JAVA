public class Semicolon {

	public static void main(String[] args){

	Native pauline = new Native();

	pauline.setName(" Kachi");
	String herName = pauline.getName();
	System.out.println(herName);

	pauline.setName(" Esther");
	herName = pauline.getName();
	System.out.println(herName);
	
	pauline.setPhoneNumber("08065378925");
	String herPhoneNumber = pauline.getPhoneNumber();
	System.out.println(herPhoneNumber);


	Cohort14 student = new Cohort14();
	
	student.updateCurrentCourse("Java");
		String herCurrentCourse = student.whatsCurrentCourse();
		System.out.println(herCurrentCourse);

	student.updatePeriod(" 2 months");
		String herPeriod = student.whatsPeriod();
		System.out.println(herPeriod);
	
	
	student.payment(1500000);
		int herPayment = student.newPayment();
		System.out.println(herPayment);

	int schoolFees = (3500000);
	int balance = (3500000 - herPayment);
		System.out.printf(" Balance is %d%n ", balance);

	}
	
	
}