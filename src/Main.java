import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Age = ");
       int age=input.nextInt();
       System.out.println("Enter Gender = ");
       char gender=input.next().charAt(0);
       System.out.println("Enter profession = ");
       char profession=input.next().charAt(0);
       System.out.println("Enter personal assets = ");
       int personalassets=input.nextInt();

       Loancalculator loancalculator=new Loancalculator();
       loancalculator.loanCalculation(age,gender,profession,personalassets);

    }
}
