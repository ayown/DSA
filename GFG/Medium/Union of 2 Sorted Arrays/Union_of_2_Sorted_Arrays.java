import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i = 0, j = 0;
        int n = a.length, m = b.length;
        ArrayList<Integer> res = new ArrayList<>();

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                addIfNotDuplicate(res, a[i]);
                i++;
            } else if (b[j] < a[i]) {
                addIfNotDuplicate(res, b[j]);
                j++;
            } else { // both equal
                addIfNotDuplicate(res, a[i]);
                i++;
                j++;
            }
        }

        while (i < n) { //agr j khatam hogya hai toh
            addIfNotDuplicate(res, a[i]);
            i++;
        }

        while (j < m) {  //agr i khatam hogya h toh
            addIfNotDuplicate(res, b[j]);
            j++;
        }

        return res;
    }

    private static void addIfNotDuplicate(ArrayList<Integer> res, int val) {
        if (res.isEmpty() || res.get(res.size() - 1) != val) {
            res.add(val);
        }
    }
}
