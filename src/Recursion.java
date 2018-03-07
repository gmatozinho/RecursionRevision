import java.util.ArrayList;

public class Recursion {

    public static int sum(ArrayList<Integer> array)
    {
        return array.size() != 0 ? array.remove(0) + sum(array) : 0;
    }
}
