import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4));
        int result = Recursion.sum(array);
        System.out.println("Hello World!"+result);
    }
}
