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
        System.out.println("-- есть в данном String листе повторяющиеся объекты ? --");
        System.out.println(testForObjects(list));

        System.out.println("-------- Front End List -----------");
        List<Worker> frontEnd = new ArrayList<>();
        frontEnd.add(new Worker("Alanos", "Bergos", "Front End"));
        frontEnd.add(new Worker("Alanos", "Bergos", "Front End"));
        frontEnd.add(new Worker("Barbyy", "Cimmer", "Front End"));
        frontEnd.add(new Worker("Celine", "Dionis", "Front End"));
        frontEnd.add(new Worker("Dirkos", "Einzel", "Front End"));
        print1(frontEnd);
        System.out.println("-- есть в данном Front End листе повторяющиеся объекты ? --");
        System.out.println(testForObjects(frontEnd));

        System.out.println("-------- Back End List -----------");
        List<Worker> backEnd = new ArrayList<>();
        backEnd.add(new Worker("Alanos", "Bergos", "Back End"));
        backEnd.add(new Worker("Oskaro", "Bigalo", "Back End"));
        backEnd.add(new Worker("Oskaro", "Bigalo", "Back End"));
        backEnd.add(new Worker("Adrian", "Hariss", "Back End"));
        backEnd.add(new Worker("Klinto", "Westos", "Back End"));
        print1(backEnd);
        System.out.println("-- есть в данном Back End листе повторяющиеся объекты ? --");
        System.out.println(testForObjects(backEnd));

        System.out.println("-------- For Premie List -----------");
        List<Worker> forPremie = forPremie(frontEnd, backEnd);
        print1(forPremie);
        System.out.println("-- есть в данном For Premie листе повторяющиеся объекты ? --");
        System.out.println(testForObjects(forPremie));


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

    public static <T> List<T> forPremie(List<T> list1, List<T> list2) {
        Set<T> temporary = new HashSet<>(list1);
        list2.forEach(element -> temporary.add(element));
        List<T> result = new ArrayList<>(temporary);
        return result;
    }
}