package javaDSAPractice.com.analysis.datastructure;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        int N = 1_000_000;     // Dataset size
        int target = N - 1;    // Worst-case target

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill all data structures
        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        ArraySearch arraySearch = new ArraySearch();
        HashSetSearch hashSetSearch = new HashSetSearch();
        TreeSetSearch treeSetSearch = new TreeSetSearch();

        // Array Search
        long startArray = System.nanoTime();
        arraySearch.search(array, target);
        long endArray = System.nanoTime();

        //HashSet Search
        long startHashSet = System.nanoTime();
        hashSetSearch.search(hashSet, target);
        long endHashSet = System.nanoTime();

        //TreeSet Search
        long startTreeSet = System.nanoTime();
        treeSetSearch.search(treeSet, target);
        long endTreeSet = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Array Search Time: " +
                (endArray - startArray) / 1_000_000.0 + " ms");
        System.out.println("HashSet Search Time: " +
                (endHashSet - startHashSet) / 1_000_000.0 + " ms");
        System.out.println("TreeSet Search Time: " +
                (endTreeSet - startTreeSet) / 1_000_000.0 + " ms");
    }
}

