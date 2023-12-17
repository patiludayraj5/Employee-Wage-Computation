import java.util.Random;

public class Employee_Wage_Computation
{
    public static void main(String []args)
    {
        int full_time = 1;
        int wage_per_hour=20;
        int daily_work;
        int part_time=2;
        Random random=new Random();
        int employee=random.nextInt(3);
        if (employee == full_time)
        {
            daily_work=8;
            System.out.println("Employee is Present Full Time");

        } else if (employee==part_time) {
             daily_work=8;
            System.out.println("Employee is present Part Time");
        } else {
            daily_work=0;
            System.out.println("Employee is Absent");
        }
        System.out.printf("\nEmployee Daily Wage: %d",daily_work*wage_per_hour);

    }
}
