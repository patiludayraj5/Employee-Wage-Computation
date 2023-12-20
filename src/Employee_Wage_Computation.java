import java.util.Random;

public class Employee_Wage_Computation
{
    public static void calculateTotalWage(String companyName, int wage_per_hour, int Max_Working_Days, int Max_Working_Hours){
        final int full_time = 1;
        final int part_time=2;
        //int daily_work;
        int absent=0;
        int total_wage=0;
        int working_Hour=0;
        int wage=0;
        Random random=new Random();
        System.err.println("Details of " + companyName + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.println("Wage per hour:" + wage_per_hour);
        System.out.println("Maximum working days:" + Max_Working_Days);
        System.out.println("Maximum working hours:" + Max_Working_Hours);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "WorkingHour", "Wage", "Total working hrs");
        for (int day=1,total_working_hours=0;day<=Max_Working_Days && total_working_hours<Max_Working_Hours
                ;day++,total_working_hours+=working_Hour) {
            int employee = random.nextInt(3);
            switch (employee) {
                case full_time, part_time -> {
                    //  System.out.println("Employee is Present Full Time");
                    working_Hour = 8;
                    total_wage++;
                }
                // System.out.println("Employee is present Part Time");
                default -> {
                    working_Hour = 0;
                    //  System.out.println("Employee is Absent");
                    absent++;
                }
            }
            wage=working_Hour * wage_per_hour;
            total_wage+=wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, working_Hour, wage, total_working_hours + working_Hour);            System.out.println();
        }
        System.out.println();
        System.out.println("Total wage for a month is " + total_wage);
    }
    public static void main(String []args)
    {
       calculateTotalWage("Flipkart",25,17,90);
       // System.out.println("Employee is absent for "+absent+" Days");
        //System.out.println("Total month wage is : "+total_wage*wage);
    }
}
