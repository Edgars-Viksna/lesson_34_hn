import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Dell");
        list.add("Apple");
        list.add("Microsoft");
        list.add("Samsung");
        list.add("Dell");

        print1(list);
        System.out.println(testForObjects(list));


    }

    //-------------------- Methods --------------

    public static <T> Boolean testForObjects(List<T> list) {
        Boolean result = true;
        Set<T> set = new HashSet<>(list);
        if (list.size() == set.size()) {
            result = false;
        }
        return result;
    }

    public static <T> void print1(List<T> list) {
        list.forEach(element -> System.out.println(element));
    }
}