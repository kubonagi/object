package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> words=new LinkedHashSet<>();
        words.add("dog");
        words.add("cat");
        for (String s:words){
            System.out.println(s+":");
        }
    }
}
