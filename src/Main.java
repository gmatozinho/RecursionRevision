import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] array2 = {-5,2,-3,4,0};
        int result = Recursion.sum((ArrayList<Integer>)array.clone());
        int resultProd = Recursion.prod(-5,7);
        int resultDiv = Recursion.div(100,-10);
        double resultSqrt = Recursion.sqrt(64,1,0);
        boolean resultSearch = Recursion.search(array2,15,0);
        String resultInverse = Recursion.inverseStr("gustavo",0);
        int resultBigger = Recursion.biggerValue(array2,array2[0],0);
        int resultMinor = Recursion.minorValue(array2,array2[0],0);
        boolean isPalindrome = Recursion.palindrome("reviver");
        String bin = Recursion.decimalToBinary(10);

        System.out.println("Hello World!"+bin);

    }
}
