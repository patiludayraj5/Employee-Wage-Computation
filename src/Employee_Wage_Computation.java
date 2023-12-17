import java.util.Random;

public class Employee_Wage_Computation
{
    public static void main(String []args)
    {
        final int full_time = 1;
        int wage_per_hour=20;
        int daily_work;
        final int part_time=2;
        int absent=0;
        Random random=new Random();
        int total_wage=0;
        int wage=0;
        for (int day=1;day<=20;day++) {
            int employee = random.nextInt(3);
            switch (employee) {
                case full_time -> {
                    System.out.println("Employee is Present Full Time");
                    daily_work = 8;
                    total_wage++;
                }
                case part_time -> {
                    daily_work = 8;
                    System.out.println("Employee is present Part Time");
                    total_wage++;
                }
                default -> {
                    daily_work = 0;
                    System.out.println("Employee is Absent");
                    absent++;
                }
            }
            wage=daily_work * wage_per_hour;
            System.out.printf("Employee Day %d Wage: %d\n",day, wage);
            System.out.println();
        }
        System.out.println();
        System.out.println("Employee is absent for "+absent+" Days");
        System.out.println("Total month wage is : "+total_wage*wage);
    }
}
