import java.util.*;

// Given two integer arrays, return their intersection.
// Note: the intersection is the set of elements that are common to both arrays.

public class program {
    public static void main(String[] args)
    {
        int[] nums1 = {2, 4, 6, 8};
        int[] nums2 = {2, 8, 3};

        System.out.println(intIntersection(nums1, nums2));

    }

    //Time O(2n) | Space O(2n)
    public static List<Integer> intIntersection(int[] nums1, int[] nums2) {

        HashSet<Integer> visited = new HashSet<>();

        HashSet<Integer> set2 = new HashSet<Integer>();


        for (int i : nums1) {
            visited.add(i);
        }


        for(int i: nums2){
            if(visited.contains(i)){
                set2.add(i);
            }
        }

        List<Integer> intersection = new ArrayList<Integer>(set2);


        return intersection;

    }
}
