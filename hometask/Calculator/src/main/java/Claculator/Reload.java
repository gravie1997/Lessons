package Claculator;

import java.util.Scanner;

/**
 * Created by Admin on 1/24/2016.
 */
public class Reload {

    public static int c;

    public static void reload(){

        Scanner rel = new Scanner(System.in);

        System.out.println("Do you want to try again ? Yes=1 3, No = 2 ");
        c = rel.nextInt();

        if(c==1){
            Input.input();
        }else{
            System.out.println("Come back again ! =)");
        }

    }


}
