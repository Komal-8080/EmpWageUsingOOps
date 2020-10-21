import java.util.Scanner;

class MainClassEmpWage
{
	public static void main(String args[])
	{
	Scanner Company = new Scanner(System.in);
		System.out.println("Enter Company name");
	String company = Company.nextLine();

	Scanner EmpRatePerHour = new Scanner(System.in);
                System.out.println("Enter Employee Rate Per Hour");
        int empRatePerHour = EmpRatePerHour.nextInt();

	Scanner NumOfWorkingDays = new Scanner(System.in);
                System.out.println("Enter Number of working Days");
        int numOfWorkingDays = NumOfWorkingDays.nextInt();

	Scanner MaxHoursPerMonth = new Scanner(System.in);
                System.out.println("Enter Maximum Working Hours Per Month");
        int maxHoursPerMonth = MaxHoursPerMonth.nextInt();


	ComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage( company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth );
	empWageBuilder.computeEmpWage();
        System.out.println("Total Wage for " +company+ "company: "+empWageBuilder.getTotalWage(company));
	}
}
