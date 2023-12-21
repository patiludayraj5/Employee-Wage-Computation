import java.util.Random;

public class Employee_Wage_Computation
{
    static Random random=new Random();

    static final int full_time = 1;
    static final int part_time=2;
    // instance constants
     final String COMPANY_NAME;
     final int WAGE_PER_HR;
     final int MAX_WORKING_DAYS;
     final int MAX_WORKING_HRS;
    // instance variable
    static int totalWage;

    Employee_Wage_Computation(String companyName, int wage_per_hour, int Max_Working_Days, int Max_Working_Hours){
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wage_per_hour;
        MAX_WORKING_DAYS = Max_Working_Days;
        MAX_WORKING_HRS = Max_Working_Hours;
        totalWage = 0;
    }
    int generateEmployeeType()
    {
        return random.nextInt(3);
    }
     int getWorkingHrs(int empType)
    {
        return switch (empType) {
            case full_time -> 8;
            case part_time -> 4;
            default -> 0;
        };
    }

      void calculateTotalWage(){

        System.out.println("Computation of total wage of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Working-hrs", "Wage", "Total working hrs");
        int workingHrs;
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs <= MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
    }
    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
    public static void main(String []args)
    {
        Employee_Wage_Computation google = new Employee_Wage_Computation("Google", 8, 20, 100);
        Employee_Wage_Computation microsoft = new Employee_Wage_Computation("Microsoft", 4, 30, 150);

        google.calculateTotalWage();
        System.out.println(google);

        microsoft.calculateTotalWage();
        System.out.println(microsoft);
    }
}
