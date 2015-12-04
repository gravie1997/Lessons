/**
 * Created by Admin on 11/15/2015.
 */
public class Matix {

        public static void main (String [] args){

            int n=3;
            int m=3;

            int matr[][]=new int[n][];
            int result[][]=new int[m][];

            for(int i=0;i<result.length;i++)result[i]=new int[n];

            System.out.println("Original: ");
            for(int i=0;i<matr.length;i++){
                matr[i]=new int[m];
                for(int j=0;j<matr[i].length;j++){

                    matr[i][j]=(int)Math.round(Math.random()*100);
                    System.out.print(matr[i][j] + " ");
                }

                System.out.println();

            }
            for(int i =0;i<result.length;i++){
                for(int j=0;j<result[i].length;j++) {
                    result[i][j]=matr[j][i];

                }
            }
            System.out.println("Trans Matr : ");
            for(int i =0;i<result.length;i++){
                for(int j=0;j<result[i].length;j++){
                    System.out.print(result[i][j] + " ");

                }
                System.out.println();

            }

        }
    }
