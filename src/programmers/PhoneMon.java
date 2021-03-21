package programmers;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PhoneMon {
    public int solution(int[] nums) {
        int asnwer = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);

        for (int i = 0; i < nums.length; i++)
            if (!list.contains(nums[i]))
                list.add(nums[i]);

        asnwer = (list.size() < nums.length / 2) ? list.size() : nums.length / 2;

        return asnwer;
    }
}
