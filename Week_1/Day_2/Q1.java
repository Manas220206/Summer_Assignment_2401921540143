import java.util.Scanner;

public class Q1 {

    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(sum, maxsum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Q1 obj = new Q1();
        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}