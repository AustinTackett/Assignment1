import java.util.Arrays;
public class RemoveElement {

    // https://leetcode.com/problems/remove-element/solutions/3102906/java-best-solution-o-n-time-complexity/
    public static void main(String ars[]){
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int nNotEqualToVal = removeElement(nums, val);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Val of " + val);
        System.out.println("Output: " + nNotEqualToVal);

    }


    public static int removeElement(int[] nums, int val) {
        int newIndex = 0;
        int oldIndex = nums.length;
        for (int i = 0; i < oldIndex; i++) {
            if (nums[i] != val) {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }

        return newIndex;
    }
}
