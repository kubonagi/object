package test;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Gold");list.add("Silver");list.add("Bronze");
        list.removeIf(t->t.contains("o"));
        System.out.println(list);
    }
}
