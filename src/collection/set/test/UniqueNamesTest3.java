package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        System.out.println("treeSet = " + treeSet);
    }
}