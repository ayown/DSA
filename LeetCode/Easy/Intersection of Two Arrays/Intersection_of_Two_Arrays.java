import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;  //nums1[i] cannot have a partner
            else if (nums2[j] < nums1[i]) j++; //nums2[j] cannot have a partner
            else {   //ya toh jab pehla list khali hai tb ya phir direct entry(only after checking the entry is unique or not)
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) 
                    list.add(nums1[i]);
                i++; j++;
            }
        }

        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k++) res[k] = list.get(k);
        return res;
    }
}
