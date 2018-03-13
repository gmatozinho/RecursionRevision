import java.util.ArrayList;
import java.util.List;

public class Recursion {

    public static int sum(ArrayList<Integer> array)
    {
        return array.size() != 0 ? array.remove(0) + sum(array) : 0;
    }

    public static int prod(int multiplier, int  multiplying){
        if (multiplying == 0 || multiplier == 0) {
            return 0;
        } else if (multiplier > 0) {
            return multiplying + prod(multiplying, multiplier - 1);
        }
        return -prod(multiplying, -multiplier);
    }

    public static int div(int dividend, int divider) {
        if (dividend < 0) return -div(-dividend, divider);
        if (divider < 0) return -div(dividend, -divider);
        if (dividend < divider) return 0;
        return 1 + div(dividend - divider, divider);
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

    public static boolean search(int[] array, int element, int index)
    {
        if(array.length ==0) return false;
        if(array[index] == element) return true;
        else if (array[index] != element && array.length-1 == index) return false;
        return search(array,element,index+1);
    }

    public static String inverseStr(String str,int index){
        if (str.length()==0)return str;
        if(index == str.length()-1)return str;
        String rest = str.substring(index,str.length()-1);
        String last = str.substring(str.length()-1);
        String changed = str.substring(0,index);
        return inverseStr(changed+last+rest,index+1);
    }

    public static int biggerValue(int[] array,int bigger,int index){
        if(array.length==0)return Integer.MIN_VALUE;
        if(bigger<array[index]) bigger=array[index];
        if(array.length-1 == index) return bigger;
        return biggerValue(array,bigger,index+1);
    }

    public static int minorValue(int[] array,int minor,int index){
        if(array.length==0)return Integer.MIN_VALUE;
        if(minor>array[index]) minor=array[index];
        if(array.length-1 == index) return minor;
        return minorValue(array,minor,index+1);
    }

    public static boolean palindrome(String str){
        return str.equals(inverseStr(str, 0));
    }

    public static String decimalToBinary(int num){
        String result = ((num % 2 == 0) ? "0" : "1"); // expr

        if (Math.abs(num) > 1) {
            result = decimalToBinary(num / 2) +result;
        }

        return result;
    }

    public static int fact(int n)
    {
        int result;

        if(n== 0) return 0;
        else if(n==1) return 1;
        return fact(n-1) * n;
    }

    public static ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> array)
    {
        if (array.size() == 1) {
            ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
            listArray.add(array);
            return listArray;
        } else {
            ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
            for (Integer i: array) {
                ArrayList<Integer> subList = new ArrayList<>(array);
                subList.remove(i);
                ArrayList<ArrayList<Integer>> subListNew = permutation(subList);
                for (ArrayList<Integer> _list: subListNew) {
                    ArrayList<Integer> local = new ArrayList<>();
                    local.add(i);
                    local.addAll(_list);
                    listArray.add(local);
                }
            }
            return listArray;
        }
    }

   public static ArrayList<ArrayList<Integer>> permPy(ArrayList<Integer> elems){
       if (elems.size() == 1) {
           ArrayList<ArrayList<Integer>> listArray = new ArrayList<>();
           listArray.add(elems);
           return listArray;
       }
       else {
           ArrayList<ArrayList<Integer>> ps = new ArrayList<>();
           for (Integer x : elems) {
               ArrayList<Integer> array1 = new ArrayList<>(elems);
               array1.remove(x);
               for (ArrayList<Integer> p : permPy(array1)) {
                   p.add(0, x);
                   ps.add(p);
               }
           }
           return ps;
       }
   }


}
