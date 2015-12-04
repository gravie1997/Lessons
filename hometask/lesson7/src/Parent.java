/**
 * Created by Admin on 11/18/2015.
 */
public class Parent {
    static {

        System.out.println("static Parent  ");
    }

    {
        System.out.println("non static Parent  ");
    }

    Parent() {


        System.out.println("Parent constructor  ");

    }
}
