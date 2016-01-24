package Claculator;

/**
 * Created by Admin on 1/24/2016.
 */
public class Operations {

    public void Oper(int oper , double num1 , double num2 ){

        //System.out.println("Choose an operation please !(You must put 1-4) : ");

        switch(oper){

            case 1 : res = num1 + num2 ;
                System.out.println("Sum = " + res);
                break;
            case 2 : res = num1 - num2;
                System.out.println("Subtraction = " + res);
                break;
            case 3 : res = num1 * num2 ;
                System.out.println("Multiplication = "+ res);
                break;
            case 4 : if(num2 != 0 )
            {
                res = num1 / num2 ;
                System.out.println("Division = "+ res);
            }else
            {
                System.out.println("You put second number = 0 ! Incorrect !");
            }
                break;
            default: System.out.println("You did incorrect input ! Please try again !");

        }

    }
    double res;

}
