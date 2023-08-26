import java.util.Scanner;

public class Operation
{

    public static void Addition(int num1, int num2)

    {
        System.out.println("Result of addition: "+ (num1+num2));
    }
    public static void Substraction(int num1, int num2)

    {
        System.out.println("Result of substraction: "+ (num1*num2));
    }
    public static void Multiplication(int num1, int num2)

    {
        System.out.println("Result of multiplication: "+ (num1+num2));
    }
    public static void Division(int num1, int num2)

    {
        if(num2!=0)
        {
            System.out.println("Result of division: "+(num1/num2));
        }else{
            System.out.println("Division not possible");
        }
    }
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,choice;
        System.out.println("Enter first number: ");
        num1=sc.nextInt();
        System.out.println("Enter second number: ");
        num2=sc.nextInt();

        System.out.println("Select operation\n1)Addition\n2)Substraction\n3)Multiplication\n4)Division\nEnter your choice: ");
        choice=sc.nextInt();

        switch (choice){
            case 1:
                Addition(num1,num2);
                break;
            case 2:
                Substraction(num1,num2);
                break;
            case 3:
                Multiplication(num1,num2);
                break;
            case 4:
                Division(num1,num2);
                break;
            default:
                System.out.println("Incorrect choice...");
        }
    }
}
