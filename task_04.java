import java.util.Scanner;
class task_04
{
    static float n, sum;
    static void celtofer()
    {
        sum=(n*(9.0f/5.0f)+32);
        System.out.print(sum+"°f\n");
    }
    static void fertocel()
    {
        sum=(n-32)*(5.0f/9.0f);
        System.out.print(sum+"°c\n");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.print("enter any temperature= ");
            n= sc.nextFloat();
            System.out.print("Enter the unit(C/F)= ");
            String u=sc.next();
            u= u.toLowerCase();
            if(u.equals("c"))
            {
                System.out.print("The equal ferenhite temperature measurement is= ");
                celtofer();
            }
            else if(u.equals("f"))
            {
                System.out.print("The equal celcius temperature measurement of is= ");
                fertocel();
            }
            else
            {
                System.out.println("Invalid input...");
            }
            System.out.print("Do you want to measure again?(Yes/No)= ");
            String y=sc.next().toLowerCase();
            if(!y.equals("yes"))
            {
                System.exit(0);
            }
        }
    }
}