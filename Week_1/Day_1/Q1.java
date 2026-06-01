import java.util.*;

class Q1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int curr = nums[i];

            if (map.containsKey(target - curr)) {
                return new int[] { map.get(target - curr), i };
            }

            map.put(curr, i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Q1 sol = new Q1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}