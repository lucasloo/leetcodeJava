import java.util.HashMap;

/**
 * Created by luke on 2018/9/6.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tmpMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tmpMap.containsKey(target - nums[i])) {
                return new int[]{i, tmpMap.get(target - nums[i])};
            } else {
                tmpMap.put(nums[i], i);
            }
        }
        return null;
    }
}
