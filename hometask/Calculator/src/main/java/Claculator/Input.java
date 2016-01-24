package Claculator;

import java.util.Scanner;

/**
 * Created by Admin on 1/24/2016.
 */
public class Input {

    public static int oper;
    public static double num1;
    public static double num2;

    public static void input(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose math operation pls ! You must put 1-4");
        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = *");
        System.out.println("4 = /");


            oper = scanner.nextInt();
            System.out.println("Input first number : ");
            num1 = scanner.nextDouble();
            System.out.println("Your first number = " +num1);
            System.out.println("Input second number : ");
            num2 = scanner.nextDouble();
            System.out.println("Your second number = "+num2);

            Operations res = new Operations();
            res.Oper(oper , num1 , num2 );

        Reload.reload();
    }



}
