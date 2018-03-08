import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        int result = Recursion.sum(array);
        int resultProd = Recursion.prod(-5,7);
        int resultDiv = Recursion.div(100,-10);
        System.out.println("Hello World!"+resultProd);
    }
}
