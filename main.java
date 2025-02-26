import java.util.ArrayList;

public class main {

//return the largest element in array
    public static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int num : array) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    //return the sum of elements in array
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    //return the smallest odd element in array
    public static int minOdd(int[] array) {
        int minOdd = Integer.MAX_VALUE;
        for (int num : array) {
            if (num % 2 != 0 && num < minOdd) {
                minOdd = num;
            }
        }
        return minOdd;
    }

    //return true if array contains two elements that are equal to each other
    public static boolean containsDuplicate(int[] array) {
        ArrayList<Integer> seen = new ArrayList<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}