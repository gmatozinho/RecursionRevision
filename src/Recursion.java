import java.util.ArrayList;

public class Recursion {

    public static int sum(ArrayList<Integer> array)
    {
        return array.size() != 0 ? array.remove(0) + sum(array) : 0;
    }

    public static int prod(int times, int value){
        if (value == 0 || times == 0) {
            return 0;
        } else if (times > 0) {
            return value + prod(value, times - 1);
        }
        return -prod(value, -times);
    }

    public static int div(int a, int b) {
        if (a < 0) return -div(-a, b);
        if (b < 0) return -div(a, -b);
        if (a < b) return 0;
        return 1 + div(a - b, b);
    }

    public static double sqrt(double value,double kick, double tolerance){
        double aprox = Math.abs(kick + (value/kick))/2;

        if(value <0 || tolerance <0)
        {
            return Double.NaN;
        }
        else if(Math.abs(aprox*aprox-value)<=tolerance){
            return aprox;
        }
        return sqrt(value,aprox,tolerance);

    }


}
