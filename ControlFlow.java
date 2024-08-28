import java.util.*;
public class ControlFlow {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int i=1;
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        System.out.println("if-else");
        if(num>0)
        {
            System.out.println(num+" is Positive");
        }
        else if(num==0)
        {
            System.out.println(num+" is Zero");
        }
        else
        {
            System.out.println(num+" is Negative");
        }
        System.out.println("Switch Case");
        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;    
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }
        System.out.println("For loop");
        for(int j=1;j<=num;j++)
        {
            System.out.println("Numbers : "+j);
        }
        System.out.println("While loop");
        System.out.println("Print in reverse order");
        int val=num;
        while(val!=0)
        {
            System.out.println("Numbers : " +val);
            val--;
        }
        System.out.println("Do While loop");
        System.out.println("Numbers from 1 to 3");
        do{
            System.out.println(i);
            i++;
        }while(i<=3);
        input.close();
    }
}
