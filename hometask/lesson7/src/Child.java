/**
 * Created by Admin on 11/18/2015.
 */
public class Child extends Parent {

    static {

        System.out.println("Child 1 ");
    }

    {
        System.out.println("non static Child ");

    }

    Child() {

        System.out.println("Child constructor ");
    }
}
