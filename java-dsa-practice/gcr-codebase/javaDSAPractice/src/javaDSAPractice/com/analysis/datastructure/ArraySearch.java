package javaDSAPractice.com.analysis.datastructure;

public class ArraySearch {

    public boolean search(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}

