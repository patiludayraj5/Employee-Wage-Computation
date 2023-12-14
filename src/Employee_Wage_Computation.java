import java.util.Random;

public class Employee_Wage_Computation
{
    public static void main(String []args)
    {
        final int FULL_TIME = 1;
        Random random=new Random();
        int employee=random.nextInt(2);
        if (employee == FULL_TIME)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
        System.out.println(employee);

    }
}
