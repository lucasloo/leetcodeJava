import java.util.*;

/**
 * Created by luke on 2018/9/11.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1, target = 0 - nums[i];
            while (left < right) {
                if (nums[left] + nums[right] < target) {
                    left++;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else if (nums[left] + nums[right] == target) {
                    List<Integer> tmpList = new LinkedList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[left]);
                    tmpList.add(nums[right]);
                    ret.add(tmpList);
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left ++;
                    }
                }
            }
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ret;
    }

}
