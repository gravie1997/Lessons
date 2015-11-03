/**
 * Created by uitschool JV on 11/2/2015.
 */
public class Typedannix {
    public static void main (String [] args){
        double x=938;
        int y=246;
        int z =2;
        int a=(int)((x/y)*Math.pow(10,(z+1)));
        int zn=(int)(a-((int)(a/10)*10));
        if (zn>=5) {
            System.out.println((double)(((int)(a/10+1))/Math.pow(10.0,z)));
        }
        else{
            System.out.println((double)(((int)(a/10))/Math.pow(10.0,z)));
        }
        
    }

}
