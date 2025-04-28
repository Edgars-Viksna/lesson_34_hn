import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {

        System.out.println("-------- Front End List -----------");
        List<Worker> frontEnd = new ArrayList<>();
        frontEnd.add(new Worker("Alanos", "Bergos", "Front End"));
        frontEnd.add(new Worker("Alanos", "Bergos", "Front End"));
        frontEnd.add(new Worker("Barbyy", "Cimmer", "Front End"));
        frontEnd.add(new Worker("Celine", "Dionis", "Front End"));
        frontEnd.add(new Worker("Dirkos", "Einzel", "Front End"));
        print2(frontEnd);

        System.out.println("-------- Back End List -----------");
        List<Worker> backEnd = new ArrayList<>();
        backEnd.add(new Worker("Alanos", "Bergos", "Back End"));
        backEnd.add(new Worker("Oskaro", "Bigalo", "Back End"));
        backEnd.add(new Worker("Oskaro", "Bigalo", "Back End"));
        backEnd.add(new Worker("Adrian", "Hariss", "Back End"));
        backEnd.add(new Worker("Klinto", "Westos", "Back End"));
        print2(backEnd);

        System.out.println("-------- Premie List -----------");
        List<Worker> forPremie = forPremie(frontEnd, backEnd);
        print2(forPremie);


    }
    //-------------------- Methods --------------

    public static <T> void print2(List<T> list) {
        list.forEach(element -> System.out.println(element));
    }

    public static <T> List<T> forPremie(List<T> list1, List<T> list2) {
        Set<T> temporary = new HashSet<>(list1);
        list2.forEach(element -> temporary.add(element));
        List<T> result = new ArrayList<>(temporary);
        return result;
    }

}
