import java.util.HashSet;

/**
 * Created by luke on 2018/9/6.
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> tmpSet = new HashSet<>();
        int i = 0, j = 0, ret = 0;
        if (s.length() <= 1) {
            return s.length();
        }
        while (j < s.length()) {
            if (tmpSet.contains(s.charAt(j))) {
                tmpSet.remove(s.charAt(i));
                i++;
            } else {
                ret = ret < j - i + 1 ? j - i + 1 : ret;
                tmpSet.add(s.charAt(j));
                j++;
            }
        }
        return ret;
    }

}
