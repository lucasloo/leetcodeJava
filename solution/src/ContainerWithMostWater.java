/**
 * Created by luke on 2018/9/10.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i = 0, j = height.length;
        int max = 0;
        while (i < j) {
            int total = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
            max = total > max ? total : max;
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }

}
