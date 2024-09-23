package LeedCode;

import java.util.*;


public class MergeSortedArray {
    public static void main(String[] args) {
        String[] words = {"foo","bar"};
        System.out.println(findSubstring("barfoothefoobarman", words));
    }

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m + n];
        for (int i = 0; i < (m + n); i++) {
            if (i < m) {
                nums1Copy[i] = nums1[i];
            } else {
                nums1Copy[i] = nums2[i - m];
            }
        }
        Arrays.sort(nums1Copy);

        for (int i = 0; i < nums1Copy.length; i++) {
            nums1[i] = nums1Copy[i];
        }

    }

    static public void mergeBestSolution(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.contains(nums[i])) {
                if (k == 0) {
                    integers.add(nums[i]);
                    k++;
                }
            } else {
                k = 0;
                integers.add(nums[i]);
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            nums[i] = integers.get(i);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return integers.size();
    }

    public static int removeDuplicatesBestSolution(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }
        System.gc();
        return index;
    }

    private static void swap(int[] list, int i, int i1) {
        int temp = list[i];
        list[i] = list[i1];
        list[i1] = temp;
    }

    public static int[] productExceptSelf(int[] nums) {
        int nums2[] = new int[nums.length];
        Arrays.fill(nums2, 1);
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (i != j)
                    nums2[i] *= nums[j];
            }
        }
        return nums2;
    }

    public static boolean isValid(String s, String[] words) {
        int l = words[0].length();
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < s.length(); i += l) {
            String sub = s.substring(i, i + l);
            if (!count.containsKey(sub) || count.get(sub) <= 0) {
                return false;
            }
            count.put(sub, count.get(sub) - 1);
        }
        return true;
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        int k = words.length * words[0].length();
        int ws = 0;
        int we = 0;
        List<Integer> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        while (we < s.length()) {
            str.append(s.charAt(we));
            if (str.length() == k) {
                if (isValid(str.toString(), words)) {
                    ans.add(ws);
                }
                str.delete(0, 1);
                ws += 1;
            }
            we++;
        }
        return ans;
    }
}
