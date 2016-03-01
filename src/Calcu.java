/**
 * Created by popoola on 2016/03/01.
 */
import java.util.Scanner;
import java.math.*;
public class Calcu {
    double [] x;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n =input.nextInt();
        double [] x = new double[n];

        System.out.print("Enter the first number ");
        x[0]=input.nextDouble();

        for (int i=1; i<x.length; i++){
            System.out.print("Enter the next number ");
            x[i]=input.nextDouble();
        }

        double [] sol = msd(x,n);
        System.out.printf("The mean is %1.2f \n",sol[0]);
        System.out.printf("The standard deviation is %1.2f",sol[1]);

    }
    static double[] msd (double[] x, int n) {

        double summ = 0.0;
        double mull = 1.0;
        for (int j=0; j<x.length; j++){
            summ += x[j];
            mull *= x[j];
        }
        double theMean = summ / n;
        double summSquared = 0.0;
        for (int k=0; k<x.length; k++){
            double squaredDiff = Math.pow((theMean - x[k]),2.0);
            summSquared += squaredDiff;
        }
        double std = Math.sqrt(summSquared / (n - 1));

        double[] ans= {theMean, std};
        return ans;
    }
}
