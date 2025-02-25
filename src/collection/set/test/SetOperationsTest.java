package src.collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> union = new HashSet<>(set1);

        union.addAll(set2);
        System.out.println("합집합 = " + union);
        set1.retainAll(set2);
        System.out.println("공집합 = " + set1);
        union.removeAll(set2);
        System.out.println("차집합 = " + union);


    }
}