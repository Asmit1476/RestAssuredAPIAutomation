package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        String[] expected = {"India", "US", "UK"};
        String[] actual = {"Japan", "UK", "France"};

        Set<String> set1 = new HashSet<>(Arrays.asList(expected));
        Set<String> set2 = new HashSet<>(Arrays.asList(actual));
        Set<String> uncommon = new HashSet<>(set1);
        uncommon.addAll(set2);
        System.out.println("All elements "+uncommon);
        set1.retainAll(set2); //intersection
        System.out.println(set1);
        uncommon.removeAll(set1);
        System.out.println("Uncommon element "+uncommon);



    }
}
